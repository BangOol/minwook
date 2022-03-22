package com.edu.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //추상클래스는 인스턴스를 생성할 수 없다.
		Animal animal = null;
		animal = new Dog(); // dog라는 생성자를 호출하겠다.
		animal.setName("백구");
		animal.eat();
		animal.speak();
		
		animal = new Cat();
		animal.setName("두부");
		animal.eat();
		animal.speak(); // 어떤 인스턴스가 담겨있냐에 따라서 다른 값이 도출된다.
	
	}
	
	

}
