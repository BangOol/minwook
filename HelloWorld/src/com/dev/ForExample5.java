package com.dev;
import java.util.Scanner;


public class ForExample5 {
	public static void main(String[] args) {
	
		int num;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("넣고자 하는 숫자를 기입해 주세요.");
		num = scn.nextInt();
		System.out.println("이 숫자를 나눌 수 있는 약수: ");
		
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			} else {
				
			}
		}
		
		scn.close();
		
	}
}
