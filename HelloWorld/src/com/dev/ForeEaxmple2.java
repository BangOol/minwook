package com.dev;

public class ForeEaxmple2 {
	public static void main(String[] args) {
		//for 반복문으로
		int sum = 0;
		int lastCnt = 20;
		int startCnt = 11;

		for(int i = startCnt; i <= lastCnt; i++ ) {
			if(i % 2 == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
	
		System.out.println("짝수의 합:" + sum);
	}
}
