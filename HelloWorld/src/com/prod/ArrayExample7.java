package com.prod;
import java.util.Scanner;


public class ArrayExample7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		int[] numbers = new int[2];

		System.out.println("첫 번째 값을 입력하세요.");
		numbers[0] = scn.nextInt();
		System.out.println("두 번째 값을 입력하세요.");
		numbers[1] = scn.nextInt();
	
		
		int[] temp1 = new int[2];
		
		temp1[0] = numbers[0];
		temp1[1] = numbers[1];
		
		numbers[0] = temp1[1];
		numbers[1] = temp1[0];
		
		
		System.out.println("바뀐 첫번째: " + numbers[0]);
		System.out.println("바뀐 두번째: " + numbers[1]);
		
		
		
		if(numbers[0] > numbers[1]) {
			System.out.println("첫 번째 값이 더 큽니다.");
		} else if(numbers[0] < numbers[1]){
			System.out.println("두 번째 값이 더 큽니다.");
		} else if(numbers[0] == numbers[1]) {
			System.out.println("값이 같습니다.");
		}
		
		
	}
}
