package com.edu.lambda;

interface Runnable1 {
	public void run(String animal);
}

public class RunExample1 {
	public static void main(String[] args) {
		Runnable1 runnable = (String animal) -> {
			System.out.println(animal + "이(가) 달립니다.");
		};
		runnable.run("호랑이");
	};
}
