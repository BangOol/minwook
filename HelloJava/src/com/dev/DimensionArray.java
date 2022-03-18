package com.dev;

public class DimensionArray {
	public static void main(String[] args) {
		
		int[][] intRecAry = new int[5][5];
		int cntNum = 1;
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j < 5 ;j++) {
				intRecAry[i][j] = cntNum++;

			}
		}
		
		for(int i = 0; i<5; i++) {
			for(int j = 4; j >= 0 ;j--) {
//				System.out.println(intRecAry[i][j]);
				System.out.printf("%3d", intRecAry[i][j]);
			}
			System.out.println();
		}
		
//		int[] intAry = {20, 38, 45 };   //20|38|45
//		System.out.println(intAry[0]); // 20 
//		
//		int [][] intDimAry = {{23, 34}, {12, 34, 43}, {37,39}};
//		int[] anotherAry = intDimAry[0];
//		System.out.println(anotherAry[0] ==  intDimAry[0][0]);
//		
//		System.out.println(intDimAry[0][1]);
//		intDimAry[1][1] = 33;
//		System.out.println(intDimAry[1][1]);
		
	}
}
