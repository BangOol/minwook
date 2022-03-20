package com.dev;

public class ExampleAccount {
	
	private String bankAccount;
	private String bankPassword;
	private String bankName;
	private int bankMoney;
	
	
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankPassword() {
		return bankPassword;
	}
	public void setBankPassword(String bankPassword) {
		this.bankPassword = bankPassword;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankMoney() {
		return bankMoney;
	}
	public void setBankMoney(int bankMoney) {
		this.bankMoney = bankMoney;
	}
	
	
	public ExampleAccount(String bankAccount, String bankPassword) {
		super();
		this.bankAccount = bankAccount;
		this.bankPassword = bankPassword;
		// 계좌번호, 계좌 비밀번호
	}
	public ExampleAccount(String bankAccount, String bankPassword, String bankName, int bankMoney) {
		super();
		this.bankAccount = bankAccount;
		this.bankPassword = bankPassword;
		this.bankName = bankName;
		this.bankMoney = bankMoney;
		// 계좌번호, 계좌 비밀번호, 이름, 금액
	}
	
	
	public ExampleAccount(String bankAccount, String bankPassword, int bankMoney) {
		super();
		this.bankAccount = bankAccount;
		this.bankPassword = bankPassword;
		this.bankMoney = bankMoney;
		// 계좌번호, 계좌 비밀번호, 금액
	}
	
	
	public ExampleAccount(String bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}
	
	
	
	
	
	//메뉴 출력
	// 1. 계좌 생성 : 계좌 번호, 이름, 계좌비밀번호, 금액 /	
	// 2. 입금 : (계좌 번호, 비밀번호 입력) - (입금 금액 확인) - (기존 금액 + 입금 금액)  (단, >0) /
	// 3. 출금 : (계좌 번호, 비밀번호 입력) - (출금 금액 확인) - (기존 금액 - 출금 금액)  (단, >0) /
	// 4. 송금 : (보내는 사람의 계좌 번호, 비밀번호 입력 ) - ( 보낼 금액, 받는 사람의 계좌번호 확인) - (보내는 사람: 기존 금액 - 출금 금액),(받는 사람: 기존 금액 + 입금 금액)(단, >0)
	// 5. 계좌 확인 : (계좌 번호, 비밀번호 입력) - (계좌 번호, 이름, 계좌비밀번호, 금액 출력)
	// 6. 메뉴 다시 보기 : printMenu 재 출력
	// 7. 종료 : break;
	
}
