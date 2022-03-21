package com.dev;

import java.util.Scanner;

//메뉴 출력
// 1. 계좌 생성 : 계좌 번호, 이름, 계좌비밀번호, 금액
// 2. 입금 : (계좌 번호, 비밀번호 입력) - (입금 금액 확인) - (기존 금액 + 입금 금액)  (단, >0)
// 3. 출금 : (계좌 번호, 비밀번호 입력) - (출금 금액 확인) - (기존 금액 - 출금 금액)  (단, >0)
// 4. 송금 : (보내는 사람의 계좌 번호, 비밀번호 입력 ) - ( 보낼 금액, 받는 사람의 계좌번호 확인) - (보내는 사람: 기존 금액 - 출금 금액),(받는 사람: 기존 금액 + 입금 금액)(단, >0)
// 5. 계좌 확인 : (계좌 번호, 비밀번호 입력) - (계좌 번호, 이름, 계좌비밀번호, 금액 출력)
// 6. 메뉴 다시 보기 : printMenu 재 출력
// 7. 종료 : break;

public class ExampleBankApp {

	public static Scanner scn = new Scanner(System.in);
	public static ExampleAccount banks[] = new ExampleAccount[100];

	public static void main(String[] args) {

		while (true) {

			System.out.println("버튼을 입력하세요");
			printMenu();
			int Button = scn.nextInt();
			if (Button == 1) {
				makeAccount();

			} else if (Button == 2) {
				depositMoney();

			} else if (Button == 3) {
				withdraw();

			} else if (Button == 4) {
				remitMoney();

			} else if (Button == 5) {
				searchAccount();

			} else if (Button == 6) {
				printMenu();

			} else if (Button == 7) {
				break;

			}

		}

	}

	public static void printMenu() {
		String menu = "1. 계좌 생성 \r\n" + "2. 입금 \r\n" + "3. 출금 \r\n" + "4. 송금 \r\n" + "5. 계좌 확인 \r\n"
				+ "6. 메뉴 다시 보기 \r\n" + "7. 종료";

		System.out.println(menu);
		return;
	}

	public static void makeAccount() {

		System.out.println("계좌번호를 입력해주세요.");
		String makeAccount = scn.next();

		System.out.println("계좌 비밀번호를 입력해주세요.");
		String makePassword = scn.next();

		System.out.println("이름을 입력해주세요.");
		String makeName = scn.next();

		System.out.println("넣으실 금액을 입력해주세요.");
		int makeMoney = scn.nextInt();

		for (int i = 0; i < banks.length; i++) {

			ExampleAccount ifMakeAccount = new ExampleAccount(makeAccount, makePassword, makeName, makeMoney);

			if (banks[i] == null) {
				banks[i] = ifMakeAccount;
				break;
			}
		}

	}

	public static void depositMoney() {
		System.out.println("입금을 위한 확인을 진행하겠습니다. 계좌 번호와 비밀번호를 입력해주세요.");
		String depositAccount = scn.next();
		String depositPassword = scn.next();
		int depositCnt = 0;
		int depositMoney = 0;
		int trade;
		int MoneyBox;

		for (int i = 0; i < banks.length; i++) {
			ExampleAccount temporaryMoneyBox = findAccount(depositAccount);

			if (banks[i].getBankAccount().equals(depositAccount)
					&& banks[i].getBankPassword().equals(depositPassword)) {
				System.out.println("계좌 확인이 완료되었습니다.");
				System.out.println(" 입금하실 금액을 입력해주세요");
				MoneyBox = temporaryMoneyBox.getBankMoney();
				depositMoney = scn.nextInt();
				depositCnt = 1;

			} else {
				System.out.println("입력이 잘못되었거나 계좌가 존재하지 않습니다.");
				depositCnt = 2;
				break;
			}

			if (depositCnt == 1) {
				System.out.println("정상적으로 입금되었습니다.");
				trade = MoneyBox + depositMoney;
				banks[i].setBankMoney(trade);
				System.out.println("현재 잔액은 " + trade + "원 입니다.");
				break;
			} else if(depositCnt == 2) {
				break;
			}

		}

	}

	public static void withdraw() {
		System.out.println("출금을 위한 확인을 진행하겠습니다. 계좌 번호와 비밀번호를 입력해주세요");
		String withdrawAccount = scn.next();
		String withdrawPassword = scn.next();
		int withdrawMoney = 0;
		int temporaryMoneyBox = 0;
		int withdrawCnt = 0;
		int MoneyBox = 0;

		for (int i = 0; i < banks.length; i++) {

			ExampleAccount withdrawAccountBox = findAccount(withdrawAccount); // ++

			if (banks[i].getBankAccount().equals(withdrawAccount)
					&& banks[i].getBankPassword().equals(withdrawPassword)) {
				System.out.println("계좌 확인이 완료되었습니다.");
				withdrawCnt = 1;
			} else {
				System.out.println("입력이 잘못되었거나 계좌가 존재하지 않습니다.");
				withdrawCnt = 2;
				break;
			}

			System.out.println(" 입금하실 금액을 입력해주세요");
			withdrawMoney = scn.nextInt();
			temporaryMoneyBox = banks[i].getBankMoney();

			if (withdrawCnt == 1) {
				if (temporaryMoneyBox - withdrawMoney < 0) {
					System.out.println("출금하려는 금액이 현재 소유한 금액보다 큽니다.");
					break;
				} else {
					MoneyBox = withdrawAccountBox.getBankMoney() - withdrawMoney; // ++
					withdrawAccountBox.setBankMoney(MoneyBox);
					System.out.println("정상적으로 출금되었습니다.");
					System.out.println("현재 잔액은 " + MoneyBox + "원 입니다.");
					break;
				}

			} else if (withdrawCnt == 2) {
				System.out.println("메뉴로 돌아갑니다.");
				break;
			}

		}

	}

	public static void remitMoney() {
		System.out.println("송금을 위해 본인 확인을 하겠습니다.");
		System.out.println("본인의 계좌번호와 비밀번호를 입력하세요.");
		System.out.println("보내실 분의 계좌번호를 입력해주세요.");
		int remitToMoney;
		int checkCnt = 0;
		int sendMoney = 0;
		int receiveMoney = 0;

		String remitToAccount = scn.next();
		String remitToPassword = scn.next();
		String remitFromAccount = scn.next();

		for (int i = 0; i < banks.length; i++) {

			ExampleAccount giveAccount = findAccount(remitToAccount); // ++
			ExampleAccount receiveAccount = findAccount(remitFromAccount); // ++

			if (banks[i].getBankAccount().equals(remitToAccount)
					&& banks[i].getBankPassword().equals(remitToPassword)) {
				System.out.println("본인 확인이 완료되었습니다.");
				System.out.println("보내실 금액을 입력해주세요.");
				remitToMoney = scn.nextInt();
				checkCnt = 1;

				if (receiveAccount == null) {
					System.out.println("없는 계좌번호입니다.");
					break;
				}

				if (checkCnt == 1) {
					sendMoney = giveAccount.getBankMoney() - remitToMoney;
					receiveMoney = receiveAccount.getBankMoney() - remitToMoney;

					giveAccount.setBankMoney(sendMoney);
					receiveAccount.setBankMoney(receiveMoney);
					System.out.println("성공적으로 송금이 완료되었습니다.");
					System.out.println("보낸 분의 금액은 현재 " + sendMoney + "원 입니다.");
					System.out.println("받으신 분의 금액은 현재 " + receiveMoney + "원 입니다.");

					break;
				}

			} else if (checkCnt == 2) {
				System.out.println("잘못 입력하셨습니다.");
				break;

			}
		}
	}

	public static ExampleAccount findAccount(String bankAccount) {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i].getBankAccount().equals(bankAccount) && banks[i] != null) {
				return banks[i];
			}
		}
		return null;
	}

	public static void searchAccount() {
		System.out.println("찾고자하는 계좌번호와 비밀번호를 입력하십시오");
		String searchAccountVariable = scn.next();
		String searchPasswordVariable = scn.next();

		ExampleAccount searchTheAccount = findAccount(searchAccountVariable);
		if (searchTheAccount.getBankAccount().equals(searchAccountVariable)
				&& searchTheAccount.getBankPassword().equals(searchPasswordVariable)) {

			System.out.println("현재 계좌번호: " + searchTheAccount.getBankAccount());
			System.out.println("현재 계좌주: " + searchTheAccount.getBankName());
			System.out.println("현재 금액은 " + searchTheAccount.getBankMoney() + "원 입니다.");
		}

	}

}
