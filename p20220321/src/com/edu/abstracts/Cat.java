package com.edu.abstracts;

public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("야옹이가 먹습니다.");
	}
	
	public void speak() {
		System.out.println("야옹!");
	}
}
