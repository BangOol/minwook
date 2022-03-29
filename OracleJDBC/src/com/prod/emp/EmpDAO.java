package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO{
	
	
	//전체조회
	public List<Employee> empList(){
		List<Employee> employees = new ArrayList<Employee>();
		conn = super.getConnect(); // super 안써도 됨.
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery(); // rs는 set 컬렉션
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
				emp.setHireDate(rs.getString("hire_date").substring(0,10)); //substring 이 잘라내는 것. 시간분초 잘라냄
				emp.setSalary(rs.getInt("salary"));
				
				employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return employees;
	}
	//한건조회
	
	//입력처리
	
	//수정처리
	
	//삭제처리
	
	
}
