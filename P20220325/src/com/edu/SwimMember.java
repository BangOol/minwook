package com.edu;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)

	// 정보출력시 => 강사이름: 홍길동, 등급: A

	private String swimName = "홍길동";
	private String swimGrade;


	public SwimMember(int memberId, String memberName, String memberPhone, String swimName, String swimGrade) {
		// TODO Auto-generated constructor stub
		super(memberId, memberName, memberPhone);
		this.swimName = swimName;
		this.swimGrade = swimGrade;
	}



	@Override
	public String toString() {
		String info = super.toString();
		info += "swimMember [swimName=" + swimName + ", swimGrade=" + swimGrade + "]";
		return info;
	}
	
}
