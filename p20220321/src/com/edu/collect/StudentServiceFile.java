package com.edu.collect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceFile implements StudentService {
	// StudentServiceImpl(중첩클래스의 기능을 대체하는 역할)
	// 입력, 수정, 삭제 = 파일에 저장이 되도록,
	// 필드
	List<Student> list;
	File file; //

	// 기본생성자의 파일에 저장되어있는 파일정보 읽어서, list 컬렉션에 값을 담아둘 것.
	// 생성자.
	public StudentServiceFile() {
		list = new ArrayList<Student>();
		try {
			FileReader fr = new FileReader("studentList.data"); // 저장된 파일 불러오는
			BufferedReader br = new BufferedReader(fr);
			String readBuffer = null;
			while ((readBuffer = br.readLine()) != null) {
				String[] contents = readBuffer.split(","); // ,를 기준으로 하나씩 분리할 것.(101, 홍,10, 90)
//				contents[0] <= 101, contents[1] <= 홍길동, contents[2] <= 80, contents[3] <= 90
				list.add(new Student(Integer.parseInt(contents[0]), contents[1], Integer.parseInt(contents[2]),
						Integer.parseInt(contents[3])));
			}

			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void saveToFile() {
		// 작성했던 ArrayList<student> list -> 파일저장
		

	}

	@Override
	public void insertStudent(Student student) {
		list.add(student);
	}

	@Override
	public Student getStudent(int studentNumber) {
		return null;
	}

	@Override
	public List<Student> studentList() {
		System.out.println("here1!!!" + list.size());
		
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentNumber() == student.getStudentNumber()) {
				list.get(i).setEngScore(student.getEngScore());
				list.get(i).setKorScore(student.getKorScore());
			}
		}
	}

	@Override
	public void removeList(int number) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentNumber() == number) {
				list.remove(i);
			}
		}
	}

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> searchList = new ArrayList<Student>(); // 찾았다고 종료해선 안된다.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentName().equals(name)) {
				// 같은 이름이 이쓴지 찾아보고 있으면 searchList.add
				searchList.add(list.get(i)); // 이름을 저장해야되기 때문에 list.get(i)를 이용해서 add를 한다?
			}
			return searchList; // add 안에 그 값을넣어야 하는데 곧바로 i값을 넣을 수 없으니,

		}
		return null;
	}

}
