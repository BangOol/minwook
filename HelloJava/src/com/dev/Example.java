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
			} else if( Button == 6) {
				
				transferAmount();
				
			} else if (Button == 9) {
				System.out.println("계좌정보를 확인합니다.");
				showList();
				
			}
			
		}
		
	}
	
	
	
	public static void printMenu() {
		String menu = "1: 계좌생성\r\n"
				+	"2: 입금 \r\n"
				+ 	"3: 출금 \r\n"
				+ 	"4: 잔액조회  \r\n"
				+   "5: 종료 \r\n"
				+   "6: 송금(송금계좌번호, 금액, 입금받는 계좌번호) \r\n" //transferAmount()
				+   "9: showList";
		System.out.println(menu);
		
	}
	
	
	public static void createAccount() {
		System.out.println("계좌번호를 입력하세요");
		String userNo = scn.next();
		
		if(searchAccountNo(userNo) != null) {
			System.out.println("이미 계좌가 존재합니다.");
			return;
			}
		
		
		System.out.println("이름을 입력하세요");
		String userName = scn.next();
		System.out.println("초기 입금액을 선택하세요.");
		int userMoney = scn.nextInt();
		
		ExampleExample account = new ExampleExample(userNo, userName, userMoney);
		
		for(int i = 0; i <banks.length; i++) {
			if(banks[i] == null) {
				banks[i] = account;
				System.out.println("생성되었습니다.");
				break;
			}
			// ++ 계좌번호 있는지 체크.
		}
	}
		
//		while(true) {
//			System.out.println("계좌생성기능");
//			
//			String userNo1;
		//	userNo1 = scn.next();		
		
//			if(searchAccountNo(userNo1) != null ) {
//				System.out.println("이미 있는 계좌번호입니다.);
//				continue;
//				}
		
			
		
	public static void transferAmount() {
		
		System.out.println("계좌번호를 입력해주세요");
		String sendingAccount = scn.next();
		
		System.out.println("받으시는 분의 계좌번호를 입력해주세요.");
		String sentAccount  = scn.next();
		System.out.println("보낼 금액을 입력하세요");
		int Money = scn.nextInt();
		int sendResult = 0;
		int takeResult = 0;
		
//		System.out.println("보낼 금액을 입력해주세요");
//		int sendingAccountMoney = scn.nextInt();
		
//		if(findAccount.getUserNo().equals(sendingAccount) && giveAccount.getUserNo().equals(sentAccount))
			
				ExampleExample findAccount = searchAccountNo(sendingAccount);
				ExampleExample giveAccount = searchAccountNo(sentAccount);
				
					if(findAccount.getUserNo().equals(sendingAccount)) {
					System.out.println(findAccount.getUserName() + "으로 확인되었습니다.");
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
					if(giveAccount.getUserNo().equals(sentAccount)) {
					System.out.println(giveAccount.getUserName() + "으로 확인되었습니다.");
					
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
				
				
					if(sendResult < 0 &&  takeResult > 100000) {
					System.out.println("설정치에 어긋난 금액입니다.");
					
					} else {
					System.out.println("성공적으로 전달하였습니다.");
					sendResult = findAccount.getUserMoney() - Money;
					takeResult = giveAccount.getUserMoney() + Money;
					findAccount.setUserMoney(sendResult);
					giveAccount.setUserMoney(takeResult);
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
			ExampleExample findAccount = searchAccountNo(putAccountNo);
			
			if(banks[i].getUserNo().equals(putAccountNo)) {
				
				System.out.println(findAccount.getUserName());
				System.out.println(findAccount.getUserMoney());
				System.out.println("출력되었습니다.");
				return;
				
			} else if(findAccount == null){
				System.out.println("없는 계좌입니다.");
				return;
			} 
			
			
		}
		
	}
	
	
	public static void withdraw() {
		System.out.println("계좌번호를 입력해주세요");
		
		String outAccountNo = scn.next();
		
//		while(true) {
//			
//			if(searchAccountNo(outAccountNo) != null) {
//				System.out.println("출금할 금액을 입력하세요");
//			
//				ExampleExample digIn  = searchAccountNo(outAccountNo);
//				int willIn = scn.nextInt();
//				int output = 1;
//				int willOut = scn.nextInt();
//
//				if(willOut - willIn < 0) {
//					output = 2;
//				} else {
//					searchAccountNo(outAccountNo);
////					digIn.setUserMoney(willOut - willIn); // 이거 작동하는지 확인해보기
//					System.out.println("현재 금액은 " + (willOut - willIn) + "원 입니다.");
//				}
//				
//				if(output == 1) {
//					System.out.println("정상처리되었습니다.");
//					break;
//				} else if(output == 2) {
//					System.out.println("현재 잔액보다 큰 금액을 입력하였습니다.");
//					break;
//				}
//			}
//				아지 ㄱ해결 못했음. banks[i].setUserMoney(willOut - willIn); 이부분이 문제임
//			}
//			
//			
//		}
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
	
	
	//100개 중 35개 저장
	public static ExampleExample searchAccountNo(String userNo) {
		
		
		for(int i = 0; i <banks.length; i++) {
			
			if(banks[i] != null && banks[i].getUserNo().equals(userNo)) {
				return banks[i];
			}
		}
		return null; // 클래스의 모든 유형의 초기값은 null(student, car) 모든 값에 대응되는 값
	}
	
	
	// 이 searchAccounNo에 추가로 기능을 달아서 금액을 넣을 수 있는 메소드로 만들 수 있겠다. 
	// 이걸 이용해서 while문ㅇ 넣을수 있음
	// reutrn banks 이고, banks.getMoney()로 금액을 얻거나 넣ㅇ르 수 있지 않으가?
	
	
	
	
	public static void showList() {
		System.out.println("이름을 입력해주세요");
		String putTheName = scn.next();
		
		
		for(int i = 0; i<banks.length; i++) {
			if(banks[i] != null && banks[i].getUserName().equals(putTheName)) {
				System.out.println(banks[i].toString());
			}
			
		}
	
	}
	
	
}
			
			
//			public static void showList() {
//				System.out.println("계좌번호를 입력해주세요");
//				String typingUserNo = scn.next();
//				
//				for(int a = 0; a < banks.length; a++) {
//					
//					if(banks[a] != null && banks[a].getUserName().equals(typingUserNo)) {
//						
//					}
//				}
				
				// 계좌번호를 입력하면 뱅크에서 그 계좌번호를 반환
				// 없으면 null 반환 해주는 메소드 생성
//			}
//		}
		
	

