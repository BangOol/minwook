package com.edu.community;

import java.util.List;

public interface CommunityServiceAdmin {

public int logInAdmin(Community com); // 관리자 로그인
	
	public void removeListAdmin(Community com); // 관리자 권한 글 삭제
	
	public void modifyAdmin(Community com); // 관리자 권한 글 수정
	
	public List<Community> searchAccount(); // 관리자 권한 계정 찾기
	
}
