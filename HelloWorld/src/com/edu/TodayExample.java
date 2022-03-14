package com.edu;
import java.util.Scanner;

//이름을 입력(String) -> scn.nextLine();
//연락처 기입(String) -> scn.nextLine();
//나이 입력(int) -> scn.nextInt();
//키 입력(double) -> scn.nextDouble();

// 이름은 : ???
// 연락처 : ??
// 나이 : ??
// 키 :??
// 적정몸무게 : ?? 
public class TodayExample {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		int age;
		double tall, BMI, kg;
		String name, tel;
		
		System.out.println("이름이 뭔가요?");
		name = scn.nextLine();
		System.out.println("연락처가 어떻게 되나요?");
		tel = scn.nextLine();
		System.out.println("나이가 어떻게 되나요?");
		age = scn.nextInt();
		System.out.println("키가 어떻게 되나요?");
		tall = scn.nextDouble();
		System.out.println("몸무게가 어떻게 되나요?");
		kg = scn.nextDouble();
		

		BMI =(double)((tall-100)*0.9);
		
		System.out.println("이름은 " + name + " 입니다.");
		System.out.println("연락처는 " + tel + " 입니다.");
		System.out.print("나이는 " + age + "살이고, ");
		System.out.println("키는 " + tall + "cm 입니다.");
		System.out.println("적정몸무게는 " + BMI + "kg 입니다.");
		
		// BMI 이상 : 과체중
		// BMI 적정 : 정상체중
		// BMI 이하 : 저체중
		
		
			
		if((BMI + 5) > kg && (BMI -5) <= kg) {
			System.out.println("현재  정상 체중입니다.");
		} else{
			System.out.println("현재  정상 체중이 아닙니다. 체중을 " + (kg - BMI) + "kg 빼셔야 합니다.");
		
		}
	
	}
}
