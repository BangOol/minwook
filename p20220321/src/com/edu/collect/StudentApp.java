package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp { // 실제 실행되는 클래스. studentexe는 실행버튼일 뿐
	// 메뉴:1 추가:2 한건조희:3 수정:4 종료:9

	List<Student> list = new ArrayList<Student>(); // collection을 활용하여 배열대신 씀
	Scanner scn = new Scanner(System.in); // student 타입을 쓴다는건 무슨 의미일까?

	// 생성자

	public StudentApp() {

	}

	// 멤버 클래스로 선언함
	class StudentServiceImpl implements StudentService {

		@Override
		public void insertStudent(Student student) {
			// 추가

		}

		@Override
		public Student getStudent(int studentNumber) { // 학생번호로 한건 조회
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudentNumber() == studentNumber) {// student 클래스의 인스턴스와 같다?
					return list.get(i);
				}
			}
			return null;
		}

		@Override
		public List<Student> studentList() { // 전체 학생 정보 불러오기
			return list;
		}

		@Override
		public void modifyStudent(Student student) { // 수정 : 기존 값에서 다른 값으로 변경 --> 같은 번호를찾아서 변경

		}

		@Override
		public void removeList(int number) {

		}

		@Override
		public List<Student> searchStudent(String name) {
			return null;
		}

		public void saveToFile() {
		}

	}
	// end of StudentServiceImpl

	public void execute() {
		// 메인기능 담당하는 exucute()에서 StudentServiceFIle 사용?
		StudentService service = null;
		service = new StudentServiceOracle();

		// 얘 while 문 안에 있으면 절대 안됨. 왜? 인식이 안되서 아무리 값 넣어도 증발함.
		// while 구문에 있는동안 heap 영역에 값이 저장이 되서 그런건지, 입력, 리스트 메소드가 정상적으로 정상됨에도 불구하고 값이
		// 날아감...? 인가?
		// 이건 다시 봐야 될듯.
		// 그냥 무조건 봐야 함. 제발. 제발. 보자. 복습해해애애애ㅐ애애

		while (true) {
			System.out.println("추가:1 리스트:2 한건조회:3 수정:4 삭제:5 이름조회:6 종료:9");
			System.out.println("선택하세요.");
//							service = new StudentServiceOracle(); //어떤 서비스가 제공될지만 알고 있따면 밑의 내용은 따로 바꿀 필요가 x
			// 같은 StudentService 인터페이스를 구현하기에, 추가적인 조치가 없다.
			// 인터페이스를 구현하는 변수 이름으로 선언하고, 변수에 할당될 수 있어서 new -- 로 파일에 저장이 가능하다?

			int menu = scn.nextInt();

			if (menu == 1) {
				// 학생 정보를 추가입력 : 학생번호, 이름, 영어,국어점수
				Student stu = new Student();

				System.out.println("학생번호를 입력하세요");
				int stuNo = scn.nextInt();
				stu.setStudentNumber(stuNo);
				System.out.println("학생이름을 입력하세요");
				String stuName = scn.next();
				stu.setStudentName(stuName);
				System.out.println("영어점수를 입력하세요");
				int engScore = scn.nextInt();
				stu.setEngScore(engScore);
				System.out.println("국어점수를 입력하세요");
				int korScore = scn.nextInt();
				stu.setKorScore(korScore);

				service.insertStudent(stu);

			} else if (menu == 2) {
				List<Student> list = service.studentList(); // 바깥에 같은 이름의 list가 있지만 재정의하는 것으로 보임. 아니면 서비스의 추상메소드 쓰는걸수도?
				for (Student s : list) { // 확장 for를 사용하여, list 컬렉션에 담긴 건수만큼 작동하겠습니다?
					System.out.println(s.toString()); // student의 toString을 사용하고 있다.
				}

			} else if (menu == 3) {
				
				System.out.println("조회하실 학생번호를 입력하세요");
				int number = scn.nextInt();
				service.getStudent(number);
				

			} else if (menu == 4) {
				Student student = new Student();

				System.out.println("학생번호를 입력하세요");
				int number = scn.nextInt();
				student.setStudentNumber(number);
				System.out.println("수정할 영어점수를 입력하세요");
				int engScore = scn.nextInt();
				student.setEngScore(engScore);
				System.out.println("수정할 국어점수를 입력하세요");
				int korScore = scn.nextInt();
				student.setKorScore(korScore);

				service.modifyStudent(student);

			} else if (menu == 5) {
				System.out.println("삭제할 학생번호를 입력하세요.");
				int number = scn.nextInt();
				service.removeList(number);

			} else if (menu == 6) {
				System.out.println("조회할 학생이름을 입력하세요.");
				String name = scn.next();
				service.searchStudent(name);

			}

			else if (menu == 9) {
				System.out.println("프로그램을 종료합니다."); // 종료를1 하고 나면 메모리 속 내용이 사라지게 된다.
				service.saveToFile();
				break; // 나중에 DB를 사용하여 저장할 수 있게 된다.
			}

		}
		// end of while()
		System.out.println("end of program");
	}

}
