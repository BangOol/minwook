package com.dev;
import java.util.Scanner;

public class ForExample4 {
	public static void main(String[] args) {
		// 1 ~ 10 까지 반복 중에서, 짝수의 값은 evenSum, 홀수의 값은 oddSum
		// 마지막 출력으로 홀수 합, 짝수 합 출력 
		
		int num1, num2;	
		int evenSum = 0;
		int oddSum = 0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("num1, num2의 값을 기입하세요.");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		// num 1 = 1 , num2 = 4
		for(int i = num1; i <= num2; i ++) {
			int sum = 0;
			sum = sum + i;
			if(sum % 2 == 0) {
				evenSum = evenSum + sum;
			} else{
				oddSum = oddSum + sum;
			}
		}
		
		System.out.println("짝수의 합은 " + evenSum + " 입니다.");
		System.out.println("홀수의 합은 " + oddSum + " 입니다.");
		
		scn.close();
		
		
	}
}
