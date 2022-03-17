package com.dev;
import java.util.Scanner;

// ++ 파일경로와 스캐너 사용
public class BankApp {
	
	// ++ 다른 메소드에도 인식을 하기 위해서 Account와 Scanner 인스턴스를 밖에 꺼냄.
	// ++ 그렇게 함으로써 다른 메소드에서도 인식이 되고, 사용이 가능해짐.
	// ++ main 안에서도 호출을 하기 위해서 static으로 메모리에 인식시켜야...
	static Account[] banks = new Account[100]; 
	static Scanner scn = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
	// ++ 반복문 while와 그 안의 if- else if 구문으로 번호에 따라서 통장개설, 인출, 출금, 금액확인, 리스트 확인을 체크하고자 함.
	// ++ 다만 main 메소드에서 과정을 나타내고 싶지 않고, 추가로 public static void 메소드를 통해 초기값을 설정하고자 했음.
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
		// ++ 메뉴 출력 기능
		// ++ 메뉴에 들어간 글을 변수에 저장하고, 출력하는 메소드를 만들었음.
		// ++ 생성자는 아니나, static을 사용하여 처음 컴퓨터가 메모리를 인식할 때 이 내용을 초기값으로 기억하며
		// ++ public 으로 다른 패키지에서도 사용할 수 있도록 설정되었다.
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
		// ++ 통장개설
		// ++ 스캐너 기능과 문자출력을 하고, 우리가 입력한 값들을 새로운 aacnt라는 인스턴스에 저장하고자 하였음.
		// ++ 이 때, 우리가 밖에서 지정해놓았었던 Account[] banks 인스턴스라는 계좌들을5 저장하는 곳에 이 accnt에 기입된 내용들을 저장하고자 하였기에 for 구문을 사용
		// ++ 
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
		String ano =scn.next();
		int amt = scn.nextInt();
		int checkCnt = 0;  // 조회가 되었는지 체크 여부 변수
		
		for(int i =0; i <banks.length; i++) { // ++ 계좌번호가 있을경우
			if(banks[i] !=null && banks[i].getAccNo().equals(ano)){ // ++ 계좌번호가 조회되었을 때
				
				checkCnt = 1; // 실행되었단느 의미
				int currAmt = banks[i].getMoney();
				if(currAmt + amt > 100000) {
					checkCnt = 2;
					break; //++ 실행되었지만 예금액이 10만원을 넘겼을 때 초과하지못하도록
				}
				banks[i].setMoney(currAmt + amt); // 잔액 + 입금액
				break;
			}
		}
		
		if(checkCnt == 1) {
			System.out.println("정상적으로 처리되었습니다");
		}else if(checkCnt == 2) {
			System.out.println("한도금액을 초과했습니다.");
		}
		else {
			System.out.println("처리되지 못했습니다.");
		}
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