package com.edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	String name;
	String gender;
	int score;
	int point;

	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public Student(String name, String gender, int score, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", score=" + score + ", point=" + point;
	}

	@Override
	public int compareTo(Student student) {
		// this 와 student 비교 : this, student 를 비교해서 어떤 순으로 비교할 것인지 정하는 것.
		// 오름차 순, 내림차 순에 따라 값이 음수 나 양수가 나올 수 있다는 거임.
		// 그래서 포인트나 점수 중 기준을 잡아야함.
//		if(this.score < student.score) {
//			return -1; // score 기준으로 this가  작을 때 음수 부여
//		} else {
//			return 1;
//		}
//		return this.score - student.score; // 비교하는 대상: this-70 student-80 --> 음수 (this=student)
		return(this.score + this.point) - (student.score + student.point); //오름차순 정렬?
	}

}

public class StreamExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 70));
		list.add(new Student("홍길순", "여자", 80));
		list.add(new Student("홍길분", "여자", 90));
		list.add(new Student("홍길당", "남자", 80));
		// 평균구하기
		int sum = 0, cnt = 0;
		double avg = 0;
		for (Student student : list) { // student 값을 받아놓은 list들
			if (student.gender.equals("남자")) {
				sum += student.score;
				cnt++;
			}
		}

		avg = sum / (double) cnt;
		System.out.println("컬렉션 평균: " + avg);

		Stream<Student> stream = list.stream(); // 스트림생성,
		OptionalDouble od = stream//
				.filter((s) -> s.gender.equals("남자")).mapToInt(s -> s.score)//
				.average();// 메소드체이닝?

		avg = od.getAsDouble();
		System.out.println("스트림평균: " + avg);
//		stream.forEach((Student t) -> {
//				System.out.println("이름: " + t.name + ", 성별: " + t.gender + ", 점수: " + t.score);
//			
//		});
	}
}
