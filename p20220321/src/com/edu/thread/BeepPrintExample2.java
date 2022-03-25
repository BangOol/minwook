package com.edu.thread;

import java.awt.Toolkit;
// Thread 클래스를 상속받는 BeepThread를 만들어보자. (구현 x)
class BeepThread extends Thread{// 구현 시에 getDefaultToolkit 부근에서 에러남
	public void run() { //Thread의 메소드를 재정의하는 것.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
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

public class BeepPrintExample2 {
	public static void main(String[] args) {
		
		Thread thread = new BeepThread();//Thread 클래스를 상복받는 클래스를 선언 + run메소드를 override 기능을 구현
		thread.start(); // Thread를 상속받거나 Runnable 를 구현하는 객체를 매개변수로 사용하거나 해서 Thread를 시작할 수 있는 듯하다.
		
		// 1. Runnable 인터페이스를 구현한 객체를 매개변수로 넣는 것. (간단한 기능, 1개의 추상메소드만 있을 때만 가능 한것으로 봄)
		// 2. Thread 클래스를 상속받는 클래스를 만들고, 그 클래스를 이용해 인스턴스를 만드는 것.
		// 어떻게 멀티 스레드가 작동되는지를 볼 수 있는 경우이기에, 꼭 기억해두자.
		
		
		//비프음 생성
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 컴퓨터 삑- 소리나게 하는 기능인 것 같음.
		for (int i = 0; i < 5; i++) { // Runnable 인터페이스의 익명구현 객체를 생성 후
			toolkit.beep(); // Thread 클래스의 생성자 매개값으로 활용
			try { // 기능이 길다면 클래스를 만드는게 좋지만, 짧다면 익명구현객체를 통해서 처리하는 것도 좋다.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
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
