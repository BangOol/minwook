package com.edu.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
	public static void main(String[] args) {
		// 여기서는 출력스트림을 만드는데, 문자기반으로 만들 것이다. (second.txt 만듬)
		try { // 출력스트림을 만드는 것은 리소스를 만드는 것이라서 예외처리를 해주어야 한다
			FileWriter fw = new FileWriter("second.txt");
			fw.write("hello\n");
			fw.write("world\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
	
		
		
		}
		System.out.println("end of prog");
	} // 이 코드가 마무리 된 후 파일을 찾아가보면,  hello, world가 적혀있는 second.txt라는 파일이 생성되어있다.
	
	
}
