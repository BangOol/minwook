package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue" , "김철수");
		Member obj2 = new Member("blue", "김철수");
		Member obj3 = new Member("red", "김영희");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동일합니다.");
		} else {
			System.out.println("obj1과 obj2는 동일하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동일하지 않습니다.");
		}
		
		
		
		Member[] memberAry = new Member[5]; // Member 인스턴스 최대 5개 저장
											// 크기 초과하면 새로운 배열 선언, 복사
		
		ArrayList<Member> memList = new ArrayList<Member>(); // 같은 값이라도 주소만 다르고 중복저장하는 형태의 클래스
		memList.add(new Member("user1", "홍길동"));
		memList.add(new Member("user1", "홍길동"));
		for(int i =0; i<memList.size(); i++) {
			System.out.println(memList.get(i));
		}
		
		HashSet<Member> memSet = new HashSet<Member>(); //같은 값이면 중복저장을 안하는 형태의 클래스
		memSet.add(new Member("user1", "홍길동")); // hashCode(), equals()에서 ??
		memSet.add(new Member("user1", "홍길동"));
		
		System.out.println(memSet.size());
	}
}
