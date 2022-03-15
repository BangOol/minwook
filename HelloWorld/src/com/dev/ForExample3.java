package com.dev;
import java.util.Scanner;
public class ForExample3 {
	public static void main(String[] args) {
		// 입력받는 두 수를 num1, num2 라 하였을 때, num1, num2 (포함)사이에 있는 값을 더해서 출력하면서, 범위를 얘기해도록 한다.
		int num1, num2;
		int sum = 0;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("num1, num2의 값을 지정해주세요.");
		
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		
		
		for(int i = num1; i <= num2; i ++ ) {
			
			sum = sum + i; // 반복해서 숫자가 증감하는 부분은 보통 규칙이 있다.
;
		}
		
		
		System.out.println(num1 + "부터 " + num2 + " 까지의 총 합은 " + sum + "입니다.");
		scn.close();
		
	}
}
