package com.dev;
import java.util.Scanner;

public class Example {
	static ExampleExample[] banks = new ExampleExample[100]; 
	static Scanner scn = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("하실 작업을 선택해주세요.");
		
		while(true) {
			printMenu();
			int Button = scn.nextInt();
			if(Button == 1 ) {
				createAccount();
			} else if( Button == 2 ) {
				deposit();
			} else if( Button == 3) {
				withdraw();
			} else if(Button == 4) {
				findAccountMoney();
			} else if (Button == 5) {
				System.out.println("종료합니다.");
				break;
			} else if (Button == 9) {
				
			}
			
		}
		
		
		
		
	}
	
	
	
	public static void printMenu() {
		String menu = "1: 계좌생성\r\n"
				+	"2: 입금 \r\n"
				+ 	"3: 출금 \r\\n"
				+ 	"4: 잔액조회  \r\n"
				+   "5: 종료 \r\n"
				+   "9: showList";
		System.out.println(menu);
		
	}
	
	
	public static void createAccount() {
		System.out.println("계좌번호를 입력하세요");
		String userNo = scn.next();
		System.out.println("이름을 입력하세요");
		String userName = scn.next();
		System.out.println("초기 입금액을 선택하세요.");
		int userMoney = scn.nextInt();
		
		ExampleExample account = new ExampleExample(userNo, userName, userMoney);
		
		for(int i = 0; i <banks.length; i++) {
			if(banks[i] == null) {
				banks[i] = account;
				break;
			}
		}
	}
	
	public static void deposit() {
		System.out.println("계좌 번호를 입력해주세요");
		String searchNo = scn.next();
		System.out.println("넣을 금액을 입력해주세요.");
		int depositMoney = scn.nextInt();
		int checkCnt = 0;
		
		for(int i = 0; i < banks.length; i++) {
			if(banks[i] != null && banks[i].getUserNo().equals(searchNo)) {
				System.out.println("소유주 " + banks[i].getUserName() + "님으로 확인되었습니다.");
				checkCnt = 1;  // 실행이 되었습니다.
				int currAmt = banks[i].getUserMoney();
				if(depositMoney + currAmt > 100000) {
					checkCnt = 2;
				} else {
				banks[i].setUserMoney(currAmt + depositMoney);
				System.out.println(banks[i].getUserMoney());
				}
			}
			
			
			if(checkCnt == 1) {
				System.out.println("정상처리되었습니다.");
				break;
			}  else if(checkCnt == 2) {
				System.out.println("한도금액을 초과했습니다.");
				System.out.println("현재 금액은 " +banks[i].getUserMoney() + "원 입니다.");
				break;
			} else {
				System.out.println("처리되지 못했습니다.");
				break;
			}
			
		}
		
	}
	
	
	public static void findAccountMoney() {
		System.out.println("조회기능");
		System.out.println("계좌번호를 입력해주세요");
		
		String putAccountNo = scn.next();
		for(int i = 0; i < banks.length; i++) {
			
			if(banks[i].getUserNo().equals(putAccountNo)) {
				System.out.println(banks[i]);
				System.out.println("출력되었습니다.");
				break;
			}
		}
		
	}
	
	
	public static void withdraw() {
		System.out.println("계좌번호를 입력해주세요");
		
		String outAccountNo = scn.next();
		for(int i = 0; i < banks.length; i++) {
			
			if(banks[i].getUserNo().equals(outAccountNo)) {
				System.out.println("소유주 " + banks[i].getUserName() + "님으로 확인되었습니다.");
				System.out.println("출금할 금액을 입력하세요");
				int willIn = scn.nextInt();
				
				int output = 1;
				int willOut = banks[i].getUserMoney();

				if(willOut - willIn < 0) {
					output = 2;
				} else {
					banks[i].setUserMoney(willOut - willIn);
					System.out.println("현재 금액은 " + (willOut - willIn) + "원 입니다.");
				}
				
				if(output == 1) {
					System.out.println("정상처리되었습니다.");
					break;
				} else if(output == 2) {
					System.out.println("현재 잔액보다 큰 금액을 입력하였습니다.");
					break;
				}
			}
			
			
			}
		
	}
	
}
