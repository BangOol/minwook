package com.prod;

public class BookExample {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.title = "난쟁이가 쏘아올린 작은 공";
		b1.auth = "황순원";
		b1.com = "동아출판사";
		b1.price = 13000;
		
		Book b2 = new Book();
		
		b2.title = "데미안";
		b2.auth = "헤르만 헤세";
		b2.com = "동아출판사";
		b2.price = 8000;
		
		
		Book b3 = new Book();
		
		b3.title = "혼공자";
		b3.auth = "신용권";
		b3.com = "한빛미디어";
		b3.price = 24000;
		
		Book[] books = {b1, b2 ,b3};
		
		
		
		for(int i = 0; i < books.length; i++) {
			if(books[i].price <20000) {
			System.out.println("제목: " + books[i].title);
			System.out.println("저자: " + books[i].auth);
			System.out.println("출판사: " + books[i].com);
			System.out.println("가격: " + books[i].price);
			System.out.println("===================================");
			}
		}
	}
}
