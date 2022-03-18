package com.dev;

public class Account {
	// 계좌정보, 예금주, 예금액
	// field.
	private String accNo;
	private String accName;
	private int money;
	
	
	//constructor
	// 생성자: 목적은 필드의 초기값을 지정하기 위함
	// 즉, 원래라면 일일히 필드에 대한 값을 지정하기 위해 타이핑을 많이 해야 했지만
	// 생성자를 통해 미리 그 형태를 지정함으로써 많은 양의 정보를 적은 줄로 해결할 수 있다는거 아닐가
	
	public Account(String accNo, String accName, int money) { //계좌번호, 예금주, 통장금액
		this.accNo = accNo;
		this.accName = accName;
		this.money = money;
	}
	
	
	//Constructor overloading
	
	
	
	
	// method.
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", money=" + money + "]";
	}
	
	
	
	
	
	
}
