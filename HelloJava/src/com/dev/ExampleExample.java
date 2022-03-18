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

	
	public static String bankname;
	static {
		bankname = "한일은행";
	}  //정적 블록이라 해서 딱 한번?만 실행 
	
	public static void showBankName() {
		System.out.println("한일은행입니다.");
	}
	




// 절차프로그램(데이터, 함수)  -- 데이터를 절차대로처리하는게 함수 ----> 그래서 객체가 탄생(데이터를 담을 수 있는 공간), 기능을 수행할 수 있는 메소드(함수)
	// clss를 직접쓰는건 아니고, 틀일뿐. 쓰려면 인스턴스를 써야함 
	
	
	
	public ExampleExample() {
		super();
	}








	public ExampleExample(String userNo, String userName) {
		super();
		this.userNo = userNo;
		this.userName = userName;
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





	public String toString() {
		return "ExampleExample [userNo=" + userNo + ", userName=" + userName + ", userMoney=" + userMoney + "]";
	}





	public void getUserMoney(int userMoney) {
		
	}

	
	
	
	
	
}
