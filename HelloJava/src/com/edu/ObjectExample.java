package com.edu;

public class ObjectExample {
	public static void main(String[] args) {
		int num1 = 13;
		double num2 = 12.2;
		
		String str1 = new String();  //heap(인스턴스)
		Car car1 = new Car(); // 초기화(인스턴스화)
		
		car1.setModel("Sonata");
		car1.setPrice(1111111);
		
		Student u1 = new Student();
		
		u1.setStudentName("전민욱");
		u1.setStudentNo(100);
		u1.setKorScore(90);
		u1.setEndScore(80);
		u1.setMathScore(90);
		
		System.out.println("국어점수 초기값: " + u1.getKorScore());
		System.out.println("영어점수 초기값: " + u1.getEndScore());
		System.out.println( u1.getStudentName() + "의 합계: " + u1.getSumScore());
		System.out.println( u1.getStudentName() + "의 평균: " + u1.getAvgScore());
		
	}
}
