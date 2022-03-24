package com.edu.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 70, 180));
		list.add(new Student("홍길순", "여자", 80, 110));
		list.add(new Student("홍길분", "여자", 90, 50));
		list.add(new Student("홍길당", "남자", 80, 30));

		list.stream().filter(student -> student.score + student.point >= 100).sorted()
				.sorted()
				.forEach(student -> System.out.println(student));

		list// 컬렉션으로부터
				.stream()// 스트림 생성
				.filter(student -> student.score >= 80)// 80점 이상인 대상을 필터
				.filter(student -> student.gender.equals("여자")).forEach(student -> System.out.println(student));// 필터링된
																												// 대상을
																												// 출력
	}
}
