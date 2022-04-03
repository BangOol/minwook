package com.edu.community;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommunityOracle extends DAO implements CommunityService {
	List<Community> community = new ArrayList<Community>();

	@Override
	public List<Community> totalList() {
		List<Community> community = new ArrayList<Community>();

		// 연결 시작
		// getConnect()와 상관없이 반복되는 현상이 있었음.
		conn = getConnect();
		// 쿼리문 작성
		String sql = "SELECT * FROM community_info ORDER BY community_count";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				Community com = new Community();
				com.setCommunityCount(rs.getInt("community_count"));
				com.setCommunityName(rs.getString("community_name"));
				com.setCommunityId(rs.getString("community_id"));
				com.setCommunityTime(rs.getString("community_time"));

				community.add(com);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}

		return community;
	}

	@Override
	public void register(Community com) {
		CommunityService service = new CommunityOracle();
		List<Community> community = service.totalList();
		int b = community.size();
		System.out.println(b);
		// null 값으로 처리하고, 번호만 남겨놓으면 어떨까?
		

		// 자바 - sql 간 시간 연동이 안되서 추가 코드를 써야 함.
		conn = getConnect();

		// 쿼리문 작성
		String sql = "insert into community_info(community_count, community_id, community_password, "
				+ "community_name, community_contents, community_time) " + "values(?, ?, ?, ?, ?, default)";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, b); // 적용됨
			psmt.setString(2, com.getCommunityId());
			psmt.setString(3, com.getCommunityPassword());
			psmt.setString(4, com.getCommunityName());
			psmt.setString(5, com.getCommunityContents());
			// sql 시간 값에서 자체적으로 해결할 수 있도록, default 값을 주었음.
			int r = psmt.executeUpdate();
			System.out.println(r + "건 등록 완료");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}

	}

	@Override
	public void modify(Community com) {
		//연결
		conn = getConnect();
		
		// 그대로 하면, 인증받은 로그인과 비밀번호에 속해있는 모든 게시글의 내용이 변경된다.
		// 그렇기에 일단 아이디에 해당되는 게시글 번호, 제목을 보여주고
		// 그 중 변경하고자 하는 게시글 번호를 입력하였을 때, 수정이 되도록 해야 함.
		// 그렇다면 추가적인 메서드를 통해 내가 쓴 글을 볼 수 있는 메소드를 만들어야 한다.
		String sql = "update community_info "
				+ " set  community_name = ?, community_contents = ? "
				+ "    where community_id = ? , community_password = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, com.getCommunityName());
			psmt.setString(2, com.getCommunityContents());
			psmt.setString(3, com.getCommunityId());
			psmt.setString(4, com.getCommunityPassword());
			
			rs = psmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void remove(Community com) {
		// null 값으로 처리하고, 번호만 남겨놓으면 어떨까?
		// 나중에 null 값인 친구들 다 제거하고 자동 재배열이 되는게 나을까?
		// 그러면 나중에 100만개씩 쌓였을 떄, 일일이 다 처리하는게 힘들지 않을까?
		// 테이블을 좀 더 잘 다루면, 회원정보에 대한 테이블을 만들고 연동시켜서, 편리하게 할 수 있을텐데.
		CommunityService service = new CommunityOracle();
		List<Community> community = service.totalList();
		// 밖에서 로그인 개념으로 아이디, 비밀번호를 체크하고, 매개변수는 없이 진행할 수 있을 듯.
		// 연결
		// 로그인 메소드를 사용하면서 번호 값을 받아놓으면 되지 않을까?
		conn = getConnect();
		
		// 쿼리문 작성: 아이디와 비밀번호가 존재할 때, 게시글을 삭제할 수 있도록. 단, 첫 번째 게시물은 삭제하지 못하도록. 그건 회원탈퇴에서
		// 써야함.
		// 삭제하고 사라진 게시글에 맞추어서 count도 줄어들텐데, 그러면 값이 충돌해서 primary key가 겹칠 수 있지 않을까?
		String sql = "update community_info "
				+ "set community_id = 'null', community_password = 'null', "
				+ "    community_name = 'null', community_contents = 'null' "
				+ "    where community_count = ? ";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, com.getCommunityId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

	public int logIn(Community com) {
		// 연결
		conn = getConnect();
		// 쿼리문: 넣은 값의 아이디와 비밀번호가 있는지 없는지 확인
		String sql = "SELECT * " + "FROM community_info " + "WHERE community_id = ? and community_password =?";

		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, com.getCommunityId());
			psmt.setString(2, com.getCommunityPassword());
			r = psmt.executeUpdate();
			return r;
			// 메뉴로 다시 돌아가거나, 아이디와 비밀번호를 다시 입력하라고 하고 싶음.

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			disConnect();
		}
		return r;

	}

	@Override
	public void makeAccount(Community com) {
		CommunityService service = new CommunityOracle();
		List<Community> community = service.totalList();
		int b = community.size();
	

		conn = getConnect();

		String sql = "insert into community_info(community_count, community_id, community_password, "
				+ "community_name, community_contents, community_time) "
				+ "values(?, ?, ?, '가입을 축하드립니다!', '가입을 축하드립니다. 아마도?', default)";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, b);
			psmt.setString(2, com.getCommunityId());
			psmt.setString(3, com.getCommunityPassword());

			int r = psmt.executeUpdate();

			if (r == 1) {
				System.out.println("가입을 축하드립니다.");
			} else {
				System.out.println("고객센터에 문의해주세요.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}

		// list 만들고, 아이디와 비밀번호를 입력 후 쿼리문에 그 값을 넣는다.
		// 쿼리문은 아이디와 비밀번호를 등록하되, 그 값이 겹치면 안된다.
		// int r = rs.executeUpdate(); 를 이용하여 그 값이 0이 되었을 때 진행, 아니라면 disConnect()..?
		// 그리고 primary key가 게시글 번호이기 때문에, 가입을 완료하면 자동으로 회원 가입 문구를 출력하도록 쿼리를 짜자.
	}

	public int checkAccount(Community com) {

		// 연결
		conn = getConnect();
		// 쿼리문: 넣은 값의 아이디와 비밀번호가 있는지 없는지 확인
		String sql = "SELECT * " + "FROM community_info " + "WHERE community_id = ?";

		int r = 1;
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, com.getCommunityId());
			r = psmt.executeUpdate();
			// 메뉴로 다시 돌아가거나, 아이디와 비밀번호를 다시 입력하라고 하고 싶음.
			if (r == 0) {
				System.out.println("계속해서 진행합니다.");
				return 1;
			} else {
				System.out.println("중복되는 아이디가 존재합니다.");
				return 0;
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			disConnect();
		}
		return r;
	}
	
	public List<Community> myCommunityList(Community com) {
		List<Community> community = new ArrayList<Community>(); 
		//연결
		conn = getConnect();
		//쿼리문 작성
		String sql = "SELECT * " + "FROM community_info " + "WHERE community_id = ? and community_password =?";
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, com.getCommunityId());
			psmt.setString(2, com.getCommunityPassword());
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				Community comcom = new Community();
				comcom.setCommunityId(rs.getString("community_id"));
				
				community.add(comcom);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return community;
		
		

	}
	
}

// 1. 전체 게시글 출력
// 1-1. 게시글 출력 화면 깔끔하게 만들기 -java
// 1-2. 게시글 출력 화면 중 아이디와 비밀번호가 null값인 게시글 제외 출력 -java
// 1-3. 게시글 당일에는 시간까지 출력, 하루가 지나면 년월일만 뜨도록 하도록 만들기. -sql

// 2. 게시글 작성
// 2-1. 게시글 작성 중, 엔터를 부득이하게 치는 부분 개선 - java
// 2-2. 게시글 작성 중, primary key인 게시글 번호 대체제 찾기 -sql

// 3. 게시글 수정
// 3-1. logIn, checkAccount method를 통해 확인 후, update 쿼리문을 통해 제목과 내용 수정 -sql

// 4. 게시글 삭제
// 4-1. 일단 null값으로 처리하긴 했지만, 게시글 작성 시 게시글 번호 사이 빈 부분을 찾아서 넣을 수 있다면 -sql
// 4-2. delete 를 사용하여 지정한 아이디와 비밀번호가 포함된 글 전체를 삭제할 수 있또록 작성.


// 5. 로그인
// 5-1. 로그인 시 닉네임을 설정하도록 하고, 이것을 primary key로 잡아버리자.
// 5-2. 그래서 게시글 번호를 if문을 사용하여 겹치는 일이 없게끔 하는거지.