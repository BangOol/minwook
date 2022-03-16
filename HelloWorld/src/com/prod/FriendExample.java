package com.prod;

public class FriendExample {
	public static void main(String[] args) {
		//친구의 정보(이름, 전화번호, 이메일, 키, 몸무게)
		
		Friend f1 = new Friend(); // f1이라는 이름을 가진 변수는 Friend 클래스를 이용하여 정의된다.
		
		f1.friendName = "홍길동";
		f1.friendPhone = "010-8465-1234";
		f1.email = "qlkwn2222@naver.com";
		f1.height = 173.2;
		f1.weight = 70.7;
		
		Friend f2 = new Friend();
				
		f2.friendName = "홍홍홍";
		f2.friendPhone = "010-1234-7896";
		f2.email = "qlkn21233@gmail.com";
		f2.height = 173.8;
		f2.weight = 86.2;
		 
		Friend f3 =new Friend();
		
		f3.friendName = "동동동";
		f3.friendPhone = "010-4871-5111";
		f3.email = "qlqkwn222222@naver.com";
		f3.height = 146.2;
		f3.weight = 44.2;
		
		
		// friends 라는 이름을 가진 배열 안에 f1, f2,f3이 들어간다.
		Friend[] friends = {f1, f2, f3};
		
		System.out.println(f1);
		// 이렇게 했을 때, 실제 위치를 표기해준다. 그 안의 값들을 나열하는 것이 아님.
		
		for(int i = 0; i < friends.length; i++) {
			if(friends[i].height > 170) {
			System.out.println("이름: " + friends[i].friendName);
			System.out.println("전화번호: " + friends[i].friendPhone);
			System.out.println("키: " + friends[i].height);
			System.out.println("===================================");
			}
			
			
		}
		
	}
}
