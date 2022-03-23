package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp { // 실제 실행되는 클래스. studentexe는 실행버튼일 뿐
	// 메뉴:1 추가:2 한건조희:3 수정:4 종료:9
	
	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);
	
	StudentServiceImpl sample = new StudentServiceImpl();
	
	//멤버 클래스로 선언
	class StudentServiceImpl implements StudentService {

		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가
			
		}

		@Override
		public Student getStudent(int studentNumber) { //학생번호로 한건 조회
			for(int i =0; i<list.size(); i++) {
				if(list.get(i).getStudentNumber() == studentNumber) {// student 클래스의 인스턴스와 같다?
					return list.get(i);
				}
			}
			return null;
		}

		@Override
		public List<Student> studentList() { //전체 학생 정보 불러오기
				System.out.println("학생번호를 입력하세요");
				int number = scn.nextInt();
				for(int i =0; i <list.size(); i++) {
					if(list.get(i).getStudentNumber() == number) {
						
					}
				}
			return list;
		}

		@Override
		public void modifyStudent(Student student) { // 수정
			for(int i =0; i<list.size(); i++) {
				if(list.get(i).getStudentNumber() == student.getStudentNumber()) {
					list.get(i).setEngScore(student.getEngScore());
					list.get(i).setKorScore(student.getKorScore());
				}
			}
		}
		
	}
	// end of StudentServiceImpl

	
	
	
	public void execute() {

		while (true) {
			System.out.println("메뉴:1 추가:2 한건조희:3 수정:4 종료:9");
			System.out.println("선택하세요.");

			int menu = scn.nextInt();

			if (menu == 1) {
				
			} else if (menu == 2) {
				sample.insertStudent(null);
			} else if (menu == 3) {
				
			} else if (menu == 4) {
				
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		//end of while()
		System.out.println("end of program");
	}

}
