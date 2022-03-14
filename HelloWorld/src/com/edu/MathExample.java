package com.edu;
import java.util.Scanner;

public class MathExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Double a, b;
		
		System.out.println("a의 값을 입력하세요");
		a = scn.nextDouble();
		System.out.println("b의 값을 입력하세요");
		b = scn.nextDouble();
		
		System.out.println("a와 b의 합은 " + (a+b) + "입니다.");
		System.out.println("a와 b의 차는 " + (a-b) + "입니다.");
		System.out.println("a와 b의 곱은 " + (a*b) + "입니다.");
		System.out.println("a와 b의 나눗셈은 " + (a/b) + "입니다.");
		System.out.println("a와 b의 나머지는 " + (a%b) + "입니다.");
		
		scn.close();
	}

}
