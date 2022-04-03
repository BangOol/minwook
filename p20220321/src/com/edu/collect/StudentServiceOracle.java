package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceOracle extends DAO implements StudentService {

	List<Student> list = new ArrayList<Student>();

	@Override
	public void insertStudent(Student student) {
		// 연결
		conn = getConnect();
		// 쿼리 구문 작성
		String sql = "insert into student_info(student_number, student_name, eng_score, kor_score)\r\n"
				+ "values(?, ?, ?, ?)";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, student.getStudentNumber());
			psmt.setString(2, student.getStudentName());
			psmt.setInt(3, student.getEngScore());
			psmt.setInt(4, student.getKorScore());

			int r = psmt.executeUpdate();
			System.out.println(r + "건");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}

	}

	@Override
	public Student getStudent(int studentNumber) {
		//연결
		conn = getConnect();
		Student stu = new Student();
		//쿼리문 작성
		String sql = "SELECT * FROM student_info WHERE student_number = ?";
			
			//실행 준비
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, studentNumber);
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				stu.setStudentNumber(rs.getInt("student_number"));
				stu.setStudentName(rs.getString("student_name"));
				stu.setEngScore(rs.getInt("eng_score"));
				stu.setKorScore(rs.getInt("kor_score"));
				
				System.out.println(stu);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public List<Student> studentList() {
		List<Student> list = new ArrayList<Student>(); // 조회된 결과값을 담기 위한 컬렉션
		conn = getConnect();
		String sql = "select  * from student_info order by student_number";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); // 실행 건수만큼 반복자.
			while (rs.next()) { // 반복자를 통해 요소를 가지고 올 수 있는지 체크하는 메소드.
				Student student = new Student();
				student.setStudentNumber(rs.getInt("student_number"));
				student.setStudentName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));

				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		// 연결
		conn = getConnect();
		// 쿼리문 작성
		String sql = "UPDATE student_info "
				+ "set eng_score = ?, "
				+ "    kor_score = ? "
				+ "WHERE student_number = ?";
		
		//실행 준비
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, student.getEngScore());
			psmt.setInt(2, student.getKorScore());
			psmt.setInt(3, student.getStudentNumber());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		
		
	}

	@Override
	public void removeList(int number) {
		//연결
		getConnect();
		//쿼리문 작성
		String sql = "DELETE FROM student_info "
				+ "WHERE student_number = ? ";
		
		//실생 준비
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, number);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> list = new ArrayList<Student>();
		Student stu = new Student();
		
		//연결
		getConnect();
		//쿼리문 작성
		String sql = "SELECT * FROM student_info "
				+ "WHERE student_name = ? ";
		
		//준비
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				stu.setEngScore(rs.getInt("eng_score"));
				stu.setKorScore(rs.getInt("kor_score"));
				stu.setStudentName(rs.getString("student_name"));
				stu.setStudentNumber(rs.getInt("student_number"));
				
				System.out.println(stu.toString());
				list.add(stu);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return list;
	}

	@Override
	public void saveToFile() {

	}

}
