package com.prod;

public class ArrayExample5 {
	public static void main(String[] args) {
		int[] numbers = {35, 22, 17, 40, 21, 16 , 46};
		
		// 홀수 번째에 있는 값들만 더해서 출력
		//
		
		int sumOdd = 0;
		int sumEven = 0;
		int  Oddcnt = 0;
		int Evencnt = 0;
		
		
		for(int i = 0; i < numbers.length; i ++) {
		
			if(numbers[i] % 2 == 1) {
				
				sumOdd += numbers[i];
				Oddcnt ++;
				
			} else {
				
				sumEven += numbers[i];
				Evencnt ++;
			}
		}
		
		
		double avgOdd = sumOdd / (double) Oddcnt;
		double avgEven = sumEven / (double) Evencnt;
		
		System.out.println("홀수의 합: " + sumOdd);
		System.out.println("짝수의 합: " + sumEven);
		
		System.out.print("홀수의 평균: ");
		System.out.printf("%.2f" , avgOdd);
		
		System.out.println(" ");
		
		System.out.print("짝수의 평균: ");
		System.out.printf("%.2f" , avgEven);
	}
}
