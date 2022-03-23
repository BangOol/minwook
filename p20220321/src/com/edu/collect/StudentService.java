package com.edu.collect;
import java.util.List;

public interface StudentService {
	
	public void insertStudent(Student student); // 컬렉션에 학생정보 입력
	public Student getStudent(int studentNumber); // 한 건 조회
	public List<Student> studentList();// 전체목록
	public void modifyStudent(Student student); // 컬렌션에 들어있는 요소 변경 (한 건 수정)
	//StudentApp 에서 메인 기능
	
}
