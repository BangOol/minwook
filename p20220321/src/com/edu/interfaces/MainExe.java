package com.edu.interfaces;

public class MainExe {
	public static void main(String[] args) {
		//리모콘=> tv. Radio, 냉장고를 키고 끌 수 있는 장치
		
		RemoteControl rm = new TV();
		rm.powerOn();
		rm.powerOff();
		
		rm = new Radio();
		rm.powerOn();
		rm.powerOff();
		
		rm = new Radio();
		rm.powerOn();
		rm.powerOff();
		
	}
}
