package com.edu.api;

public class SystemExample {
	public static void main(String[] args) {
		System.out.println("start");
//		System.exit(0); // 프로그램 강제 종료
		System.out.println("end");

		long currentTime = System.currentTimeMillis(); // 현재 시간을 1970.1.1
		System.out.println(currentTime);
		long days = currentTime / (24*60*60*1000);
		long years = days / 365;
		
		currentTime = System.currentTimeMillis();
		long sum = 0;
		for(int i = 0; i <1000000; i++) {
			sum+= i;
		}
		System.out.println("summary: " + sum);
		long endTime = System.currentTimeMillis();
		
		System.out.println("연산에 걸린 시간: " + (endTime - currentTime));
	}
}
