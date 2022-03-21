package com.edu;

public class ArraySort {

	public static void sorting(int[] Ary) {

		int loopCnt = Ary.length - 1;
		for (int Cnt = 0; Cnt < loopCnt; Cnt++) {
			int temp = Ary[0];

			for (int i = 0; i < loopCnt; i++) {
				temp = Ary[i];

				if (Ary[i] > Ary[1 + i]) {
					Ary[i] = Ary[1 + i];
					Ary[1 + i] = temp; // 25 34 48 12 ///
				}

			}
		}
	}

	public static void main(String[] args) {
		// int[] intAry 선언 ==> {34,25,48,12};
		// intAry[i] --> intAry[i + 1];
		int[] intAry = { 34, 25, 48, 12 }; // 28 , 34
		int[] intAry2 = { 334, 215, 148, 112 };
		sorting(intAry);
		sorting(intAry2);

		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i] + " ");

		}
		

		for (int i = 0; i < intAry2.length; i++)
			System.out.println(intAry2[i] + " ");

	}

}
