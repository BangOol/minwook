package com.prod;

public class Student {
	
	String studentNo;
	String name;
	int korScore;
	int engScore;
	
	// method: 기능 ... 함수
	void study(String subject) { // String subjcet 부분을 매개변수라 한다.
		
		System.out.println("공부를 합니다.");
		
	}
	
	void eat(String food) { //안에 String food 를 적고 그 아래에 food로 대체 가능
		// 그래서 main에서 사용할 때 괄호 안에 그에 맞는 값을 기입하면 된다.
		System.out.println(food + "을 먹습니다.");
	}
	
	int getKorScore(){
		return korScore;
	}
	  
	int getEngScore() {
		return engScore;
		// int같은 클래스와 달리, void 계열은 return 값이 없어서, studentExample 에서 String v1 = s1.study() 같은 방식이 불가능하다. 
		
	}
}
