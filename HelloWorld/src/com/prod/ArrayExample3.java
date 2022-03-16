package com.prod;

public class ArrayExample3 {
	public static void main(String[] args) {
		
		String[] named = new String[5];
		
		named[0] = "홍길동";
		named[1] = "234";
		named[2] = "전민욱";
		named[3] = "홍홍홍";
		
		named[1] = "이삼사";	// 나중에 배열 부분의 내용을 바꾸었을 때 바꿔진다.
		named[4] = "전민욱";
		
		named[0] = null; //0번째 배열의 값을 초기화하겠다.
		
		String searchName = "전민욱";
		
		
		for(int i = 0; i < 5; i++) {
//			if(named[i] != null) {
//			System.out.println("이름: " + named[i] );
//			}\
			if(named[i] != null && named[i].equals(searchName)) {
				System.out.println((i + 1) + "번 째 위치에 있습니다."); //null 값이 있을 때는 eqauls를 사용할 수 없다. 그래서 추가 조건으로 null을 제외하면 된다.
				// 
			}
		}
		
	}
}
