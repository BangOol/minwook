package com.dev;
import java.util.Scanner;

public class SwitchExample2 {
	public static void main(String[] args) {
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 그 외 F
		Scanner scn = new Scanner(System.in);
		int score; // 하나의 값으로 표현해야 한다...

		
		
		System.out.println("당신의 점수는 몇 점인가요?");
		score = scn.nextInt();
		int Value = (int)(score / 10);
		
		switch(Value) {
		case 10:
			
		case 9:
			System.out.println("A입니다.");
			break;
			
		case 8:
			System.out.println("B입니다.");
			break;
			
		case 7:
			System.out.println("C입니다.");
			break;
			
		case 6:
			System.out.println("D입니다.");
			break;
			
		case 5:
			
		case 4:
			
		case 3:

		case 2:

		case 1:
			System.out.println("F입니다.");
			break;
			
		}
		 
		scn.close();
	}
}
