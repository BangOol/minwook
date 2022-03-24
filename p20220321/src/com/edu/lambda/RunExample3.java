package com.edu.lambda;

interface Runnable3 { // 구현해야할 될 메소드가 하나 있을 때 인터페이스로 람다 구현가능? = 함수적 인터페이스(consumer 함수적 인터페이스)
	public int run();// : 매개값만 있고 리턴값이 없는 추상 메소드를 가짐
	// <T> 선언되어질때 정해지는 것.
	// BiConsumer : 매개값 2개를 받는데 리턴값은 없음
	// DoubleConsumer : Double 타입 매개값만 올 수 있음.
	// 제네릭이 없는 것은 기본 값, 제네릭이 있는 것은 몰루?

}

public class RunExample3 {
	public static void main(String[] args) {
		Runnable3 runnable = () -> {
			return (int) (Math.random() * 10);
		};

		int result = runnable.run();
		System.out.println(result);

		// 함수적인 프로그램 작성 : 간단하게 표현(람다표현식)

		runnable = () -> {
			return (int) (Math.random() * 100);
		};

		int result1 = runnable.run();
		System.out.println(result1);

	}
}
