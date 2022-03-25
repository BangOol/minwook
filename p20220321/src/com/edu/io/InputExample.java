package com.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputExample {
	public static void main(String[] args) {

		try { // 입력스트림을 만들자.
				// 입력 스트림을 생성하면서, first.dat라고 하는 파일을 입력스트림의 소스로 쓰고 싶기에
				// fileinputstream으로 읽어오고, ReadByte에 그 값을 넣어서, 안의 값이 없어져 -1이 될때까지 readByte를
				// 출력하겠다.
			InputStream is = new FileInputStream("first.dat");
			int readByte = -1; // 이걸 밖에 선언해줘야한다

			while ((readByte = is.read()) != -1) { // 읽을 값이 있으면 계속해서 읽어주는데, 값이 없어지면 -1를 리턴하게 된다.

				System.out.println(readByte);
			}
			is.close(); // Add exception to existing catch value
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
