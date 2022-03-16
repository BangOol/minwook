package com.prod;

// 클래스를 정의하는 부분

public class Calculrator {
	
	double PI = 3.14;
	
	int add(int n1, int n2){
		return n1 + n2;
	}
	 
	int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	double getRectArea(double x, double y) {
		return x * y;
	}
	//사각형의 넓이를 계산...
	//
	
	//원의 넓이를 계산
	
	double getCircleArea(double radius) {
		return PI * radius * radius;
	}
}
