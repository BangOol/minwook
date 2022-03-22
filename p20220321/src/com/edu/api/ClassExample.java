package com.edu.api;

import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		// String, System, Member --> 관리해주는 class(class);

		Class cls = String.class; // String class의 정보를 읽어오기 위해 사용함.\
		try {
			cls = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(cls.getName()); //
		System.out.println(cls.getSimpleName());
		Method[] methods = cls.getMethods();

		for (Method met : methods) {
			System.out.println("String 클래스가 가지고 있는 메소드이름" + met.getName());
		}
		
		
		
		
		
		cls = Member.class; //우리가 작업하고 있는 곳 : c / user/admin/git/minwook/src/com/edu/api
		
		String path = cls.getResource("ClassExample.class").getPath();
		System.out.println(path);
	}
}
