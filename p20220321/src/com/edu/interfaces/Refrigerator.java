package com.edu.interfaces;

public class Refrigerator implements RemoteControl{
	public void powerOn() {
		System.out.println("냉장고를 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("냉장고를 끕니다.");
	}
}
