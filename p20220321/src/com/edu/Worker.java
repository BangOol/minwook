package com.edu;

public class Worker extends Person{ //person을 상속받음
	//(직장명, 직급) , (나이, 이름, 키, 몸무게)
	
	private String Company;
	private String job;
	
	
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}
