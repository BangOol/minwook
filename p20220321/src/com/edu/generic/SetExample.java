package com.edu.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();// 집합인데 중복된 값을 허용하지 않음.
		set.add("hello");
		set.add("world");
		set.add("good");
		set.add("world"); // 중복된 값을 넣는다고 해서 오류가 나는 것은 아니고, 중복된 요소는 추가불가라는 것만 기억하면 될듯. 없는 처리가 된다 
		
		set.remove("good");
		System.out.println("set 크기: " + set.size()); //set도 size를 이용함. ++ 얘는 인덱스값이 없고
		//인덱스값을 불러올 수 없기 때문에, 
		
		Iterator<String> iter = set.iterator(); // 반복자, 리턴 타입이 제너릭 타입으로 해야됨.
												//import java.util.Iterator을 이용한다.
		
		while(iter.hasNext()) { //들어있는 반복자를 들어있는 개수만큼 확인, true or false
			String result = iter.next();		//이 결과값을 담겠습니다.
			System.out.println(result);			//false가 나오면 자동구문이 끝남
		}										//중복된 것을 넣지 않고 우선 순위 없이 꺼내나..?
	
		System.out.println("end of program");	//List와 같은 add 기능. api를 통해 나중에 자세히 살펴봐라
												//반복된 작업을 하기 위해서 다시 반ㅂㄱ자를 생성하여 while을 돌리면 되는 듯하다.
		
	}
}
