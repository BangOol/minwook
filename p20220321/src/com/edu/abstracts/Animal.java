package com.edu.abstracts;

public abstract class Animal {
	private String name;
	
	
	public Animal() {
		System.out.println("Animal() 생성자 호출.");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	//++ 추상클래스는 추상메소드라는 것을 정의
	// 구현되는 부분이 없음.중괄호 안 실행 코드가 없음.
	//void 라 리턴 타입도 아님.
	// Animal이라는 추상 클래스를 상속받기 위해? ????
	// 밑의 추상메소드를 사용해야만 하는 의무를 가진다.
	public abstract void eat();
	public abstract void speak();
	
}
