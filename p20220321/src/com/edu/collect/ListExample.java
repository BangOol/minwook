package com.edu.collect;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		String[] strings = new String[5];
		for(int i=0; i<strings.length; i++) {
			if(strings[i] == null) {
				strings[i] = "hello";
				break;
			}
		}
		
		
		ArrayList<String> strAry = new ArrayList<String>(); //< > 이런식으로 표현하는 것을 제너릭이라고 한다. <> 안의 타입만 담겠다는 얘기긴함
		//String 형태을 담을 수 있는 배열과 같은 리스트를 만들겠습니다, 라고 선언 +얘도 생성자라 클래스 호출 ()를 붙임
		strAry.add("hello"); //비어있는 자리에 자동으로 넣어줌
		strAry.add("world");
		strAry.remove(0); //0번째 인덱스 값을 지우겠습니다.
		strAry.set(0, "월드"); // 만약 먼저 빈 주소인 0에 값을 넣지 않고 1번의 world를 삭제 후, 월드를 넣게 되면 indexofboundsException이 발생한다.
		strAry.remove("world");
		strAry.clear();
		System.out.println("strAry.size() ==> " + strAry.size());
		
		
		for(int i =0; i<strAry.size(); i++) { // ArrayList의 경우 length가 아니라 size()를 사용한다.
			String result = strAry.get(i);
			System.out.println(result);// get을 통해서 값을 가져올 수 있음. strAry 위에 마우스를 올려서 리턴되느 ㄴ타이을 확인할 수 있다.
		}
		
		
		ArrayList<Integer> numAry = new ArrayList<Integer>();
		for(int i =0; i<numAry.size(); i++) {
			int result = numAry.get(i); // get을 위에 올려보면 받는 타입에 따라서 string int 같이 나뉜다. 올려봐라
		}
		
	}
}
