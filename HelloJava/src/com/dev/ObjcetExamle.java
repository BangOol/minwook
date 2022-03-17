package com.dev;

import com.edu.Student;
import java.util.Scanner;


public class ObjcetExamle {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		// 그렇다면 100, 기영 자리에 n1, n2를 스캐너 기능을 통해 넣을 수 있지 않을까?
		//s1 = scn.nextInt();
		// 그 다음에 저 자리에 s1, s2 같은 걸 넣는거임
		Student u1 = new Student(100, "기영"); // 이 경우 첫번째 생성자가 아니라 2번째생성자를 받고
										// 학생번호값을 받는 역할을 한다.
		
		System.out.println(u1.getStudentNo());
		
		Student u2 = new Student(101, "이가미", 80, 82, 28); // 생성자를 통해서 초기값을 지정할 수 있다?
		System.out.println(u2.getStudentName() + "의 평균: " + u2.getAvgScore()); // 우리가 지정해놓은 생성자에 설정해놓은 매개변수가 있다. 이때 다른 메소드에서 사용한 변수들과 조건이 충족되면 그 메소드를 사요할 수 있따.
		
		
		
		
		Student u3 =new Student(102, "강감찬", 90, 90, 70);
		
		
		
		Student[] students = {u1, u2, u3};
		
		
		
		
		while(true) {
			System.out.println("조회하려는 학생의 이름을 넣으세요(ex: 홍길동)");
			String searchName = scn.next();
		if(searchName.equals("종료")) {
			break;
		}
		
		
		for(int i =0; i < students.length; i++) {
			if(students[i].getStudentName().equals(searchName)) {
				System.out.println(students[i].getStudentName());
			} 
		}
		System.out.println("end of program");
	}
//		u1.setStudentNo(100);  // 앞의 public이 아닌 default 상태이기 때문에 다른패키지에서 공유가 되지 않음.
//		u1.setStudentName("이이이");
//		
//		Scanner scn = new Scanner(System.in);
//		scn.nextInt();
		
		
		
		
		
		
		
		
	}
	
}
