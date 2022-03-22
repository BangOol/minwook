package com.edu;

public class ComFriend extends Friend {
// 회가 : 회사이름, 회사업무
	private String company;
	private String job;

	// public ComFriend(){} //부모 클래스가 가지고 잇는 기본 생성자를 호출함 : super();

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public ComFriend() {

	}

	public ComFriend(String name, int age, double height, double weight, String phone, String company, String job) {
		super(name, age, height, weight, phone);
		this.company = company;
		this.job = job;
	}

	@Override
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고 \n";
		str += "나이는 " + super.getAge() + "이고 \n";
		str += "연락처는 " + this.getPhone() + "입니다. \n";
		str += "==============< 추가 정보 >==============\n";
		str += "회사이름은 " + this.getCompany() + "이고 \n";
		str += "하는 일은 " + this.getJob() + "입니다. \n";
		return str;
	}

}
