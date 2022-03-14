package com.edu;

import java.util.Scanner;

public class ScannerExample { //com.deu.ScannerExample
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //키보드로 입력한 값을 스캔한다?
		
		System.out.println("첫 번째 숫자를 입력하세요..");
		int val =scn.nextInt(); //사용자가 키보드로 숫자를 입력해야 종료되는 형식
		
		System.out.println("두 번째 숫자를 입력하세요..");
		int val2 =scn.nextInt(); 
		
		int sum = val + val2;
		
		System.out.println("입력값은 " + sum + "입니다.");
//		 val1 과 val2를 그냥 더했을 때, 문자로 취급되어 3과 5를 입력시 35가 출력된다. 그렇기에 괄호를 추가해야 한다.
		
		if(sum % 2 == 0) { //
			System.out.println("짝수입니다.");	
		}
		if(sum % 2!= 0){
			System.out.println("홀수입니다.");
		}
		
		
		
		scn.close();
		
	}
}
