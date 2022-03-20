package com.test;

//문제1) 정수형 변수 num1, num2 를 선언하고 두 수 중에서 큰 수에서 작은 수를 뺀 결과를 저장하는 변수 result.
public class Exam01 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		
		int result = num1 - num2;
		
		if(result > 0) {	// num1 > num2
			System.out.println(result);
			System.out.println("num1 이 num2보다 더 큽니다.");
		} else {
			result = num2 - num1;
			System.out.println(result);
			System.out.println("num2 이 num1보다 더 큽니다.");
		}
	}
}
