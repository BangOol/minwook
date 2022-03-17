package com.dev;
import com.edu.Student;


public class GugudanEx {
	
	public static void main(String[] args) { 
		
//		gugudan(4);
//		for(int i = 1; i <=5; i++) {
//			printStar(i, "★○");
//			System.out.println();
		
//		int result = sum(sum(10, 20),sum(5,7));   // 매우 중요하단다
//		System.out.println("결과는 " + result);
		
		
		double result1 = divide(10,2);
		System.out.println("결과는 " + result1);
		
		int[] newAry  = {10, 20, 30};
		int result = sum(newAry);
		System.out.println(result);
		
	}
	
	
	public static double divide(double n3, double n4) {
		if(n4 == 0) {
			return 0;
		}
		return n3 / n4; 
				
	}
	
	
	public static int sum(int[] ary) {
		// 배열매개변수의 각 요소의 합을 구하는 메소드.
		int sum = 0;
		for(int i = 0; i <ary.length; i++) {
			sum += ary[i];
			
		} return sum;
		
	}
	
	
	
	
	public static void gugudan(int dan) {
		System.out.println("[    " + dan + "단" + "    ]" );
		for(int i = 1; i <=9; i++) {
			System.out.printf("%2d * %2d = %2d" , dan, i, (dan*i));
			System.out.println();
		}
	}
		
		
	public static void printStar(int runCnt, String shape) {

		for(int i = 0; i < runCnt; i++) {
			System.out.print(shape);
		}
		
	}
			
	public static void printGugudan() {
		
		for(int j = 1; j <=9; j++) {
			int cnt =j;
			for(int i =2; i<= 9; i++) {
				System.out.printf("%2d  * %2d  = %2d", i, cnt, (i*cnt));
				
			}
			System.out.println();
		}
		
	}
		
	}

//			System.out.print(" [ " + i + "단 ]" );
//			for(int m = 1; m <= 9; m++) {
//				System.out.print(m + " x " + i + " = " + (m*i));
//			}System.out.print(n + " x " + i + " = " + (n*i));
//			System.out.println(" ");
			//static을 되어있는 것은 바로 메모리가 읽어들일 수있도록 함.
		// 메소드를 실행하려면 new 클래스이름(); 을 했어야 했다.  ex) Student s1 = new Student();
		// 그런데 static이 붙는 순간, 인스턴스를 만들지 않아도 클래스 내에 있는 메소드를 작동시킬 수 있도록 한다.
//		Student.callStatic();