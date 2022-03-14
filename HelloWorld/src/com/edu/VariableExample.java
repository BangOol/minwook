package com.edu;

public class VariableExample {
	public static void main(String[] args) {
//		변수의 타입.
		 int num1 = 100; // int
		 double num2 = 100.5; //double: 소수점까지 표현.
		 double result = num1 * num2; 
		 //숫자상으로 int 부분이 더 클지라도, 데이터 타입은 double이 더 크다. 그렇기에 double 타입 기준을 결과를 도출.
		 // 곱이나 나눗셈을 하기 위해서는 각 변수의 데이터 타입을 알아야 한다.
		 // 단, 강제로 형변환을 시켜주는 방법이 있는데, 이것을 명시적 형변환이라 한다.
		 // 암시적 형변환 = 자동형변환(promotion): 작은범위 -> 큰범위
		 // 명시적 형변환 = 강제형변환(casting) : 큰 범위 -> 작은범위
		 System.out.println("결과: " + result);
		 
		 int val1 = 100;
		 double val2 = 20.5;
		 int sum = val1 + (int)val2; //(int): int 타입으로 강제 변환
		 System.out.println("결과: " + sum);
		 
		 int n1 = 10;
		 int n2 = 4;
		 
		int n3 = n1/n2; 
		// 10/4 => 2.5 는 정수/정수 이기에 int 사용
		// double로 사용해도 같은 결과가 나옴. 이미 정수/정수 결과값을 double 타입으로 변환한 것밖에 되지 않음.
		// 그래서 n1, n2의 데이터 타입을 int 에서 double로 바꿔주었을 때 우리가 원하는 2.5 가 나오게 된다.
		System.out.println("나눈 결과: " + n3);
		
		// 10을 3으로 나눈 나머지 => 1
		int n4 = n1 % n2;
		System.out.println("나머지: " + n4);
		
		//짝수, 홀수 구하는 방법
		if(n1 % 2 ==0) {
			System.out.println(n1 + "의 값은 짝수입니다.");
			if(n1 % 2!=0){
				System.out.println(n1 +"의 값은 홀수입니다.");
			}
		}
	}
}
