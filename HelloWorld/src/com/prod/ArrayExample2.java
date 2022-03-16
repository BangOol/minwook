package com.prod;
import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		// ages -> int[2] 
		// [0] : 20살 기입
		// [1] : 23살 기입
		// [2] : 27살 기입
		//sumAge, int 타입,avgAge, double 타입
		Scanner scn = new Scanner(System.in);
		
		int[] ages = new int[3]; // 3은 3개의 칸이 있다는 거임.
		int sumAge = 0;
		double avgAge;
		
		System.out.println("3명의 나이를 입력해 주세요.");
		ages[0] = scn.nextInt();
		ages[1] = scn.nextInt();
		ages[2] = scn.nextInt();
		
		for(int i = 0; i <3; i++) {
			sumAge += ages[i];
		}
		avgAge = sumAge / (double) 3;
		System.out.println("나이의 합은 " + sumAge + " 입니다.");
		System.out.println("평균 나이는 " + avgAge + " 입니다.");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(ages[i] + "살 입니다.");
		}
		
		System.out.printf("%.2f", 33.33333 ); //printf는 기존의 println 과는 다른 기능이므로, 내용을 함부로 넣을 수 없다.
		
	}
}
