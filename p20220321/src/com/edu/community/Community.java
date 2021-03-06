package com.edu.community;

import java.io.Serializable;

public class Community implements Serializable{
	
	private String CommunityName;
	private String CommunityId;
	private String CommunityPassword;
	private String CommunityContents;
	private int CommunityCount;
	private String CommunityTime;
	
	
	public Community() {
	}
	public Community(String communityName, String communityId, String communityPassword, String communityContents,
			int communityCount, String communityTime) {
		super();
		CommunityName = communityName;
		CommunityId = communityId;
		CommunityPassword = communityPassword;
		CommunityContents = communityContents;
		CommunityCount = communityCount;
		CommunityTime = communityTime;
	}
	public String getCommunityName() {
		return CommunityName;
	}
	public void setCommunityName(String communityName) {
		CommunityName = communityName;
	}
	public String getCommunityId() {
		return CommunityId;
	}
	public void setCommunityId(String communityId) {
		CommunityId = communityId;
	}
	public String getCommunityPassword() {
		return CommunityPassword;
	}
	public void setCommunityPassword(String communityPassword) {
		CommunityPassword = communityPassword;
	}
	public String getCommunityContents() {
		return CommunityContents;
	}
	public void setCommunityContents(String communityContents) {
		CommunityContents = communityContents;
	}
	public int getCommunityCount() {
		return CommunityCount;
	}
	public void setCommunityCount(int communityCount) {
		CommunityCount = communityCount;
	}
	public String getCommunityTime() {
		return CommunityTime;
	}
	public void setCommunityTime(String communityTime) {
		CommunityTime = communityTime;
	}
	@Override
	public String toString() {
		return "게시판 [번호 =" + CommunityCount 
				+ " 제목 =" + CommunityName
				+ " 작성시간 =" + CommunityTime + "]";
	}
	
	public String checkList() {
		return "[번호 = " + CommunityCount 
				+ " 제목 =" + CommunityName
				+ "]";
		
	}
	
	public String seeList() {
		return "제목: " + CommunityName + "\r\n" 
				+"시간: " + CommunityTime + "\r\n"
				+"내용: " + CommunityContents; 
	
	}
	
	public String AccountList() {
		return "[아이디 = " + CommunityId 
				+ " 비밀번호 =" + CommunityPassword
				+ "]";
		
	}
	
}
