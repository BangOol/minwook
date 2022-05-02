package com.edu.community;

import java.util.List;

public interface CommunityService {
	public List<Community> totalList(); // 전체 리스트 출력

	public void register(Community com); // 내용 입력

	public void modify(Community com); // 제목, 내용 수정

	

	public List<Community> myCommunityList(Community com); // 내가 쓴 글 확인하기

	public void removeList(Community com); // 리스트 삭제

	public Community seeTheList(int i); // 리스트 내용 확인

// ==============================================

}
