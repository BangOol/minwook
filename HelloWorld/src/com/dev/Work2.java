package com.dev;
import java.util.Scanner;


public class Work2 {
	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("3개의 숫자를 입력하세요"); // num1, num2, num3 은 다른 숫자일 
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();	
	
		
		if(num1 < num2 && num2 < num3) {
			System.out.println(num1 + "," + num2 + "," + num3);
		} else if(num1 < num3 && num3 < num2) {
			System.out.println(num1 + "," + num3 + "," + num2);
		} else if(num2 < num1 && num1 < num3) {
			System.out.println(num2 + "," + num1 + "," + num3);
		} else if(num2 < num3 && num3 < num1) {
			System.out.println(num2 + "," + num3 + "," + num1);
		} else if(num3 < num1 && num1 < num2) {
			System.out.println(num3 + "," + num1 + "," + num2);
		} else if(num3 < num2 && num2 < num1) {
			System.out.println(num3 + "," + num2 + "," + num1);
		}
		
		scn.close();
	}
}



//a= (num1>num2)&&(num1>num3)?num1:(num3>num2?num3:num2);
////num1이 num2보다 큰지 비교,num1이 num3보다 큰지 비교 둘 다 참이면 num1이 가장크다. 
//c = (num2>num1)&&(num3>num1)?num1:(num2>num3?num3:num2);
////num2이 num1보다 큰지 비교,num3이 num1보다 큰지 비교해서 num1이 제일 작으면 저장 아니면 뒤의 수식 수행
//b= (num1>num2)?((num1>num3)?((num2>num3)?num2:num3):num1):((num2>num3)?((num1>num3)?num1:num3):num2);
////                                    ((num1>num3)?((num2>num3)?num2:num3):num1)앞 항
////                                                               뒷 항((num2>num3)?((num1>num3)?num1:num3):num2)
//
//
//
//
//a = ((num1 > num2) && (num1 > num3)) ? num1 : (num2 < num3 ? num3 : num2);
//b = ((num1 < num2) && (num2 < num3)) ? num2 : (num2 > num3 ? (num1 < num3 ? num3 : (num1 < num2 ? num1 : num2)) : (num2));
//c = ((num3 > num1) && (num2 > num1)) ? num1 : (num2 < num3 ? num2 : num3); 
//	
//
//System.out.println(a);
//System.out.println(b);
//System.out.println(c);
//}