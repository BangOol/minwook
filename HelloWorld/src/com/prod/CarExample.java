package com.prod;

public class CarExample {
	public static void main(String[] args) {
		
		car sonata = new car();
		
		sonata.setModel("Sonata DN8");
		sonata.setSpeed(150);
		sonata.setMaxSpeed(180);
		
		sonata.addSpeed();
		sonata.addSpeed();
		sonata.minusSpeed();
		System.out.println("현재 속도: " + sonata.getSpeed() + "km입니다.");
		       
	}
}
