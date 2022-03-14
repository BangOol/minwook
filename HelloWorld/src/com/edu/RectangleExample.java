package com.edu;
import java.util.Scanner;

public class RectangleExample {
	public static void main(String[] args) {
		// 가로, 세로, 길이 입력 --> 너비 계산
		Scanner scn = new Scanner(System.in);
		int xLength, yLength, area;

		xLength = scn.nextInt();
		System.out.println("가로길이: " + xLength);
		yLength = scn.nextInt();
		System.out.println("세로길이: " + yLength);
		area = xLength * yLength;
		System.out.println("계산결과: " + area);
		scn.close();
	}
	
	

}
