package com.edu;

public class Friend extends Person {
	// (나이, 이름, 키 ,몸무게) - 회사친구: 회사이름, 회사업무정보 추가로 담기, 학교친구: 학교이름, 전공 추가로 정보 넣기
	//person의 메소드를 그대로 이어받음
	//부보 클래스의 기본 생성자를 호출하는게 생략되어있음
	private String phone;
	
	//public Friend() {} // person이 가지고 잇는 기본 생성자를 호출
	// 부모 생성자를호출한다는 것은 인스턴스를 하나 만드는 것과 같다.
	//person 외 접근 시 에러
	
	public Friend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight); // 부모클래스에서 정의되어져 있음. +  가지고 있는 생성자 중에서 기본 생성자 호출 (매개 값 포함)
		// this.name 같은 거 줄인거
		this.phone = phone;
		
	}
	
	public Friend() {
		//기본 생성자를 사용하는 friendListApp, ComFriend, UnivFriend 를 위해 생성함
	}
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

////	@Override
//	public void toString(String args) { //friend에서 매개변수를 하나 받아서 toString이라는 이름으로 정의한다? 일단 이건 overriding과는 상관없음
////		return super.toString();
//	}
	
	@Override //annotation
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고 \n";
		str += "나이는 " + super.getAge() + "이고 \n";
		str += "연락처는 " + this.getPhone() + "입니다. \n";
		return str;
		//부모 클래스가 가지고 있는 getName 호출
	}
	
	
	// overriding => 부모클래스의 메소드를 자식클래스가 새롭게 정의.
	//이름 같아야되고, 매개변수 같아야됨.
	
	
}
