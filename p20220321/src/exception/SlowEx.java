package exception;

public class SlowEx {
	public static void main(String[] args) { // 안되는 이유 찾아보기
		showInterval("Hello, World");
	}
	
	public static void showInterval(String str) {
		for(int i = 0; i < str.length(); i++) 
			System.out.print(str.charAt(i)); //charAt 각 문자를 하나씩 가져오는 메소드
		 try {
			Thread.sleep(300); //Thread 메소드를 이용해서 0.3초 지연시킴. 단 예외처리를 해야 실행이 가능함.
		} catch(InterruptedException e ) {
			e.printStackTrace();
		}
		
		
	}
}
