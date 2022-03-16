package com.prod;

public class ArrayExample4 {
	public static void main(String[] args) {
		
		int[] numbers = {35, 22, 17, 40, 281, 16 , 846};
		int sum = 0;
		int cnt = 0;
		
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				sum += numbers[i];
				System.out.println(numbers[i]);
				cnt++;
			} else {
				
			}
		}
		
		double avg = sum / (double) cnt;
		System.out.println("짝수의 합은 " + sum);
		System.out.println("짝수의 평균은 " + avg);
		
	}
}
