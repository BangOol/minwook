package com.edu;

public class Variables {
	
	public static void main(String[] args) {
		// 변수: 메모리공간에 이름지정, 및 값을 할당
		int age = 20; // 20 == 30, 20과 30이같은지 비교하는 기호
		int num1 = 30;
		int num2 = 50;
		int result = num1 +num2;
		
		System.out.println(num1 + " + " + num2 +" = " + result);
		System.out.println("20 + 10 = 30");
		
		String name = "홍길동";
		name = "최민규";
		System.out.println(name + "의 나이는 " + age + "입니다.");
		
		final String myName= "전민욱"; //상수(Constance)
//		myName = "이가우";
		
		String tel = "010";
		int call1 = 8330;
		int call2 = 2939;
		String email = "yjg02211@naver.com";
		System.out.println("전민욱의 전화번호: " + tel + "-" + call1 + "-" + call2 + " 이고 이메일은 " + email + "입니다.");
		
	}

}