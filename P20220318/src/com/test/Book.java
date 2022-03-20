package com.test;

public class Book {

	private String bookName;
	private String bookAuth;
	private String bookCompany;
	private int bookPrice;
	
	
	
	public Book(String bookName, String bookAuth, String bookCompany, int bookPrice) {
		this.bookName = bookName;
		this.bookAuth = bookAuth;
		this.bookCompany = bookCompany;
		this.bookPrice = bookPrice;
	}



	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookAuth() {
		return bookAuth;
	}


	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}


	public String getBookCompany() {
		return bookCompany;
	}


	public void setBookCompany(String bookCompany) {
		this.bookCompany = bookCompany;
	}


	public int getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}



	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}
	
	
	
	
	
	
	
}
