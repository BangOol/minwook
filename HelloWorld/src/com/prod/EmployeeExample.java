package com.prod;

public class EmployeeExample {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(); // 초기화
		
//		e1.job = "월급계산";

		e1.setEmployeeId(100);  // 값 입력을 set에 하여 ((void)) 과정을 진행시키고 return을 통해 그 값을 다른 클래스에 반환할 수 있다.
		
		e1.setEmployeeName("홍길동");
		
		e1.setSalary(-10000);
		
		e1.setEmployeeDepartment("개발부서");
		
		e1.setEmployeejob("월급계산");
		
		 
		System.out.println(e1.getEmpInfo());
		
		
		Employee e2 = new Employee();
		
		e2.setEmployeeId(1001);  
		
		e2.setEmployeeName("홍길홍");
		
		e2.setSalary(330000);
		
		e2.setEmployeeDepartment("홍보부서");
		
		e2.setEmployeejob("디자인");
		
		System.out.println(e2.getEmpInfo());
		
	}
}
