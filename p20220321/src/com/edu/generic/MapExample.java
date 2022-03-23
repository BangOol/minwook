package com.edu.generic;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		
		 //얘도 제너릭 타입. 근데 특이하게 Key와 Value가 쌍으로 묶여서 옴 Map<Key, value>
		 //Map: {key:value} , {key1, value} : key에 해당되는 제너릭과 value에 해당되는 제너릭을 따로 한다?
		
		Map<String, Integer> map = new HashMap<String, Integer>(); //key에 해당되는 것은 String, value는 integer 타입으로 선언
		map.put("전민욱", 80); // 키 값을 알고 있으면 밸류 값을 가져올 수 있다.
		map.put("김형민", 85); // key 값으로 들어오는 값이 중복이 되면 안됨. 
		map.put("김영민", 82); // 기존 키가 있으면 새로운 값으로 덮어쓰기 됨. 85 -> 82
		
		Integer val = map.get("전민욱"); // ++ 해당되는 키값을 던져줬을 때 그에 맞는 밸류 값을 가져온다. ++
		System.out.println(val);		// 키 값이라 하는게 규칙이 딱히 없어서 메소드 제공을 해줌.
		map.keySet();					// 키 값만 뺴서 가져오는 메소드(map컬렉션에 저장된 요소들의 키에 해당 값을 set 컬렉션에 담아줌.)
		
		
		
	}
}
