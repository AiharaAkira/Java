package com.study;

public class CircleMain {

	public static void main(String[] args) {

		Circle c = new Circle(10, "타원");
		Circle c1 = new Circle(10, "타원");
		Circle c2 = new Circle(10, "타원");
		Circle c3 = new Circle(10, "타원");
		
		System.out.println("반지름: "+ c.name);
		System.out.println("이름: "+ c.radius);
		
		
		c2.info();
		c3.info();
		
	}

}
