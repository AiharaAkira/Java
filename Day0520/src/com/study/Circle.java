package com.study;

public class Circle {


	int radius;
	String name;
	
	public Circle() {
		//필드초기화
		radius = 1;
		name = null;
	}

	public Circle(int radius, String name) {
		super();
		this.radius = radius;
		this.name = name;
	}
	
	public void info() {
		System.out.println("반지름: "+radius+"이름: "+name);
	}
	
}
