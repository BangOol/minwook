package com.dev;
import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		// while문으로 1 ~ 10 까지의 수 중에서 짝수만 출력
		
		Scanner scn = new Scanner(System.in);
		int num1, num2;
		int num = 0;
		int i = 0;
		
		System.out.println("두 수를 골라주세요.");
		num1 = scn.nextInt();
		num2 = scn.nextInt();

		
		
		while(num <= num2) {

			num = num1 + i;

			if(i >= num2) {
				break;
				
			} else if(num % 2 != 0) {
				i++;
			} else if(num % 2 == 0){
				System.out.println("짝수: " + num);
				i++;
			}
			
		}
		
		scn.close();
	}
}
