package com.dev;

public class ExampleExample {
	
	private String userNo;
	private String userName;
	private int userMoney;
	
	public ExampleExample(String userNo, String userName, int userMoney) {
		this.userNo = userNo;
		this.userName = userName;
		this.userMoney = userMoney;
		// 생성자를 만들려면 이름이 같아야 한다!! ㄱOㄴ
		
	}

 
	
	
	
	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserMoney() {
		return userMoney;
	}

	public void setUserMoney(int userMoney) {
		this.userMoney = userMoney;
	}





	@Override
	public String toString() {
		return "ExampleExample [userNo=" + userNo + ", userName=" + userName + ", userMoney=" + userMoney + "]";
	}

	
	
	
	
	
}
