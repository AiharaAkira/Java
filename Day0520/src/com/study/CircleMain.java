package com.study;

public class CircleMain {

	public static void main(String[] args) {

		Circle c = new Circle(10, "Ÿ��");
		Circle c1 = new Circle(10, "Ÿ��");
		Circle c2 = new Circle(10, "Ÿ��");
		Circle c3 = new Circle(10, "Ÿ��");
		
		System.out.println("������: "+ c.name);
		System.out.println("�̸�: "+ c.radius);
		
		
		c2.info();
		c3.info();
		
	}

}
