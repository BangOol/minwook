package com.edu.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {

		// 얘도 제너릭 타입. 근데 특이하게 Key와 Value가 쌍으로 묶여서 옴 Map<Key, value>
		// Map: {key:value} , {key1, value} : key에 해당되는 제너릭과 value에 해당되는 제너릭을 따로 한다?

		Map<String, Integer> map = new HashMap<String, Integer>(); // key에 해당되는 것은 String, value는 integer 타입으로 선언
		map.put("전민욱", 80); // 키 값을 알고 있으면 밸류 값을 가져올 수 있다.
		map.put("김형민", 85); // key 값으로 들어오는 값이 중복이 되면 안됨.
		map.put("김영민", 82); // 기존 키가 있으면 새로운 값으로 덮어쓰기 됨. 85 -> 82

		Integer val = map.get("전민욱"); // ++ 해당되는 키값을 던져줬을 때 그에 맞는 밸류 값을 가져온다. ++
		System.out.println(val); // 키 값이라 하는게 규칙이 딱히 없어서 메소드 제공을 해줌.
		Set<String> keySet = map.keySet(); // 키 값만 뺴서 가져오는 메소드(map컬렉션에 저장된 요소들의 키에 해당 값을 set 컬렉션에 담아줌.)
		// 무작위로 움직이는 것이고 키셋이 가지고 있는 반복자를 가져와야 반복가능
		Iterator<String> iter = keySet.iterator();

		while (iter.hasNext()) { // 반복요소를 가져올 건지 묻는거?
			String key = iter.next();
			Integer value = map.get(key); // integer 타입의 value에 key의 값을 넣는다?
			System.out.printf("key: %5s value: %5d \n", key, value);
		}

		// 간단하게 가져오는 법 : 확장 for
		// 2) for( : ) 확장 for

		for (String key : keySet) { // set 수에 들어있는 개수만큼 반복하겠습니다. 그리고 그 값을 key에다가 받게씁니ek.
			Integer value = map.get(key); // 위의 것처럼 반복자 가져와서 하나하나 봐도 되고,for 확장자처럼 한번에 할 ㅅ ㅜ도 있음.
			System.out.printf("key: %5s value: %5d \n", key, value);
		}

		System.out.println("end of program");
		// 키 값 받아오는 메소드 keySet -> 배열처럼 순서가 없어서 iterator 이용 -> 반복요소를 hasNext를 통해 묻고 ->
		// key에 값을 받아서 키에 할당된 밸류를 변수에 넣는다.

	}
}
