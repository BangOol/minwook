package com.prod.emp;

import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Scanner scn = new Scanner(System.in);

		// 메뉴: 1.사원리스트 2.입력 3.수정 4.삭제 5.한건조희 6.두건조희 9.종료
		while (true) {
			System.out.println("1.사원리스트 2.입력 3.수정 4.삭제 5.한건조희 9.종료");
			int menu = scn.nextInt();

			if (menu == 1) { // 리스트
				List<Employee> list = dao.empList();

				System.out.println("사원리스트.");
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}

			} else if (menu == 2) { // 입력
				Employee employee = new Employee();
				System.out.println("사원번호를 입력하세요.  ex)101");
				int id = scn.nextInt();
				employee.setEmployeeId(id);
				System.out.println("성을 입력하세요.  ex) King");
				String lastName = scn.next();
				employee.setLastName(lastName);
				System.out.println("이메일을 입력하세요  ex) killdong@email.com");
				String email = scn.next();
				employee.setEmail(email);
				System.out.println("고용일을 입력하세요  ex) 2015-05-05");
				String hireDate = scn.next();
				employee.setHireDate(hireDate);
				System.out.println("직군을 입력하세요  ex) IT_PROG");
				String jobId = scn.next();
				employee.setJobId(jobId);

				boolean tf = dao.insertEmp(employee);
				if(tf == true) {
					System.out.println("성공");
				} else {
					System.out.println("실패");
				}
			} else if (menu == 3) { // 수정
				Employee employee = new Employee();
				System.out.println("수정할 이름을 입력하세요");
				String firstName = scn.next();
				employee.setFirstName(firstName);

				System.out.println("수정할 전화번호를 입력하세요");
				String phoneNumber = scn.next();
				employee.setPhoneNumber(phoneNumber);

				System.out.println("수정할 월급을 입력하세요");
				int salary = scn.nextInt();
				employee.setSalary(salary);

				System.out.println("수정하고 싶은 사람의 사원번호를 입력하세요");
				int id = scn.nextInt();
				employee.setEmployeeId(id);

				dao.updateEmp(employee);

			} else if (menu == 4) { // 삭제
				System.out.println("삭제하실 사원번호를 입력하세요");
				int id = scn.nextInt();
				dao.deleteEmp(id);

			} else if (menu == 5) { // 한건조회 - 사원번호
				System.out.println("조회하실 사원번호를 입력하세요");
				int id = scn.nextInt();
				Employee emp = dao.searchEmp(id);
				if (emp == null) {
					System.out.println("조회결과 x");
				} else if (emp != null) {
					System.out.println(emp.toString());
				}

				// 조회한 사원번호에 대한 정보를 serachEmp에서 실행코드를 만든다.

			} else if (menu == 6) { //두건 조회
				System.out.println("찾을 사원번호를 입력하세요");
				int empId = scn.nextInt();
				System.out.println("이름을 일부라도 입력하세요");
				String firstName = scn.next();
				List<Employee> list = dao.searchTwoEmp(empId, firstName);
				for(Employee i : list) {
					System.out.println(i.toString());
				}
				
			} else if (menu == 9) { // 종료
				System.out.println("시스템 종료");
				break;
			}
		} // end of while
		System.out.println("end of program");
		scn.close();

	} // end of main
}
