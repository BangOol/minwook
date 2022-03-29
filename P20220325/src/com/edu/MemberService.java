package com.edu;

import java.util.List;

public interface MemberService {
	public void addMember(Member member); // 회원추가.
	public void modifyMember(Member member); // 회원정보수정.
	public List<Member> memberList(); // 회원리스트.
	public void searchName(String name); // 이름으로 검색
	public void saveToFile(); // 파일 저장
}
