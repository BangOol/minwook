package com.prod;

public class Homework {

	private String userId;
	private String userGrade;
	private String userPhone;
	private int userPoint;
	
	
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	
	
	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
	
	public String getUserGrade() {
		
		return userGrade;
	}
	
	
	
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	public String getUserPhone() {
		return userPhone;
	}
	
	
	
	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	
	public int getUserPoint() {
		return userPoint;
	}
	
	
	
	public String getUserInfo() {
		String result = this.userId + "의 번호는 " + this.userPhone + "이고 등급은 " //
				+ this.userGrade + "이고 포인트는 " + this.userPoint + " 입니다." ;
		return result;
	}
	
	
	



		
	}
	
	
	

