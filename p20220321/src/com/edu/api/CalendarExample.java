package com.edu.api;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		
		int year = 2022;
		int month = 2; //5월
		
		createCalendar(year, month);
		
		System.out.println("\nend of program");
	}
	
	
	
	
	
	public static void createCalendar(int year, int month) {
		Calendar today = Calendar.getInstance();
		today.set(year, (month-1), 1);

		int gapDay = today.get(Calendar.DAY_OF_WEEK);
		System.out.println(gapDay);
		int lastDate = today.getActualMaximum(Calendar.DATE);

		System.out.println("올해는: " + today.get(Calendar.YEAR) + "년");
		System.out.println("이번달: " + (today.get(Calendar.MONTH)+1) + "월"); // MONTH가 0부터 시작하기 때문에 1월: 0
		System.out.println("오늘은 " + today.get(Calendar.DATE) + "일");
		System.out.println("요일정보: " + today.get(Calendar.DAY_OF_WEEK)); // 일: 1 월: 2 .... 요일을 일(1) 부터 토(7)까지
		System.out.println("마지막날: " + today.getActualMaximum(Calendar.DATE) + "일");

		// 요일 정보를 출력하는 구문
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

		
		//날짜 간격맞춰서 출력
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();

		// 1의 위치를 지정하기 위함.
		for (int i = 1; i < gapDay; i++) {
			System.out.printf("%4s", "");
		}

		// 날씨를 출력
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + gapDay - 1) % 7 == 0) {
				System.out.println();
			}

		}
	}
	
	
}
