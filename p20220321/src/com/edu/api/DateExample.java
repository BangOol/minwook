package com.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		
		Date today = new Date(); //date는 java.util과 java.sql 2군데 에 있음
		today.setYear(1); // 1900년 
		System.out.println( today.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(today));
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time.getYear() + "년");
		
		
	}
}
