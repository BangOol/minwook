package com.dev;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
	
//		int i = 1;
//		while( i <= 5) {
//			System.out.println("i의 값 " + i);
//			i++;
//		}
//		
//		System.out.println("end of program");
		
//		int num = 0;
//		
//		while(true) {
//			System.out.println(num);
//			num++;
//			if(num > 5) {
//				break; // 반복문 탈출
//			}
//		}
//		
//		while(true) {
//			int rand = (int)(Math.random() * 10 + 1);
//			System.out.println("임의의 생성된 값: " + rand);
//			if(rand == 8) {
//				break;
//			}
//		}
//		
		
		//수를 맞출 때까지 계속 반복..
		
		Scanner scn = new Scanner(System.in);
		
		int i;
		System.out.println("숫자를 입력하세요.");
		i = scn.nextInt();
		
		while(true) {
			int rand1 =(int)(Math.random()*i + 1);
			int rand2 =(int)(Math.random()*i + 1);
			System.out.println("rand1: " + rand1);
			System.out.println("rand2: " + rand2);
			if(rand1 == rand2) {
				System.out.println("rand1과 rand2의 값이 " + rand1 + "으로 같습니다.");
				break;
			}
		}
		System.out.println("end");
	}
}
