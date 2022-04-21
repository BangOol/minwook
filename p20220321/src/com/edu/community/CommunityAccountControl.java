package com.edu.community;

public interface CommunityAccountControl {
	public void makeAccount(Community com); // 계정 생성

	public int checkAccount(Community com); // 아이디가 있는지 없는지 확인하기.

	public void changePassword(Community com);// 비밀번호 변경

	public Community changePW(Community com);

	public int logIn(Community com); // 존재하는 아이디, 비밀번호 확인
	
	public void removeAccount(Community com); // 삭제
}
