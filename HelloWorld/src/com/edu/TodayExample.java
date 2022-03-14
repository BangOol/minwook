package com.edu;
import java.util.Scanner;

//이름을 입력(String) -> scn.nextLine();
//연락처 기입(String) -> scn.nextLine();
//나이 입력(int) -> scn.nextInt();
//키 입력(double) -> scn.nextDouble();

// 이름은 : ???
// 연락처 : 010-8330-2939
// 나이 : 28
// 키 :173.9
public class TodayExample {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		int age;
		double tall;
		String name, tel;
		
		name = scn.nextLine();
		tel = scn.nextLine();
		age = scn.nextInt();
		tall = scn.nextDouble();

		
		System.out.println("이름은 " + name + " 입니다.");
		System.out.println("연락처는 " + tel + " 입니다.");
		System.out.print("나이는 " + age + "살이고, ");
		System.out.println("키는 " + tall + "cm 입니다.");
	
	}
}
