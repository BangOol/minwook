package com.prod;
import java.util.Scanner;


public class ArrayExample6 {
	public static void main(String[] args) {
		// 배열의 값이 30보다 크고 40보다 작은 값의 합, 평균
		Scanner scn = new Scanner(System.in);
		
		int[] numbers = {35, 22, 17, 40, 21, 16 , 46};
		
		int sum = 0;
		int cnt = 0;
		
		System.out.println("num1, num2의 값을 설정하세요. 단, num2의 값이 더 커야 합니다.");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		for(int i = 0; i <numbers.length; i++ ) {
			if(numbers[i] >= num1 && numbers[i] <= num2 ) {
				
				System.out.println("지정된 값: " + numbers[i]);
				sum += numbers[i];
				cnt ++;
				
			}
		}
		
		double avg = sum / (double) cnt;
		
		System.out.print("총 합: " + sum);
		System.out.println(" ");
		
		System.out.print("평균: ");
		System.out.printf("%.2f" , avg);
		
	}
}
