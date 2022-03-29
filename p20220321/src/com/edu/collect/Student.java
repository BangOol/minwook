package com.edu.collect;

import java.io.Serializable;

public class Student implements Serializable { // 라이브러리용으로 사용할 것임.
	// 학생번호 라는 것을 담고 싶음(int 타입), 이름(string), 영어점수(int), 국어점수(int)
	// get,set, 생성자(매개 값을 한번에 받아서 처리하는 생성자) + 기본 생성자
	// getter, setter 생성
	//

	private int studentNumber;
	private String studentName;
	private int EngScore;
	private int KorScore;

	public Student() {

	}

	public Student(int studentNumber, String studentName, int engScore, int korScore) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.EngScore = engScore;
		this.KorScore = korScore;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getEngScore() {
		return EngScore;
	}

	public void setEngScore(int engScore) {
		EngScore = engScore;
	}

	public int getKorScore() {
		return KorScore;
	}

	public void setKorScore(int korScore) {
		KorScore = korScore;
	}

	@Override
	public String toString() {
		return " 학생정보: " + studentName + " 학생번호: " + studentNumber + " 영어점수: " + EngScore + " 극어점수: " + KorScore;
	}

}
