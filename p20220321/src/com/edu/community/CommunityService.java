package com.edu.community;

import java.util.List;

public interface CommunityService {
	public List<Community> totalList(); // 전체 리스트 출력

	public void register(Community com); // 아이디, 비밀번호 입력 후 추가내용 입력

	public Community modify(Community com); // 아이디, 비밀번호 입력 후 제목, 내용 수정

	public void remove(Community com); // 아이디, 비밀번호 입력 후 삭제
	
	public void logIn(Community com); 
	
	public void makeAccount(Community com);
}
