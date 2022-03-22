package com.edu.api;

import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {
		// 기본타입(int, double, long, boolean...)
		// 참조타입(String, Inerger, Long, Double, Boolean...)
		// int ---> Integer (boxing), Integer =====> int (unboxing)
		// 뭔지는 모르겟지만, wrapping 클래스는 박싱, 언박싱을 해서 기본타입과 참조타입을 바꾸는 클래스 같따. 
		ArrayList<Integer> ary = new ArrayList<Integer>(); // 안에 클래스 타입만 와야한다.
		ary.add(100);
		ary.add(new Integer(200)); //에러는 아니지만 나중에 에러 생길 수 있으니까 이렇게 쓰지마라는 의미
		
		new Integer(100).floatValue(); // 100.0 double 형식으로 바꾸겠다는 명령문
		// <Integer> 내일 다시 본다고 함. // Deprecated. 향후 자바에서 제거할 예정이니 왠만하면 쓰지 마라. 에러는 아니다 라는 의미
		
	}
}
