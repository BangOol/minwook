package com.dev;
import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		// 입력을 계속 입력할 수 있도록 scanner 사용
		// -1 값을 입력하면 입력하는 작업을 멈추겠다는 기능사용.
		// sum 을 이용하여 이제껏 입력한 값들을 다 더하고 출력.
		Scanner scn = new Scanner(System.in);
		
		int inputVal;
		int sum = 0;
		
		System.out.println("값을 입력해주세요");
		System.out.println("단, -1을 누르게 된다면, 입력이 중단됩니다.");
		
		
		while(true) {
			inputVal = scn.nextInt();
			sum = sum + inputVal;
			
			
			if(inputVal == (-1)) {
				System.out.println("입력을 중단하였습니다.");
				break;
				
			} else {
				System.out.println("sum: " + sum);
			}
			
		}
		
		
		System.out.println("지금까지의 합계는 " + (sum + 1) + " 입니다.");
		
		scn.close();
		
		
		
	}
}
