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

		// 자바 - sql 간 시간 연동이 안되서 추가 코드를 써야 함.
		conn = getConnect();

		// 쿼리문 작성
		String sql = "insert into community_info(community_count, community_id, community_password, "
				+ "community_name, community_contents, community_time) " + "values(?, ?, ?, ?, ?, default)";

		try {
			psmt = conn.prepareStatement(sql);

			for (int i = 0; i < b; i++) {
				if (community.get(i) != null) {
					
				} else {
					b = i;
					return;
				}
				//정상적인 값을 넣었을 때는 카운트가 됨.
			}

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
	public Community modify(Community com) {
		return null;
	}

	@Override
	public void remove(Community com) {
		// 연결
		conn = getConnect();
		// 쿼리문 작성: 아이디와 비밀번호가 존재할 때, 게시글을 삭제할 수 있도록. 단, 첫 번째 게시물은 삭제하지 못하도록. 그건 회원탈퇴에서
		// 써야함.
		// 삭제하고 사라진 게시글에 맞추어서 count도 줄어들텐데, 그러면 값이 충돌해서 primary key가 겹칠 수 있지 않을까?
		String sql = "";
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
}
