package com.prod;



public class ReferenceExample {
	public static void main(String[] args) {
		// 참조타입 vs 기본(데이터)타입
		int num1 = 10; // 리터럴
		int num2 = 10; // int, double, long, float, char, boolean
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);
		
		String str1 = new String("hello"); // string str1 만 했을 때, str1에는 hello라는 값이 들어있지 않다.
		String str2 =new String("hello");  //숫자들의 경우, 별다른 조치없이 곧바로 변수에 값을 넣을 수 있다.
		// 문자를 비교할 때 숫자와 다른 점이, 숫자의 경우 같은 값일 경우 그 값을 저장하는 주소를 다른 변수들이 공유해 true를 나타낸다.
		// 반면 문자의 경우 같은 문자라 하더라도, 주소가 달라 다르다고 인식하여 false라 나온다.
		
		System.out.println(str1); // 주소값: ab121
		System.out.println(str2); // 주소값: ab3c19
		System.out.println(str1 == str2); //이렇게 주소값을 비교하면 false가 나옴.
		System.out.println(str1.equals(str2));
		// 주소로 찾아가서 각 변수가 가지는 값을 가져와서 비교한다.
		
		
		  
	}
}
