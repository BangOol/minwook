package com.edu.lambda.consumer;

import java.util.function.*; // function 밑에 있는 것들을 다 import 하겠슴니다.
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		// 연습
		// functional interface: 람다표현식 가능.
		Consumer<String> consumer = (t) -> 
			System.out.println(t + " 출력합니다.");
		
//			consumer interface에는  구현해야 할 메소드 가 하나 있음.
		consumer.accept("메세지를 출력함");
		// consumer가 기능을 참조하고 있다? 추상메소드라고 하는 Consumer를 consumer에 담겠다?

	};
	
	BiConsumer<Integer, Integer> biCon = new BiConsumer<Integer, Integer>(){

		@Override
		
		BiConsumer<Integer, Integer> biCon = (t, u) -> {
			System.out.println("result = > " + (t+u));
			biCon.accept(20,40);
		
		};
		
//		public void accept(Integer t, Integer u) {
//			System.out.println("result =>  " + (t+u));
//			
//		}
			
	}

}

