package com.prod;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculrator h1 = new Calculrator();
		System.out.println(h1.PI);
		
		int number1 = 10;
		int number2 = 20;
		double r = 4.5;
		
		// 클래스를 호출하는 부분
//		h1.add(number1, number2);
		int result = h1.add(number1, number2);
		System.out.println(number1 + "과" + number2 + "의 합계: " + result);
	
		
		
//		h1.minus(number2, result);
		int result1 = h1.minus(number1, number2);
		System.out.println(number1 + "과" + number2 + "의 차: " + result1);
	
		
		
		double area = h1.getRectArea(number1, number2);
		System.out.println(number1 + "과" + number2 + "의 곱: " + area);
	
		
		
		double CircleArea = h1.getCircleArea(r);
		System.out.println("반지름 " + r + "의 넓이: " + CircleArea);
	}
}
