package com.edu.community;

import java.util.List;

public interface CommunityService {
	public List<Community> totalList(); // 전체 리스트 출력

	public void register(Community com); // 아이디, 비밀번호 입력 후 추가내용 입력

	public void modify(Community com); // 아이디, 비밀번호 입력 후 제목, 내용 수정

	public void remove(Community com); // 아이디, 비밀번호 입력 후 삭제
	
	public int logIn(Community com); // 존재하는 아이디, 비밀번호 확인
	
	public void makeAccount(Community com); // 계정 생성
	
	public int checkAccount(Community com); // 아이디가 있는지 없는지 확인하기.
	
	public List<Community> myCommunityList(Community com); // 내가 쓴 글 확인하기
	
	// 비밀번호 바꾸기 메서드
	
}
