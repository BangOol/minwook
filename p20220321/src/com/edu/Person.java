package com.edu;

public class Person extends Object{
	// 사실 모든 클래스는 Object라는 클래스를 상속한다. 여기서 
	// field.
	private String name;
	private int age;
	private double height;
	private double weight;

	// method.
	// 필드 값을 읽어올 때, 직접 값을 넣는게 아니라 메소드를 통해 값을 지정.
	
	
	//인스턴스 생성 시, 필드 값을 초기화하는 용도
	// 여러개를 정의하는 것은 overloading(중복선언)이라고 함.
	
	//부보 클래스의 기본 생성자를 호출하는게 생략되어있음
	

	public Person(String name, int age, double height, double weight) {
		super(); // 부모 클래스를 참조하겠습니다. 라는 의미
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public Person() {
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String name() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	
	
	

}
