package com.edu.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public interface StudentFileExample {
	static Scanner scn = new Scanner(System.in);
	//main이라는 static method에서 불려가야되기에 static 붙어야함.
	public static void main(String[] args) {
		
		writeStudent();
		
		System.out.println("end of program");
	} // end of main

	
	
	
	public static void writeStudent() {
		try {
			FileWriter fw = new FileWriter("student.txt");
			BufferedWriter bw = new BufferedWriter(fw); // 스트림의 형태? 에 따라 조금씩 이름 달라짐
			while (true) {
				System.out.println("이름 입력: ");
				String name = scn.next();
				if (name.equals("stop")) {
					break;
				}
				bw.write(name + "\n"); // stop 쓰면 멈추고, 프로젝트 내에 txt 파일생김
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
