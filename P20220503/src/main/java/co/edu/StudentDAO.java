package co.edu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO  extends DAO {

	// id로 한 건 조회
	public Student searchStudent(String id) {
		conn = getConnect();
		
		String sql = "Select * from student_info where student_number = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1,Integer.parseInt(id));
			rs = psmt.executeQuery();
			if(rs.next()) {
				Student stud = new Student();
				stud.setStudentNo(rs.getInt("student_number"));
				stud.setStudentName(rs.getString("student_name"));
				stud.setEngScore(rs.getInt("eng_score"));
				stud.setKorScore(rs.getInt("kor_score"));
				return stud;
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return null;
	}
	
	
	public boolean addStudent(Student stud) {
		conn = getConnect();
		String sql = "insert into student_info values(?,?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, stud.getStudentNo());
			psmt.setString(2, stud.getStudentName());	
			psmt.setInt(3, stud.getEngScore());
			psmt.setInt(4, stud.getKorScore());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력 완료.");
			
			if(r>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return false;
	}
	
	
	// 전체조회.
	public List<Student> studentList() {
		conn = getConnect();
		List<Student> list = new ArrayList<Student>();
		try {
			psmt = conn.prepareStatement("select * from student_info");
			rs = psmt.executeQuery();
			while(rs.next()) {
				Student student = new Student();
				student.setStudentNo(rs.getInt("student_number"));
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
	
	
	// 한건삭제
	public boolean removeStudent(String id) {
		conn = getConnect();
		
		String sql = "delete from student_info where student_number =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, Integer.parseInt(id));
			
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 삭제.");
			if(r>0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return false;
		}
		
	}

	// 수정
	public boolean modifyStudent(Student std) {
		
		conn = getConnect();
		
		String sql = "UPDATE student_info set student_name=? , eng_score = ? , kor_score = ? where student_number = ?";
		
		try {
			psmt= conn.prepareStatement(sql);
			psmt.setInt(4, std.getStudentNo());
			psmt.setString(1, std.getStudentName());
			psmt.setInt(2, std.getEngScore());
			psmt.setInt(3, std.getKorScore());
			
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 변경");
			if(r > 0) {
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			return false;
		}
	}
}

