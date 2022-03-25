package com.edu.io;

import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
	public static void main(String[] args) {
		
		
		try {
			// 문자 기반의 스트림: 스트림(한문자씩) 입력스트림.
			FileReader fr = new FileReader("second.txt");
			int readChar = -1;
			while((readChar = fr.read()) != -1) { //read의 설명을 읽어보면, -1일 때 읽을 것이 없다고 하는거 나옴.
				System.out.println((char) readChar); // 그래서 이 코드는 세컨드 안의 문구를 다 읽어주는 코드
			}	// char 타입으로 변경해서 readChar를 출력하겠습니다 라는 의미로 보임.
			fr.close();
		} catch (IOException e) { //IOException은 입출력 예외처리
			e.printStackTrace();
		}
	}
}
