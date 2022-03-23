package com.edu.api;
import java.util.Scanner;

public class IdCheck {
	// 주민번호를 입력해서, 2000년 전에는 남자가 1, 여자가 2 2000년 이후에는 남자가 3, 여자가 4
	// ex)주민번호 입력 시 010228 - 3145678
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		Id idcheck = new Id();
		System.out.println("주민번호를 입력하세요");
		String gender = scn.next();
		String result = idcheck.getGender(gender);
		System.out.println(result);
		
		
		System.out.println("end of program");
	}


}
