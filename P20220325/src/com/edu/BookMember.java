package com.edu;

public class BookMember extends Member {
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
	
	private String bookName = "홍킬동";
	private String bookGrade;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookGrade() {
		return bookGrade;
	}
	public void setBookGrade(String bookGrade) {
		this.bookGrade = bookGrade;
	}
	
	@Override
	public String toString() {
		return "BookMember [bookName=" + bookName + ", bookGrade=" + bookGrade + ", toString()=" + super.toString()
				+ "]";
	}
	public BookMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookMember(int memberId, String memberName, String phone, String bookName ,String bookGrade ) {
		super(memberId, memberName, phone);
		this.bookGrade = bookGrade;
		this.bookName = bookName;
		// TODO Auto-generated constructor stub
	}
	
	
	
}
