package com.dev;
import java.util.Scanner;


public class WhileExample4 {
	public static void main(String[] args) {
		// 은행 계좌를 만듬
		// 1: 입금 처리, 2: 출금 처리, 3: 종료
		// 입금일 경우 : 입금액을 입력하세요 라는 문구 출력 + account 라는 변수에 값을 누적.
		// 출금일 경우 : 출금액을 입력하세요 라는 문구 출력 + account 라는 변수에 값을 차감.
		// 종료일 경우 : 프로그램 종료.
		// while 구문으로 작성
		
		int account = 0;
		int tell;
		int inputVal = 0;

		Scanner scn = new Scanner(System.in);	
		
		
		while(true) {
			
			System.out.println("입금은 1번, 출금은 2번, 3번은 종료입니다.");
			tell = scn.nextInt();
					
			
			if	(tell == 1) {
				System.out.println("얼마나 입금하시겠습니까?");
				inputVal = scn.nextInt();
				account = account + inputVal;
				System.out.println("현재 금액은 " + account + "원 입니다.");

			}
			
			else if(tell == 2) {
				System.out.println("얼마나 출금하시겠습니까?");
				inputVal = scn.nextInt();
				account = account - inputVal;
				
				if(account < 0) {
					System.out.println("현재 잔액이 출금하려는 금액보다 적습니다.");
					account = account + inputVal;
				} else {
				System.out.println("현재 금액은 " + account + "원 입니다.");
				}
				
				
			}
			
			else if (tell == 3) {
				System.out.println("프로그램 종료.");
				break;
				
			}
			
		}
		
		System.out.println("현재 계좌 잔액은 " + account + "원 입니다.");
		scn.close();
	}
}

