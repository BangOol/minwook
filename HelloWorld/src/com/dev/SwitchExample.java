package com.dev;

public class SwitchExample {
	public static void main(String[] args) {
		// 가위(1), 바위(2), 보(3)
		
		int randVal = (int)(Math.random() * 3 + 1);
		
//		if(randVal == 1) {
//			System.out.println("가위입니다.");
//		} else if(randVal == 2) {
//			System.out.println("바위입니다.");
//		} else {
//			System.out.println("보입니다.");
//		}
		
		switch(randVal) {
		case 1:
			System.out.println("가위입니다.");
			break;
			
		case 2:
			System.out.println("바위입니다.");
			break;
			
		case 3:
			System.out.println("보입니다.");
			break;
		}
	}
}
