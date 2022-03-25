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
	
	public BookMember(String bookName, String bookGrade) {
		super();
		this.bookName = bookName;
		this.bookGrade = bookGrade;
	}
	public BookMember(int memberId, String memberName, String memberPhone, String string, String grade) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
