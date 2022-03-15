package com.dev;
import java.util.Scanner;


public class ForExample6 {
	public static void main(String[] args) {
		
		int num1, num2;
		int a = 0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("두 개의 숫자를 입력해주세요.");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		
		for(int i = 1; i <= num2; i ++) {

			if(num1%i == 0 && num2%i == 0) {
				
				a = i;
				
			} else {
				
			}

		}
		
		System.out.println(a);
		
		scn.close();
	}
}
