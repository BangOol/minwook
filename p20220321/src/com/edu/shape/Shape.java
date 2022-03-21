package com.edu.shape;

public class Shape {
	//shape : 중심점의 위치 x, y 좌표(int) , getArea() - 자식들이 재정의할 수 있도록할 것.
	//자식클래스: Rectangle, Circle, Triangle
	//rectangle : x, y로 넓이 : 밑변, 높이 재정의 x절편, y 절편 구해서 , 중심에 놓여있다고 가정
	//circle : r로 넓이
	//triangle : yx/2
	//getArea를 활용하여 재정의 및 넓이를 구하면 됨. r^2 = x^2 + y^2
	
	private int x, y;
	
	public double getArea() {
		return 0; // 자식 클래스들이 재 정의
	}
	
}
