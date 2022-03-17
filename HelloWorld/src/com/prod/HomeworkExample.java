package com.prod;


public class HomeworkExample {
	public static void main(String[] args) {
			
		
		Homework A = new Homework();
		
		A.setUserId("홍길동");
		A.setUserGrade("A");
		A.setUserPhone("010-1234-5678");
		A.setUserPoint(1300);
		
		Homework B = new Homework();
		
		B.setUserId("이길동");
		B.setUserGrade("A");
		B.setUserPhone("010-8511-4845");
		B.setUserPoint(1500);
		
		Homework C = new Homework();
		
		C.setUserId("김길동");
		C.setUserGrade("A");
		C.setUserPhone("010-8878-4545");
		C.setUserPoint(800);
		

		Homework[] users = {A, B, C};
		
		for(int i = 0; i < users.length; i++) {
			if(users[i].getUserPoint() >= 1000 && users[i].getUserGrade() == "A" ) {
				System.out.println("굿");
			}
		}
		
	
		
		
		
		
				


		
		
		// 유저 이름을 넣으면
		// 넣은 유저의 정보가 적합할 때
		// 출력이 되도록
		
		
		
		
		
		
		
		
		
		
		
	}
}
