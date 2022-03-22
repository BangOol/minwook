package com.edu.nested;

public class Outer {

	private String field1;
	private int field2;

	public String getField1() {
		return field1;
	}

	class Inner { // 멤버클래스
		String field3;
		int field4;

		void method2() {
			System.out.println("Inner.method2()");
		}

	}
	
	interface Runnable{
		void run();
	}
	
	class Bus implements Runnable{

		public void run() {
			System.out.println("bus run");
		}
		
		
		
	}

	public void method1() {
		System.out.println("Outer.method1()");
		Inner inner = new Inner();
		inner.method2();
	}

	public void method3() {
		System.out.println("Outer.method3()");

		class Local { // 로컬 클래스
			void method4() {
				System.out.println("Outer.method4()");
			}
		}
		Local local = new Local();
		local.method4();
		
	}
	
	//함수적 인터페이스: 구현해야 할 메소스다 하나인 것.
	public void method4() {
		Runnable runnable = new Bus(); //인터페이스의 구현 객체이기에 가능
		runnable.run();
		//익명구현객체
		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("임의의 객체를 실행합니다.");
			} //runnable을 구현하는 객체를 바로 선언하겠다 : 익명 객체
			
		};
		
		runnable.run();
	}
}
