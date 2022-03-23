package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	// 오류: Error(우리가처리할 수 없는것들), Exception(잘못된 케이스 실행 시)
	// compile error, 실행을 해야 오류확인 할 수 있는 것:runtime error;
	
	public static void main(String[] args) {

		try {
			double result = 3 / 0; // error가 날 수 있는 부분을 이렇게 예외처리할 수 있다. 이렇게 에러가 안뜨는 경우는 개발자가 어느정도 알아야하는 예외처리
			System.out.println("결과:  " + result); // 이렇게 해서 끝까지 프로그램이 실행될 수 있도록 하는 것이 예외처리
		} catch (ArithmeticException e) {			// 프로그램 끝까지 진행되도록 하는게 중요한 ㅡㅅ
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		try {
		int menu = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하지 않으셨습니다.");
		}
		
		scn.close();
		System.out.println("End of Program");
	}

}
