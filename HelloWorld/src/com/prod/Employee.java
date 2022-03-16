package com.prod;

public class Employee {
	// field.
	private int employeeId;
	private String employeeName;
	private String department;
	private String job;
	private int salary;						// 이렇게 private 를 걸어놓고, 밑의 메소드를 통해서 다른 곳에서 사용할 수 있게 할 수 있다.
	
	
	
	
	public	void setSalary(int salary) {
		if(salary < 0) {
			this.salary = 10000;
		} else {
			this.salary = salary;					//필드, 매개변수 이름이 다 같ㅇ서
			}
		}
		
	public int getSalary() {
		return this.salary;
		}
	
	
	
	
	public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		
	public int getEmployeeId() {
		return this.employeeId;
		}
		
	
	
	
	public void setEmployeeName(String employeeName) {
			this.employeeName =employeeName;
		}
		
	public String getEmployeeName() {
			return this.employeeName;
		}
	
	
	
	public void setEmployeeDepartment(String employeeDepartment) {
		this.department =employeeDepartment;
	}
	
	public String getEmployeeDepartment() {
		return this.department;
	}
		
	
	
	
	public void setEmployeejob(String job) {
		this.job =job;
	}
	
	public String getEmployeejob() {
		return this.job;
	}
	
	
	
	public String getEmpInfo() {
		String result = this.employeeName + "의 부서는 " + this.department + "이고 직무는" //
						+ this.job + "이고 급여는" + this.salary + "입니다."; // 왜  괄호 안쳐도 되지?
		return result;
	}
	
}
	
	// 
