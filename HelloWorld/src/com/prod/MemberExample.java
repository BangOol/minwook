package com.prod;

public class MemberExample {
	public static void main(String[] args) {
		// int num1 = 10;
		// String name = : "홍길도";
		// ?? member = "홍길동 " , 10; 등 여러 타입을 한 변수에 담고 싶다.
		
		Member mem1 = new Member(); // name, age 속성 x
		mem1.name = "홍길동";  //.name 과 .age 는 mem1 에 포함되어 있음
		mem1.age = 20; // 만약 홍길동과 20이란 값을 넣지 않았을 때에는 name과 age에는 각각 null과 0이 들어간다(초기화)
		
		Member mem2 =new Member(); // 새로운 유형의 데이터 타입
		mem2.name = "김민수";
		mem2.age = 25;
		
		
		
		System.out.println("mem1의 name 속성: " + mem1.name);
		System.out.println("mem1의 age 속성: " + mem1.age);
		
		Student st1 = new Student();
		st1.studentNo = "22-151843";
		st1.name = "김영희";
		st1.korScore = 97;
		st1.engScore = 86;
		
		Student st2 = new Student();
		
	}
}
