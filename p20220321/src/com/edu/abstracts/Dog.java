package com.edu.abstracts;
// 추상클래스를 상속받는 클래스

public class Dog extends Animal {

	public Dog() { // 부모클래스를 호출하고 난 후 자식클래스를 실행함. super 없더라도 부모클래스 실행됨
		super();
		System.out.println("Dog() 생성자 호출");
	}

	@Override
	public void eat() {
		System.out.println("멍멍이가 먹습니다");
	}

	public void speak() {
		System.out.println("멍멍!");
	}

}
