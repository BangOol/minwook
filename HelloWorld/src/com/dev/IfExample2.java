package com.dev;
import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		// Scanner 사용 및 물건가격이 50000원 이상이면 배송비 0
		// 물건 가격이 5만원 이하일 때 배송비 3000
		// 결제할 금액이 얼마인지를 보여주는 코드.
		int ans, price;
		int dri = 3000;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("물건의 가격이 얼마인가요?");
		ans = scn.nextInt();
		
		 ans =(ans >= 50000) ? ans : ans + dri;
		// price 가 50000원 이상인지 아닌지에 따라서 결과값이 달라지는 명령문
		
//		if(ans >= 50000) {
//			price = ans;		
//		} else {		
//			price = ans + dri;			
//		}
		
		System.out.println("총 금액은 " + ans + "원 입니다.");
		
		scn.close();
	}
}
