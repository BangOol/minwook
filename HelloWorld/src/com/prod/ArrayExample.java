package com.prod;

public class ArrayExample {
	public static void main(String[] args) {
		int i1 = 100; // 4byte
		byte b1 = 127; // 1byte
		b1++; // 1/0 ~ 127
		b1++;
		
		short s1 = 100; // -32768 ~ -1 / 0 ~ 32767
		int a1 = 0; //약 21억
		long a2 = 1111l; //  만약 21억을 넘어가는 경우, 그것을 표시하기 위해 숫자 옆에 l을 붙임 
		// 8 byte 
		System.out.println(Long.MAX_VALUE);
		
		int sum = 0;
		int score1 = 80;
		int score2 = 90;
		int score3 = 85;
		int score4 = 95;
		int score5 = 88;
		
		sum += score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;
		
		double avg = sum / (double) 5;
		
		int[] scores = new int [5]; //int형 값을 5개 담을 수 있는 변수 scores
		
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 95;

		
		
		// 배열을 활용해서 sum -> avg
		
		sum = 0;
		for(int i = 0; i < 5; i++){
			sum += scores[i];
			System.out.println(scores[i]); // 비어있는 부분에 값을 넣지 않으면 int 타입의 경우 0으로 처리된다.
		}
		avg = sum / (double) 5;
		
		System.out.println("평균은 " + avg);
		
//		System.out.println(scores[0] + scores[1]);
//		for(int i=0; i < 5; i++) { 
//			System.out.println(scores[i]); // 값을 호출하기 위해서 사전에 정의를 해놓아야 한다...
		}
		

		
		
	
}
