package com.dev;
import java.util.Scanner;

public class BankApp {
	
	// 다른 메소드에도 인식을 하기 위해서
	static Account[] banks = new Account[100]; //main 안에서도 호출을 하기 위해서 static으로 메모리에 인식시켜야...
	static Scanner scn = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		while(true) {
			printMenu();
			
			System.out.println("번호를 입력해주세요");
			int menu = scn.nextInt();
			
			if(menu == 1) {
				createAccount();
			} else if(menu == 2) {
				deposit();
			} else if(menu == 3) {
				withdraw();
			} else if(menu == 4) {
				findAccountMoney();
			} else if(menu == 5) {
				System.out.println("종료합니다.");
				break;
			} else if(menu == 9){
				showList();
			}
			
		}
		
		System.out.println("End of Program");
	}// end of main
	
	
	public static void printMenu() {
		// 메뉴 출력 기능
		String menu = "===========================================\r\n"
				+ " 메뉴를 보여주고 선택할 수 있도록 함.\r\n"
				+ " 1: 계좌생성(계좌번호, 예금주, 초기예금금액)"
				+ " 2:예금(계좌번호 입력, 예금액) - 최고 예금액: 10만원 금액 초과시 예금을 못함\r\n"
				+ " 3: 출금(계좌번호, 출금액) --> 잔액보다 크 금액 출금 시도 시 출금을 못하도록 설정\r\n"
				+ " 4.잔액 조회(번호 입력 시 볼 수 있도록)\r\n"
				+ " 5. 종료\r\n"
				+ " BankApp(main method), Account(계좌정보, 예금주, 잔액)(library 용도로 사용)\r\n"
				+ "선택>\r\n"
				+ "===========================================";
		System.out.println(menu);
		
		
	}
	
	
	public static void createAccount() {
		// 통장개설
		System.out.println("계좌생성기능");
		System.out.print("계좌번호입력>");
		String accNo = scn.next();
		System.out.print("예금주>");
		String accName = scn.next();
		System.out.print("예금액>");
		int accMoney = scn.nextInt();
		Account accnt = new Account(accNo, accName, accMoney);
		
		for(int i = 0; i<banks.length; i++) {
			if(banks[i] == null) {
				banks[i] = accnt;
				break;
			}
		}
	}
	
	
	public static void deposit() {
		// 예금 기능
		System.out.println("예금기능");
	}
	
	
	public static void withdraw() {
		// 인출 기능
		System.out.println("출금기능");
	}
	
	
	public static void findAccountMoney() {
		// 잔액 조회
		System.out.println("조회 기능");
	}
	
	
	public static void showList() {
		for(int i = 0; i<banks.length; i++) {
			if(banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}

	}
	
}