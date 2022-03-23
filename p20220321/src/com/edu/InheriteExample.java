package com.edu;

public class InheriteExample {
	// 학생, 직장인, 친구 => 정보를 담아놓는 연락처.
	// (학교, 학년) , (직장명, 직급) , (출신지역) 
	
	public static void main(String[] args) {
		Students student = new Students();
		student.setName("홍길동");
		student.setAge(15);
		student.setSchool("중앙고");
		student.setGrade(2);
		
		//person 클래스에서 가지고 잇는 필드를 사용ㄱ능함.
		
		Worker worker = new Worker();
		worker.setName("직장인");
		worker.setAge(35);
		worker.setCompany("카카오");
		worker.setJob("개발팀장");
		
		Person p1 = new Person();
		p1 = (Person)student; //부모클래스의 참조변수에 자식클래스의 참조변수가 할당가능하다. : 자동형변환(promotion)
		p1 =worker;
		
		//자식간의 할당은 불가능하다. student = worker;
		
		
	}
}
