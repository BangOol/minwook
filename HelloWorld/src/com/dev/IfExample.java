package com.dev;
import java.util.Scanner;

public class IfExample { // WhichExample : 두 단어가 조합된 경우 , firstName, first_name
	public static void main(String[] args) {
		// 조건문 if ..
		//60 점 이사이면 pass
		Scanner scn = new Scanner(System.in);
		int score;
		
		System.out.println("당신의 점수는 몇 점인가요?");
		score =scn.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("조금만 더 하시면 될 것 같네요.");
		}
		
		//90점 이상이면 A, 80점 이사이면 B, 70점 이상이면 C, 60점 이상이면 D, 그 외 F
		
		if(score>=90  && score < 100) {
			if( score >= 95 && score < 100) {
				System.out.println("A+입니다.");
			} else {
			System.out.println("A입니다.");
			}
		} else if( score >= 80 && score < 90) {
			if(score >= 85 && score <90) {
				System.out.println("B+입니다.");
			} else {
			System.out.println("B입니다.");
			}
			
		} else if( score >= 70 && score < 80) {
			if(score >= 75 && score <80) {
				System.out.println("C+입니다.");
			} else {
			System.out.println("C입니다.");
			}
			
		} else if( score >= 60 && score < 70) {
			if(score >= 65 && score <70) {
				System.out.println("D+입니다.");
			} else {
			System.out.println("D입니다.");
			}
		} else {
			System.out.println("F입니다.");
		}
		System.out.println("end of Program");
		
		scn.close();
	}
}
