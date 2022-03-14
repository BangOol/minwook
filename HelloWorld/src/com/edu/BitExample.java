package com.edu;

public class BitExample {
	public static void main(String[] args) {
		
		int num = 10;
		int result = num >> 2;
		System.out.println(result); //10을 2진수로 표현하면 1010이다.
		// 이 때, >>를 통해 각 숫자가 오른쪽으로 2칸씩 이동하게 되고, 그 결과 10(2) 이 되게 된다. 그 결과를 10진수로 바꾸었을 때 2가 된다.
		
		int num1 = 10;
		int result1 =num << 2; // 1010을 뒤로 2칸 이동하면 101000, 8 + 32 = 40 이 된다.
		System.out.println(result1);
		
		int val = 100;
		val = val + 10; // 대입 연산자 살펴보기
		System.out.println(val);
		val += 20; // val += 10; 으로도 표현이 가능하다.
		System.out.println(val);
		
		val = val - 5;
		val -= 10; // -도 마찬가지다.
		
		val = val * 2;
		val *= 2;
		
		System.out.println(val);
		
		String message = "반갑습니다. ";
		message = message + "전민욱입니다.";
		message += " 좋은 하루 되세요!"; //곱하기는 문자에서 안됨.
		System.out.println(message);
		
		int cnt = 0;
		cnt = cnt + 1;
		cnt += 1;
		cnt++;
		cnt--;
		System.out.println(cnt);
		
		
	}
}
