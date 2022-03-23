package com.edu.generic;

//ArrayList<Integer>
//제네릭에 대해서 배울 시간이에요~
public class Box<T> {
	T obj;
	
	public void setObj(T obj) {
		this.obj = obj;  //위의 obj는 매개변수 obj를 받겠습니다~
		
	}
	
	public T getObj() {
		return this.obj;		//모든 타입을 받기위해 Box는 Object 타입으로 선언되었다는 것
	}
}
