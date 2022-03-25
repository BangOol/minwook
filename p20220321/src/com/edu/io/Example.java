package com.edu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

	static Scanner scn = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>();

	
	
	
	
	public static void main(String[] args) {

//		writeStudent();
		readStudent();

		for (Student student : list) {
			System.out.println(student.toString());
		}
		System.out.println("end of program");
	}
	
	
	
	
	// student.txt 읽어들이는 메소드(문자열 기반이기에 Reader 사용)
	public static void readStudent() {

		try {
			FileReader fr = new FileReader("Student1.txt");
			BufferedReader br = new BufferedReader(fr);

//			br.readLine(); // 파일의 1라인을 읽어오는 것. 없으면 null값을 리턴
			String readStr = null;// 저 위의 br.readLine을 제거하였을때 왜 1번째 입력값이 출력되는지 알아놓자.
			while ((readStr = br.readLine()) != null) {

				String[] contents = readStr.split(" ");

				list.add(new Student(Integer.parseInt(contents[0]), contents[1], Integer.parseInt(contents[2]),
						Integer.parseInt(contents[3]))); // 읽어들인 문자에서공란 기준으로 split함 -> hong 20 30 각각 다른 단어로 쪼개짐

					
				//// 이 부분을 list.add로 담아보자//101 hong 20 30을 split 해서 쪼갠 후, 각 타입에 맞추어 넣어준 것..ctrl
				//// + 마우스 올리면 같은 이름 클래스 어디있는지 나옴.
//				contents[0]; //문자열을 숫자로 바꿔주는ㄴ parseInt 를 써야함.
//				contents[1]; 이렇게 하면 안됨.
//				contents[2];
//				contents[3];
//				System.out.println(readStr); // 그래서 contents 배열에 들어감
			}

			br.close();
			fr.close(); // 이렇게 종료를 해주어야 함.

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	
	
	
	public static void writeStudent() {
		try {
			FileWriter fw = new FileWriter("Student1.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			while (true) {
				System.out.println("이름 입력>> 101 hong 20 30");
				String name1 = scn.nextLine(); // 한 라인 전체를 읽어들이는 메소드.

				if (name1.equals("stop")) {
					break;
				}

				bw.write(name1 + "\n");

			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
