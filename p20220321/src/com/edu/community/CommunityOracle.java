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



		
		conn = getConnect();

		// 쿼리문 작성
		String sql = "INSERT INTO community_info(community_count, community_id, community_password, community_name, community_contents, community_time) "
				+ "values((SELECT MAX(community_count)+1 FROM community_info) , ?, ?,?, ?, (TO_CHAR(sysdate, 'yyyy-mm-dd hh24:mi:ss')))";
				
		// sql 구문에서 comunity_count MAX() + 1 표현식 사용하여 자동으로 가장 높은 숫자를 가지도록 설정.
		// 원래는 primary key를 count에서 nickname으로 바꾸려 하였으나, 추가로 글을 쓸 수 없기에 취소함.
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, com.getCommunityId());
			psmt.setString(2, com.getCommunityPassword());
			psmt.setString(3, com.getCommunityName());
			psmt.setString(4, com.getCommunityContents());
			// sql 시간 값에서 자체적으로 해결할 수 있도록, default 값을 주었음.
			int r = psmt.executeUpdate();
			
			System.out.println(r + "건 입력완료");
			

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
				+ "    where community_count = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, com.getCommunityName());
			psmt.setString(2, com.getCommunityContents());
			psmt.setInt(3, com.getCommunityCount());
			
			int r = psmt.executeUpdate();
			System.out.println("수정되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeAccount(Community com) {
		
		conn = getConnect();
		
		// 쿼리문 작성: 아이디와 비밀번호가 존재할 때, 게시글을 삭제할 수 있도록. 단, 첫 번째 게시물은 삭제하지 못하도록. 그건 회원탈퇴에서
		// 써야함.
		// 삭제하고 사라진 게시글에 맞추어서 count도 줄어들텐데, 그러면 값이 충돌해서 primary key가 겹칠 수 있지 않을까?
		String sql = "DELETE FROM community_info "
				+ "WHERE community_id = ? AND community_password = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, com.getCommunityId());
			psmt.setString(2, com.getCommunityPassword());
			
			int r = psmt.executeUpdate();
			System.out.println("그동안 이용해주셔서 감사합니다.");
			
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

	

		conn = getConnect();

		String sql = "insert into community_info(community_count, community_id, community_password, "
				+ "community_name, community_contents, community_time) "
				+ "values((SELECT MAX(community_count)+1 FROM community_info), ?, ?, '가입을 축하드립니다!', '가입을 축하드립니다. 아마도?', (TO_CHAR(sysdate, 'yyyy-mm-dd hh24:mi:ss')))";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, com.getCommunityId());
			psmt.setString(2, com.getCommunityPassword());

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

		conn = getConnect();
		String sql = "SELECT * FROM community_info   "
				+ "WHERE community_id = ? AND community_password = ?  "
				+ "ORDER BY 1";
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, com.getCommunityId());
			psmt.setString(2, com.getCommunityPassword());
			
			rs = psmt.executeQuery();

			while (rs.next()) {
				com = new Community();
				com.setCommunityCount(rs.getInt("community_count"));
				com.setCommunityName(rs.getString("community_name"));
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
	public void removeList(Community com) {
		conn = getConnect();
		
		String sql = "DELETE FROM community_info "
				+ "WHERE community_count = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, com.getCommunityCount());
			
			rs = psmt.executeQuery();
			System.out.println("삭제완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	
	
}

// 0. 메뉴 정렬

// 1. 전체 게시글 출력
// 1-1. 게시글 출력 화면 정렬
// 1-2. 게시글 당일에는 시간까지 출력, 하루가 지나면 년 월 일만 뜨도록 설정

// 2. 게시글 작성
// 2-1. 댓글 달기
// 2-1-1. 메뉴 출력
// 2-1-2. 로그인
// 2-1-3. 댓글
// 2-1-4. 조회수

// 3. 게시글 수정

// 4. 게시글 삭제

// 5. 회원가입

// 6. 회원탈퇴

// 7. 내 글 확인
