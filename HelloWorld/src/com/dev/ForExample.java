package com.dev;

public class ForExample {
	public static void main(String[] args) {
		
//		i = i + 1;
//		i += 1;
//		i ++;
		
		// 1~10까지 더하는 ??
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
}
