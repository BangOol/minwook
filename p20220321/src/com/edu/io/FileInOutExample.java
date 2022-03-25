package com.edu.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutExample {
	public static void main(String[] args) {
		//바이트 타입으로 읽고 쓰고하는 작업을 할 거임.
		// c 드라이브 밑 temp  폴더에 이미지 파일을 넣어서 바이트 타입으로 
		
		try {
		FileInputStream fis = new FileInputStream("C:/temp/image.jpg");
		FileOutputStream fos =new FileOutputStream("C:/temp/copy2.jpg");
		
		int readByte = -1;
		byte[] readBytes = new byte[100];//한번에 많은 양의 바이트를 받기 위한 용도로 바이트 배열을 선언하여 사용하면 한번에 적은 수를 읽어 처리함
		while((readByte = fis.read(readBytes)) != -1) { // fis.read() 안에 readBytes를 넣어야 작동된다... 완전 해골물이었네..
//			fos.write(readByte); //output-write?
//			fos.write(readBytes); //한번에 readBytes 배열의 크기만큼 읽겟습니다 라는 의미
			fos.write(readBytes,0,readByte); // 이건... 찾아보자...
		
		}
		fos.close();
		fis.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end of program");
	}
}
