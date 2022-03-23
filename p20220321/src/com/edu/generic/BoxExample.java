package com.edu.generic;

import java.util.ArrayList;

public class BoxExample {
	public static void main(String[] args) {

//	Box box = new Box(); // Box클래스에 미리 타입을 선언함으로써 우리가 일일히 캐스팅하는 것을 스킵할 수 있따.
//	box.setObj("Hello"); // 니가 어떤 클래스인지는 모르겠지만 일단 <T>를 달아놓을게
//	String result = (String) box.getObj(); // 담기는 최상위 클래스인 오브젝트이지만, 
//	
//	//저렇게 string 타입의 친구에 넣기 위해서 캐스팅 작업이 필요함
//	// 이 때 String -> 에서 Integer로 변환이 불가능함.
//	// 코드가 복잡해질 수록 이러한 것들을 놓칠 수가 있음.
//	// 그래서 실행할 때 알 수  있음.
//	
//	Integer result1 = (Integer)box.getObj();
//	System.out.println(result1);

		Box<String> stringBox = new Box<String>(); // Box 클래스에서 정하지 않은 타입을 나는 String 값으로 정할게~
		stringBox.setObj("hello"); // 또한 객체라서 ()도 들어감
		// 이렇게 <T>, 그리고 후의 String 타입을 정할 수 있었따.
		String result = stringBox.getObj();

		Box<Integer> intBox = new Box<Integer>();
		intBox.setObj(134679);
		Integer result1 = intBox.getObj();
		
		ArrayList<Integer> intAry = new ArrayList<Integer>();
		

	}
}
