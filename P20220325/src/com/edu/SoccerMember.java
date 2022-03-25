package com.edu;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
	
	private String soccerName = "호갈두";
	private String soccerGrade;
	
	
	public String getSoccerName() {
		return soccerName;
	}
	public void setSoccerName(String soccerName) {
		this.soccerName = soccerName;
	}
	public String getSoccerGrade() {
		return soccerGrade;
	}
	public void setSoccerGrade(String soccerGrade) {
		this.soccerGrade = soccerGrade;
	}
	
	public SoccerMember(int memberId, String memberName, String phone, String soccerGrade) {
		super(memberId, memberName, phone);
		this.soccerGrade = soccerGrade;
	}
	
	
	public SoccerMember(int memberId, String memberName, String phone, String soccerName, String soccerGrade) {
		super(memberId, memberName, phone);
		this.soccerName = soccerName;
		this.soccerGrade = soccerGrade;
	}
	public SoccerMember(String soccerName, String soccerGrade) {
		super();
		this.soccerName = soccerName;
		this.soccerGrade = soccerGrade;
	}
	
	
	
	
}
