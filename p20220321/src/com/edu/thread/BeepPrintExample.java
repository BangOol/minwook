package com.edu.thread;

import java.awt.Toolkit;

class BeepTask implements Runnable { //Runnable이라고 하는 인터페이스를 구현하는 BeepTask를 만들어 Thread를 만드는 방법도 있고
	public void run() { // Runnable 인터페이스를 굳이 구현하는 클래스를 만들지 않는 익명구현객체를 통해 만들 수 있다.(단 간단한 경우에만)
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 컴퓨터 삑- 소리나게 하는 기능인 것 같음.
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	}


// process(main 스레드) : 싱글 스레드였음.
public class BeepPrintExample { // 제일 먼저 실행되는 스레드.
	public static void main(String[] args) {// 이게 제일 먼저 실행되는 스레드?

//		Thread thread = new Thread(new BeepTask()); // 위의 runnable 인터페이스를 받아주는 toolkit에서 소리가 나고, 동시에, 스레드라고 하는 클래스
//		thread.start();// 이 명령어를 시작해야지만, 스레드가 시작된다. 
		// 스레드 생성방법.
		// 1. Thread class 생성자의 매개값으로(new Thread), runnable interface를 구현한 객체를 생성자의 매개값으로 넣어라. 그러면 새로운 스레드가 만들어진다.
		// 2. 기능이 고정된 것은 아니기에, Runnable 인터페이스를 이용해 익명구현객체를 만들어서, 그 그 구현객체를 매개값으로 넣으면 된다? 
		// Thread thread = new Thread(new Runnable()); (굳이 구현객체의 인스턴스를 만들어서 그 인스턴스를 매개값으로 넣을 필요가 없다?
//		Thread thread = new Thread(new Runnable() { // 이걸 밑의 람다식으로 구현할 수 있다.
		Thread thread = new Thread(() -> { //이렇게 익명구현객체를 통해서 클래스를 만들지 않아도 만들 수 있다는 걸 보여준 듯.
			Toolkit toolkit = Toolkit.getDefaultToolkit(); // 컴퓨터 삑- 소리나게 하는 기능인 것 같음.
			for (int i = 0; i < 5; i++) { // Runnable 인터페이스의 익명구현 객체를 생성 후
				toolkit.beep(); // Thread 클래스의 생성자 매개값으로 활용
				try { // 기능이 길다면 클래스를 만드는게 좋지만, 짧다면 익명구현객체를 통해서 처리하는 것도 좋다.
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});  //람다식을 썼기에 이러한 괄호를 유심히 잘 살펴보자.
		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println("end of program");
	}
}

