package com.edu;
import java.util.Scanner;


public class TemperatureExample {
	public static void main(String[] args) {
		// C = 5/9(F - 32) 화씨온도를 섭씨온도로 변경
		Scanner scn = new Scanner(System.in);
		double fDeg, cDeg;
		fDeg = scn.nextDouble(); // 실수라서 double 쓴 것도 알아야 한다.
		cDeg = (fDeg-32) *(double)5/9;
		// double 로 따로 넣어줘야 5/9가 0으로 처리되지 않는다. ( 중 요 함 ! )
		
		System.out.println(cDeg);
		
		// 섭씨온도가 30.0 보다 크면 "오늘은 더운 날씨네요". 그 외는 "괜찮은 날씨네요"
		if(cDeg >= 30.0) {
			System.out.println("오늘은 " + cDeg + "로 더운 날씨에요.");
		} else {
			System.out.println("오늘은 " + cDeg + "로 괜찮은 날씨에요");
		}
		
	}

}
