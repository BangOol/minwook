package com.edu.collect;

import java.util.*;
import java.io.*;

public class StudentServiceFile implements StudentService{
	
	List<Student> list = new ArrayList<Student>();
	File file; // 

	
	
	
	
	
	@Override
	public void insertStudent(Student student) {
		list.add(student);
	}

	@Override
	public Student getStudent(int studentNumber) {
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getStudentNumber() == studentNumber) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public List<Student> studentList() {
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
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getStudentNumber() == number) {
				list.remove(i);
			} 
		}
	}

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> searchList = new ArrayList<Student>(); // 찾았다고 종료해선 안된다.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentName().equals(name)) {
				//같은 이름이 이쓴지 찾아보고 있으면 searchList.add
				searchList.add(list.get(i));  // 이름을 저장해야되기 때문에 list.get(i)를 이용해서 add를 한다?
			} return searchList; // add 안에 그 값을넣어야 하는데 곧바로 i값을 넣을 수 없으니, 
		
		}return null;
	}
	
	
	
	public void saveToFile() {
		//작성했던 ArrayList<student> list -> 파일저장
		try {
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(Student stud : list) {
				bw.write(stud.getStudentNumber() + "," + stud.getStudentName()//
				+ ", " + stud.getEngScore() + ", " + stud.getKorScore());
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
