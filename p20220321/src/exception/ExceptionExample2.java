package exception;

import java.util.Calendar;
import java.util.Scanner;


//class String2 extends String {
//	//public final String(): 상속불가능 클래스를 선언할 때
//}
//
//
//public int length() {
//	
//}
//	



public class ExceptionExample2 {
	public static void main(String[] args) {
		
		
		Object obj = new String();
		obj = new Scanner(System.in); 
		obj = Calendar.getInstance();
		obj = new Object();
		System.out.println("obj의 해시코드" + obj.hashCode());
		
		
		
		
		// Objcet
		//exception
		try {
		Class.forName("java.lang.String");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}
		
		
		
		//RuntimeException: 어떠한 예외가 발생할지 모르기에, 예외가 생길만한 부분은 try를 걸어놓는게 괜ㅊ낳다.
		String str = null;
		
		try {
			str.charAt(0); //CahrSequence interface의 추상메소드
		System.out.println(str.toString());
		} catch(NullPointerException e) {
			System.out.println("인스턴스에 값을 넣어주세요.");
			e.printStackTrace();
			
		}
		
		String num = "120"; // 숫자를 담고 있는 문자열
		String num1 = "200";
		int num2 = 0;
		int num3 = 0;
		try {
		num2 = Integer.parseInt(num);
		num3 = Integer.parseInt(num1);//int로 변환
		
		str.charAt(0);
		} catch(NumberFormatException e) {
			num2 =0;
			num3 =0;
		} catch(Exception e2) {
			System.out.println("상위의 예외발생...");
			e2.printStackTrace();
			
		}
		
		
		
		System.out.println(num + " + " + num1 + " = " + (num2 + num3));
		System.out.println("end of program");
	}
	
	
	public static void showError() throws ClassNotFoundException {
		
			Class.forName("java.lang.Strings");
	}
}
