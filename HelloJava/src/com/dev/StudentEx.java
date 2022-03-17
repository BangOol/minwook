package com.dev;

import java.util.Scanner;
import com.edu.Student;

public class StudentEx {
	public static void main(String[] args) {
		// 배열 선언 5개,스캐너, 출력이라는 기능구현, 입력, 리스트 출력 기능구현

		Scanner scn = new Scanner(System.in);
		Student[] students = new Student[5];

		while (true) {
			System.out.println("1번: 입력, 2번: 리스트, 3번: 종료");
			System.out.println("선택> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				// 입력하는 기능을 구현해야함. 학번, 이름, 영어, 수학, 국어점수 입력 받아야됨. 이 값 활용하여 Student instance 만들어서
				// 배열에 담음.
				System.out.print("학번을 입력하세요... >");
				int sno = scn.nextInt();
				System.out.println("이름을 입력하세요...>");
				String uno = scn.next();
				System.out.println("영어점수를 입력하세요>");
				int escore = scn.nextInt();
				System.out.println("국어점수를 입력하세요>");
				int kscore = scn.nextInt();
				System.out.println("수학점수를 입력하세요>");
				int mscore = scn.nextInt();

				Student s1 = new Student(sno, uno, escore, kscore, mscore);

				for (int i = 0; i < students.length; i++) {
					if (students[i] == null) {
						students[i] = s1;
						System.out.println("저장되었습니다.");
						break;
					}
				}
			} else if (menu == 2) {
				// 리스트 구현

				for (int i = 0; i < students.length; i++) {
					if (students[i] != null) {
						System.out.println(students[i].getStudInfo());
					}
				}
				System.out.println("조회완료");

			} else if (menu == 3) {
				// 종료
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 누르셨습니다.");

			}

			System.out.println("end of program");

		}

	}

}
