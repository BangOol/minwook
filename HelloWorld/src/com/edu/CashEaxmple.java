package com.edu;
import java.util.Scanner;

public class CashEaxmple {
	public static void main(String[] args) {
		// 2개 값을 입력.
		Scanner scn = new Scanner(System.in);
		
		int price, cash;
		// 가격 입력
		price = scn.nextInt(); 
		
		// 손님이 낸 금액
		cash = scn.nextInt();
		
		int VAX = (int) (price * (1.1)); // 이렇게 전체 값에다가 int를 넣어주면 된다. 기억해주자
		int cashback = cash -VAX;
		
		//하나는 상품의 부가세를 계산하고, 나머지는 거스름돈
		//부가세 : 10% 추가, 
		
		System.out.println("손님이 내신 돈은 " + cash + "원이고, 물건값은 부가세 포함 " + VAX + "원이며, 거스름돈으로 " + cashback + "원 드리겠습니다.");
		
		scn.close();
	}

}
