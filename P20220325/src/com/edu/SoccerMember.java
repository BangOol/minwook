package com.edu;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)

	// 정보출력시 => 코치이름: 홍길동, 락커룸: A

	private String soccerName = "호갈두";
	private String soccerGrade;

	
	public SoccerMember(int memberId, String memberName, String phone, String soccerName, String soccerGrade) {
		super(memberId, memberName, phone);
		this.soccerName = soccerName;
		this.soccerGrade = soccerGrade;
	}

	

	@Override
	public String toString() {
		String info = super.toString();
		info += "soccerMember [soccerName=" + soccerName + ", soccerGrade=" + soccerGrade + "]";
		return info;
	}
	

}
