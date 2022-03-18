package com.dev;

public class AccExample {
	public static void main(String[] args) {
		ExampleExample[] accounts;
		
		accounts = new ExampleExample[] {new ExampleExample("1-111", "홍")
				, new ExampleExample("1-111", "1111")
				, new ExampleExample("22-2", "111")
		};
		
//		ExampleExample a1 =new ExampleExample(); // new 라고 붙이는 것은 ExampleExample에 정의된 대로 실체를 생성
		System.out.println(ExampleExample.bankname); // 이런 식으로 인스턴스를 선언하지 않고도 static을 이용하여 곧바로 불러올 수 있다. 이걸 정적 필드라고 한다.
		ExampleExample.showBankName();
			// 쉐어하우스? 일종의 공유하는 걔념? 
		
		Calculator.sum(10, 2); // static으로 sum 을 고정하여 다른 곳에서 바로 사용할 수 있도록/...
		Calculator.getArea(10);
		
		//static 활용
		
		
		
		
	}
}
