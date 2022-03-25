package com.edu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedExample {
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("C:/temp/image.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis); // 기본 스트림ㅇ
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/temp/copy3.jpg"));
				) { //try 안에 있던 구문을 ctrl + x로 잘라넣어서 try 뒤에 () 만들고 넣었는데 왜 되었는지 모름.
				// bufferStream이 성능향상 스트림으로 알아서 빠륵 ㅔ해줌. 개빨라
			int readByte = -1;
			while((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
			bis.read(); //IOException 처리가 안되면 에러뜸
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end of program");
	}
}
