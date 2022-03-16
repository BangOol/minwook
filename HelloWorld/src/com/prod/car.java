package com.prod;

public class car {
	// 모델, 현재속도, 최고속도, 가속(a = 10m/s^2) , 감속( b = -10m/s^2), 현재속도() + 괄호는 메소드
	private String  model;
	private int speed;
	private int maxSpeed;
	
	
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	// source - generate getters and setters :set, get 생성

	public void addSpeed() {
		if(this.speed +10 >= this.maxSpeed) {
			System.out.println("최고 속도를 초과할수 없습니다.");
			return;										//밑 구문으로 가지 않고 마무리됨.
		} else {
		System.out.println("10km 가속합니다.");
		this.speed += 10;
		}
	}
	
	public void minusSpeed() {
		System.out.println("10km 감속합니다.");
		this.speed -= 10;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	

	
}
