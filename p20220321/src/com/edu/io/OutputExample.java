package com.edu.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("first.dat"); // resource를 쓰는 것들은 예외처리를 해줘야..
			os.write(10); //write 메소드를 통해 입력스트림인 것을 알 수 있다. 인줄 알았는데 출력스트림임. 짜잔...아안ㅇ라ㅜㄴ이ㅜ리누리ㅏㅈㄷㄹ
			os.write(20); //이렇게 스트림을 이용하여 admin\git\minwook\P20220321 파일에 들어가보면 first.dat 이라는 파일이 생성되어있는 것을 볼 수 있다.
			os.write(30); // 이 파일을 
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} // OutputStream을 상속받아서 그 파일을 쓰고싶다?

		System.out.println("End of Program");
	}
}
