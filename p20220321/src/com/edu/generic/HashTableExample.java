package com.edu.generic;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<String, String>(); 
		// Map이라는 컬렉션에는 키와 밸류 2개가 붙게 되는데, 이 2개의 타입을 <>를 통해 정하게 된다.
		// 우리는 String, String을 하기로 결정한 것이고, Hashtable을 이용하여 값을 저장할 것으로 보인다.
		
		map.put("spring","12"); //set 컬렉션의 add 메소드와는 조금 다르지만, 우리는 우리가 넣고 싶은 값을
		map.put("summer","123");// put(x, x)를 통해 넣을 수 있다.
		map.put("fall","1234"); // 이것을 통해 아이디와 비밀번호를 입력넣을수 있음.
		map.put("winter", "1235");
		
		Scanner scn = new Scanner(System.in);
		
		while(true) { // 구문을 반복시킬거임
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디: ");
			String id = scn.nextLine();
			System.out.print("비밀번호: ");
			String password = scn.nextLine(); // nextLine은 next의 발전형 메소드란다.
			System.out.println();
			
			if(map.containsKey(id)) { //map 컬렉션에 저장해 두었던 값이 존재하는가? 라고 묻는 것
				if(map.get(id).equals(password)) {//우리가 입력한 값을 통해 리턴받는 밸류 값이, password라는 값과 동일한가?
					System.out.println("로그인되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}
			
			
			
		}
	}
}
