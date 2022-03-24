package com.edu.lambda;


interface Runnable2 {
	public int run(String str);
}

public class RunExample2 {
	public static void main(String[] args) {
		Runnable2 runnable = (String str) -> {
			return str.length();
		};
		int lnth = runnable.run("Hello, world");
		System.out.println(lnth);
		
	}
}
