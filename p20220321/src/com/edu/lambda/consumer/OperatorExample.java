package com.edu.lambda.consumer;

import java.util.function.IntBinaryOperator;

// Operator : 연산자의 결과
public class OperatorExample {
	public static void main(String[] args) {

		IntBinaryOperator intBin = (left, right) -> left + right;
		intBin.applyAsInt(10, 20);

		intBin = (num1, num2) -> num1 < num2 ? num1 : num2; // 어떤 기능을 선택하냐에 따라서 반환값 달라짐. 왜?
		int result = maxOrMin(intBin);
		System.out.println(result);
	}

	public static int maxOrMin(IntBinaryOperator intBin) { // 매개변수에 어떠한 기능이 들어오느냐에 따라서 반환되는 값이 달라진다.
		// 매개변수대신 기능을 넣었다?
		int[] intAry = { 85, 47, 92 };
		int result = intAry[0];
		for (int num : intAry) {
			result = intBin.applyAsInt(result, num);
		}

		return result;
	}

}
