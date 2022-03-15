package com.dev;
import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		
		int num1, num2;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("두 수 num1, num2를 입력하세요");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		
		if(num1 - num2 > 0) {
			System.out.println("num1 가 num2 보다 " + (num1 - num2) + " 더 큽니다.");
		} else if(num1 - num2 < 0) {
			System.out.println("num2 가 num1 보다 " + (num2 - num1) + " 더 큽니다.");
		} else if (num1 == num2) {
			System.out.println("num1과 num2 가 같습니다.");
		}
		
		
	}

}
