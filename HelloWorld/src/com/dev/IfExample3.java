package com.dev;
import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int ranVal = (int)(Math.random() * 3) + 1 ; //ranVal 에 난수 생성 기능을 집어넣음.0~1 사이
		int ran;
		
		System.out.println("값을 넣으시겠습니까?");
		ran = scn.nextInt(); 
		
		if(ran == ranVal) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
		}
		
		scn.close();
	}
}
