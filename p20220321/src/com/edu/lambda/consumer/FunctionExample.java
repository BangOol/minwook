package com.edu.lambda.consumer;

import java.util.function.ToIntFunction;

import com.edu.collect.Student;

public class FunctionExample {
	public static void main(String[] args) {
//		ToIntFunction<Student> func = (Student student) -> { 		
//				return student.getEngScore() + student.getKorScore();
//			
//		};
//			
//		int result =func.applyAsInt(new Student(101, "Hong" , 80 , 90));
//		System.out.println("결과값:" + result);
//	
//	}
		ToIntFunction<Student> func =
				(student) -> student.getEngScore() + student.getKorScore();
				//function 타입 인터페이스: 매핑작업(Student -> int)
	
		
	int result =func.applyAsInt(new Student(101, "Hong" , 80 , 90));
	System.out.println("결과값:" + result);

}
	
	
	
	
	
}
