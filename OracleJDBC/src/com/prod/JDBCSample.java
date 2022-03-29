package com.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 1. ojdbc 라이브러리를 추가  2. 오라클 DB 연결(DB 이름, 접속주소, 계정-비밀번호(hr,hr))  3.Connection 객체 가져오기
// 4. query 실행(Statement 라이브러리, PreparedStatement 라이브러리를 통해 실행할 것.) (PreparedStatement 이용하면 조금 더쉬움)

// 라이브러리 추가
//C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\obdbc_6_g.jar
//C:\Dev에 복사
//OracleJDBC - Build path - configure build path - library - extenal JARS - obdc_6_g.jar open




//연결작업해주는 클래스 -> DAO
//데이터 값을 받아놓기 위한 Employee
//CRUD 작업 클래스 -> EmpDAO
//main 메소드 -> EmpExe




public class JDBCSample {
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;

	static PreparedStatement psmt; // stmt 대신 쓰면 됨

	public static void disconnect() {
		try {
			if (rs != null)
				rs.close();
//			if(stmt != null)
//				stmt.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
			// null 값을 resource하면 예외발생

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnect() {// main 메소드에서 호출하기에 static
		try {
//			DriverManagr
			// DB 연결
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Class 클래스 forName 메소드를 이용해 "" 안 파일을 찾음. 왼쪽 라이브러리를 통해
																// 확인할 수 있음.
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); // (오라클 접속 주소, 유저,
																									// 비밀번호)
			// 오라클 접속 주소: localhost로 ip 주소 대체하고, 1521 포트 값을 통해 자바? 를 불러옴
			// connection type 객체를 리턴해줌.
			// sql - java 연결을 위한 작업 중
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("연결성공.");
		return conn;
	}

	public static void main(String[] args) {
		conn = getConnect();

		// Statement 생성.
		try {
//			stmt = conn.createStatement(); //쿼리 실행하는 statement 만드는 것.

			// 입력(employee_id, last_name, hire_date, email, job_id)
			int emp_id = 302;
			String last_name = "홍길동";
			String hire_date = "2021-03-05";
			String email = "kildong@email.com";
			String job = "IT_PROG";

			String fn = "kildong";
			String pn = "010-xxxx-7xx4";
			int salary = 8000;

//			String sql = "update emp_java \r\n"// \r\n 거슬리면 " " 스페이스로 대체
//					+ "set first_name = '"+fn+"',\r\n"
//					+ "phone_number = '"+pn+"',\r\n"
//					+ "email = '"+email+"',\r\n"
//					+ "salary = "+salary+" \r\n"
//					+ "where employee_id = "+emp_id+""; (stmt 사용 때)

//			String sql = "update emp_java \r\n" 
//			+ "	+ set first_name = ?," // 변수화 한듯
//					+ " + phone_number = ?," // psmt 이용했을 때가 그나마 자유롭게 할 수 있다.
//					+ "	+ email =?," 
//					+ "	+ salary = ?," 
//					+ "	+ \\\"where employee_id = ?,"; 생성
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, fn);
//			psmt.setString(2, pn);
//			psmt.setString(3, email);
//			psmt.setInt(4, emp_id);
//			String sql = "insert into emp_java(employee_id, last_name, email, hire_date, job_id)"
//					+ "values ("+emp_id+", '"+last_name+"', '"+email+"' , '"+hire_date+"' , '"+job+"')";
//			int r = stmt.executeUpdate(sql); // executeUpdate : 입력, 수정, 삭제는 executeUpdate를 이용
//			int r = psmt.executeUpdate(sql); //psmt는 생성 시점에 실행이 되는 기능이 있어서 빼야 한단다.                     stmt
//			System.out.println(r + "건 수정됨.");
			
			
			
			// 삭제
			String sql = "delete emp_java \r\n" 
					+ "where employee_id = ? ";// 변수화 한듯
			
		 	psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp_id);
			
	 		int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");

//			//조회
//			rs = stmt.executeQuery("select * from emp_java"); //실행 
//			while(rs.next()) { //rs.next : 데이터 10건이 들어오면 ,10건을 가리키는 지시자가 있을 때 데이터 가져올 것이 있는지 물어보고, 한 건씩 가져오는거?
//				System.out.println("사원번호: " + rs.getInt("employee_id"));  // employee_id 값을 가져오도록 하겠다.
//				System.out.println("이름: " + rs.getString("first_name")); // 문자열이라면 first_name이라는 값을 가져오도록 하겠다.
//			}
			
			
			
			
			
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} // import java.sql.Statement

		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} // try 안에 있어서 인식 못해서 Connection conn를 밖으로 냄.

		disconnect();

	}
}
