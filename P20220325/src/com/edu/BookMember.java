package com.edu;

public class BookMember extends Member {
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)

	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실

	private String bookName = "홍킬동";
	private String bookGrade;
	

	public BookMember(int memberId, String memberName, String phone, String bookName, String bookGrade) {
		super(memberId, memberName, phone);
		this.bookGrade = bookGrade;
		this.bookName = bookName;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		String info = super.toString();
		info +=  "BookMember [bookName=" + bookName + ", bookGrade=" + bookGrade+ "]";
		return info;
	}

	

}
