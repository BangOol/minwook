package com.edu.community;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommunityOracle extends DAO implements CommunityService{
	List<Community> community = new ArrayList<Community>();
	
	
	
	@Override
	public List<Community> totalList() {
		List<Community> community = new ArrayList<Community>();
		
		//연결 시작
		// getConnect()와 상관없이 반복되는 현상이 있었음.
		conn = getConnect();
		//쿼리문 작성
		String sql = "SELECT * FROM community_info ";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
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
		
		// 자바 - sql 간 시간 연동이 안되서 추가 코드를 써야 함.
		java.util.Date dt = new java.util.Date();
		java.sql.Date date = new java.sql.Date(dt.getTime());
		//연결
		conn = getConnect();
		//쿼리문 작성
		String sql = "insert into community_info(community_count, community_id, community_password, "
				+ "community_name, community_contents, community_time) "
				+ "values(?, ?, ?, ?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			int a = community.size();
			psmt.setInt(1, a);
			psmt.setString(2, com.getCommunityId());
			psmt.setString(3, com.getCommunityPassword());
			psmt.setString(4, com.getCommunityName());
			psmt.setString(5, com.getCommunityContents());
			psmt.setDate(6, date);
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 등록 완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Community modify(Community com) {
		return null;
	}

	@Override
	public void remove(Community com) {
		
	}

	public void logIn(Community com) {
		
		for(int i=0; i<community.size(); i++) {
			Community id = community.get(i);
			if(id.getCommunityId().equals(com.getCommunityId()) && community.equals(com.getCommunityPassword())) {
				System.out.println("로그인이 완료되었습니다. 계속 진행하세요.");
			} else {
				System.out.println("잘못 입력하셨습니다.");
				
			}
		}
	}

	@Override
	public void makeAccount(Community com) {
		List<Community> list = new ArrayList<Community>();
		
	}
}
