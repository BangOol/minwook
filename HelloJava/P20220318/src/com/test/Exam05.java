package com.test;
import java.util.Scanner;

// 문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//      생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//      입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
public class Exam05 {
	
	static Scanner scn = new Scanner(System.in);
	static Book[] Books = new Book[100];
	
	
	public static void main(String[] args) {
		
		System.out.println("현재 선택 목록입니다.");
		
		while(true) {
			printMenu();
			int Button = scn.nextInt();
			
		if(Button == 1) {
			createAccount();
			} else if(Button == 2) {
				findBook();
			} else if(Button == 3) {
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
	}
	
	
	
	
	
	static void printMenu() {
		String menu = " 1. 책 등록 \r\n"
				+		"2. 등록된 책 조회 \r\n"
				+ 		"3. 종료 \r\n";
		System.out.println(menu);
	}
	
	
	static void createAccount() {
		System.out.println("책 제목을 등록하세요");
		String registerBookName = scn.next();
		System.out.println("책 저자를 등록하세요");
		String registerBookAuth = scn.next();
		
		System.out.println("책 출판사를 등록하세요");
		String registerBookCompany = scn.next();
		System.out.println("책 가격을 등록하세요");
		int registerBookPrice = scn.nextInt();
		
		Book account = new Book(registerBookName, registerBookAuth, registerBookCompany, registerBookPrice);
		
		for(int i = 0; i < Books.length; i++) {
			if(Books[i] != null) {
				Books[i] = account;
				System.out.println("등록완료되었습니다.");
				break;
			}
		}
		 
	
	}
	
	
	public static void findBook() {
		
		System.out.println("찾는 책의 제목을 입력해주세요");
		String findBookname = scn.next();
		
		
			
			Book findBooks = searchBook(findBookname);
			
			if(findBooks.getBookName().equals(findBookname)) {
				
				System.out.println("책 제목: " + findBooks.getBookName());
				System.out.println("책 저자: " + findBooks.getBookAuth());
				System.out.println("책 출판사: " + findBooks.getBookCompany());
				System.out.println("책 금액: " + findBooks.getBookPrice());
				return;
			} else if(findBooks == null){
				System.out.println("없는 계좌입니다.");
				return;
			}
		}
	
	
	
	
	public static Book searchBook(String BookName) {
		
		
		for(int i = 0; i <Books.length; i++) {
			
			if(Books[i] != null && Books[i].getBookName().equals(BookName)) {
				return Books[i];
			} 
		
		}
		return null;
	}
}

