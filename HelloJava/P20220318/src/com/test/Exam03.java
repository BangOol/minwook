package com.test;
import java.util.Scanner;

//문제3) 정수형배열 선언하고 사용자로 세개의 정수값을 입력받아서 배열에 저장. 제일 큰값을 구하는 코드를 작성.
public class Exam03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("3개의 수를 입력하세요");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int num3 = scn.nextInt();
		
		int[] num = { num1, num2, num3} ;
		
			
			if(num1 < num2 && num2 < num3) {
				System.out.println(num3);
			}else if(num1 < num3 && num3 < num2) {
				System.out.println(num2);
			}else if(num2 < num1 && num1 <num3) {
				System.out.println(num3);
			}else if(num2 < num3 && num3 < num1) {
				System.out.println(num1);
			}else if(num3 < num1 && num1 < num2) {
				System.out.println(num2);
			}else if(num3 < num2 && num2 < num1) {
				System.out.println(num1);
			}
			
			scn.close();
			
		} 
		
}
