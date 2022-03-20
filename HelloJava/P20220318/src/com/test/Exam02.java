package com.test;
import java.util.Scanner;


//문제2) 정수형 변수 n1, n2를 선언하고 Scanner 클래스를 통하여 두정수를 입력받은 후 큰수에서 작은 수를 나눈 결과값을 소수점 첫번째까지 구하는 기능 작성. 
public class Exam02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫 번째 값을 입력하세요");
		int num1 = scn.nextInt();
		System.out.println("두 번째 값을 입력하세요");
		int num2 = scn.nextInt();
		
		double result = num1 /(double) num2;
		
		if(num1 > num2) {					
			System.out.printf("%.1f", result); 
			System.out.println(); 
		} else if(num2 > num1){ 
			result = num2 /(double) num1; 
			System.out.printf("%.1f", result); 
			System.out.println();
		} else { 
			System.out.println("num1과 num2의값이 같습니다."); 
		} 
		 
		
		scn.close();
		
	}
}
