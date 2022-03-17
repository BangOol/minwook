package com.edu;

//  Class(도면,틀, 설계도) -> 객체(object, 객체는 모든 인스턴스를 대표하는 포괄적인 의미를 가짐) -> 인스턴스(실질적으로 작동하는 실체)
// 클래스는 ‘설계도’, 객체는 ‘설계도로 구현한 모든 대상’을 의미한다.

//추상화 기법
//분류(Classification)
//객체 -> 클래스
//실재하는 객체들을 공통적인 속성을 공유하는 범부 또는 추상적인 개념으로 묶는 것
//인스턴스화(Instantiation)
//클래스 -> 인스턴스
//분류의 반대 개념. 범주나 개념으로부터 실재하는 객체를 만드는 과정
//구체적으로 클래스 내의 객체에 대해 특정한 변형을 정의하고, 이름을 붙인 다음, 그것을 물리적인 어떤 장소에 위치시키는 등의 작업을 통해 인스턴스를 만드는 것을 말한다.
//‘예시(Exemplification)’라고도 부른다.



//학생(객체: object) => class Student => instance(new Student())

public class Car {
	private String model; // Sonata 
	private int price;
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
 
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
}
