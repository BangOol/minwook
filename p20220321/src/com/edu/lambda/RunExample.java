package com.edu.lambda;
interface Runnable {
	public void run();
}

class RunImpl implements Runnable { // 이게 RunExample 밖에 있어야 객체 만들때 적용이 되네?

	@Override
	public void run() {
		System.out.println("run...");
	}
	// runnable를 구현하는 구현 클래스가 될 시점에
}
public class RunExample {


	public static void main(String[] args) {
		// 람다표현식(String s) => {구현 코드};

		Runnable runnable = new RunImpl(); // 이렇게도 가능하긴 하지만...
		runnable.run();

		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("호랑이가 달립니다.");
			}

		}; // 익명구현객체
		runnable.run();

		runnable = () -> {
			System.out.println("사자가 달립니다.");
		};
		runnable.run();
	}
}
