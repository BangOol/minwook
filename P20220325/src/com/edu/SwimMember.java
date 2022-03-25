package com.edu;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
	
	private String swimName = "홍길동";
	private String swimGrade;
	
	
	public String getSwimName() {
		return swimName;
	}
	public void setSwimName(String swimName) {
		this.swimName = swimName;
	}
	public String getSwimGrade() {
		return swimGrade;
	}
	public void setSwimGrade(String swimGrade) {
		this.swimGrade = swimGrade;
	}
	
	public SwimMember(String swimName, String swimGrade) {
		super();
		this.swimName = swimName;
		this.swimGrade = swimGrade;
	}
	public SwimMember(int memberId, String memberName, String memberPhone, String string, String grade) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
