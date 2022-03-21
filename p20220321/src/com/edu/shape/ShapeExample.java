package com.edu.shape;

public class ShapeExample {
	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		Shape s2 = new Circle();
		Shape s3 = new Triangle();
		
		
		if(s1 instanceof Rectangle) {
			Rectangle r1 =(Rectangle) s1;
			r1.setWidth(12.3);
			r1.setHeight(7.8);
			System.out.println(r1.getArea());
		}
		
		if(s2 instanceof Circle) {
			Circle r2 = (Circle) s2;
			r2.setRadius(8.8);
			System.out.println(r2.getArea());
		}
		
		if(s3 instanceof Triangle) {
			Triangle r3 = (Triangle) s3;
			r3.setBase(6);
			r3.setHeight(8.8);
			System.out.println(r3.getArea());
		}
	}
}
