package com.edu.collect;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExample {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		List <Student> list = new ArrayList<Student>();
		
		Student s1 = new Student();
		Student s2 = new Student(101, "홍홍홍" , 54, 87);
		Student s3 = new Student(101, "합합홍" , 94, 47);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Student result = list.get(0); // 첫번째 학생 정보를 result에 저장
		System.out.println("첫 번째 학생: " + result.toString()); // result가 아니라 그 안의 문자열을 읽어오는 toString을 사용해야...
		
		list.set(0, new Student(20, "서현일", 90, 92)); // 첫번째 인스턴스변경
		result = list.get(0);
		
		list.get(0).setKorScore(100); // 첫 번째 인스턴스의 값을 변경
		list.get(0).setEngScore(100); // 
		
		list.remove(0); // 삭제처리
		// 단, toString을 따로 재정의하지 않으면 주소값을 불러옴
		System.out.println("첫 번째 학생: " + result.toString());
		
		
		
	}
}
