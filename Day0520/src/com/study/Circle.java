package com.study;

public class Circle {


	int radius;
	String name;
	
	public Circle() {
		//�ʵ��ʱ�ȭ
		radius = 1;
		name = null;
	}

	public Circle(int radius, String name) {
		super();
		this.radius = radius;
		this.name = name;
	}
	
	public void info() {
		System.out.println("������: "+radius+"�̸�: "+name);
	}
	
}
