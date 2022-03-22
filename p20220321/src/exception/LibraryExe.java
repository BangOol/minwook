package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryExe {
	private static LibraryExe singleton = new LibraryExe();
	private LibraryExe(){
		
	}
	
	public static LibraryExe getInstance() {
		return singleton;
	}
	
//	public static void main(String[] args) { // 책제목, 저자, 가격 입력 후 저장
	// 리스트 보여주기
	public void run() {
		Scanner scn = new Scanner(System.in);
		Book[] library = new Book[5];
		while (true) {
			int menu = 0;
			while (true) {
				try {
					showmessage("메뉴선택: 1. 책정보입력 2. 리스트보기 3. 종료");
					menu = scn.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("숫자를 입력하세요.");
					scn.next(); // 사용자가 입력한 값 a의 값을 읽어오기만 하겠습니다.
				}
			}

			if (menu == 1) {
				showmessage("책 제목을 입력 >>");
				String title = scn.next();
				showmessage("저자를 입력 >>");
				String author = scn.next();
				int price = 0;

				while (true) {
					try {
						showmessage("금액을 입력 >>");
						price = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자를 입력하셔야합니다.");
						scn.next();
					}
				}
				Book book = new Book(title, author, price);
				for (int i = 0; i < library.length; i++) {
					if (library[i] == null)
						library[i] = book;
					break;
				}

				showmessage("저장완료");

			} else if (menu == 2) {
				for (int i = 0; i < library.length; i++) {
					if (library[i] != null)
						library[i].showInfo();
					break;
				}

			} else if (menu == 3) {
				showmessage("프로그램을 종료합니다.");
				break;
			}
		}
		showmessage("=== end of program ===");
	}

	public static void showmessage(String str) {
		for (int i = 0; i < str.length(); i++)
			System.out.print(str.charAt(i)); // charAt 각 문자를 하나씩 가져오는 메소드
		try {
			Thread.sleep(100); // Thread 메소드를 이용해서 0.3초 지연시킴. 단 예외처리를 해야 실행이 가능함.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
