package com.prod;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.studentNo = "14-444440";
		s1.korScore = 57;
		s1.engScore = 88;
		s1.study("Mathmatics"); //student가 가지고 있는 기능, 메소드를 사용하겠다.
		// 단 앞에서 new student 를 사용해서 초기화를 해 놔야 사용할 수 있다.
		s1.eat("밥"); // 밥, 초콜릿 같은 값들은 매개변수가 아닌 실제 값이 들어가는 것이다.
		s1.eat("초콜릿");
	
		
		int v1 = s1.getKorScore();
		System.out.println(v1);
		 
		int v2 = s1.getEngScore();
		System.out.println(v2);
	}
}
