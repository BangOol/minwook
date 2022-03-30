package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {

	// 전체조회
	public List<Employee> empList() {
		List<Employee> employees = new ArrayList<Employee>();
		conn = super.getConnect(); // super 안써도 됨.

		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery(); // rs는 set 컬렉션

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10)); // substring 이 잘라내는 것. 시간분초 잘라냄
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

	// 한건조회 executeUpdate()
	public boolean insertEmp(Employee emp) {

		conn = super.getConnect();

		// sql 안의 값에서 ;를 빼야 한다. 안그러면 오류가 남.
		String sql = "insert into emp_java(employee_id, last_name, email, hire_date, job_id)\r\n"
				+ "values (?,?,?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());

			int r = psmt.executeUpdate(); // 실행된 건수 반환.
			System.out.println(r + "건 입력됨.");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			// 정상실행 or 예외 상관없이 반드시 실행할 코드를 작성
			disConnect();
		}

	}

	// 입력처리

	// 수정처리
	public void updateEmp(Employee emp) {
		conn = getConnect();
		// 쿼리 작성 -> ? 작성
		String sql = "update emp_java " + "set first_name = ?, " + "phone_number = ?, " + "salary = ? "
		// WHERE 절이 실행되기 위해선, salary 값 이후 , 가 들어가선 안된다.
				+ "WHERE employee_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			// parameter value 지정

			psmt.setString(1, emp.getFirstName());
			psmt.setString(2, emp.getPhoneNumber());
			psmt.setInt(3, emp.getSalary());
			psmt.setInt(4, emp.getEmployeeId());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}

	}

	// 삭제처리
	public void deleteEmp(int empId) {
		// 연결
		conn = getConnect();
		// 쿼리 작성 -> ? 작성
		String sql = "delete from emp_java " + "where employee_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			// parameter value 지정

			psmt.setInt(1, empId);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}

	public Employee searchEmp(int empId) {
		// Employee 인스턴스 생성
		Employee emp = new Employee();

		// 연결
		conn = getConnect();

		// 쿼리 작성 -> 찾기
		String sql = "SELECT * FROM emp_java " + "WHERE employee_id = ?";

		try {
			// DAO를 상속하는 EmpDAO이기에, DAO의 psmt를 사용할 수 있다.
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, empId);
			// rs는 쿼리의 결과가 통으로 들어오는 구문이다.
			// 우리는 이것을 나눠서 담아야 할 필요가 있고
			// 위의 while(rs.next())와 달리, 우리는 한 번만 하면? 되서 if문 씀.
			rs = psmt.executeQuery();
			if (rs.next()) {
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return emp;

	}

	public List<Employee> searchTwoEmp(int empId, String firstName) {
		
		List<Employee> employees = new ArrayList<Employee>();
		// 연결
		conn = getConnect();
		
		// 쿼리문 작성
		String sql = "SELECT * FROM emp_java "
				+ "WHERE employee_id = '?' "
				+ "AND first_name LIKE '%?%'";
		try {
			Employee emp = new Employee();
			// 실행 준비
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);
			psmt.setString(2, firstName);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
			emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			emp.setEmail(rs.getString("email"));
			emp.setJobId(rs.getString("job_id"));
			emp.setHireDate(rs.getString("hire_date").substring(0, 10)); // substring 이 잘라내는 것. 시간분초 잘라냄
			emp.setSalary(rs.getInt("salary"));
			
			employees.add(emp);
			return employees;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return employees;
		
		

		

	}

}
