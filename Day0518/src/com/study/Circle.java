package com.study;

public class Circle {

	final static double PI =  3.14;
	int radius; //¹İÁö¸§
	public String name;
	
	public double area() {
		return radius * radius * PI;
	}
	
	public double area(int radius) {
		return radius * radius * PI;
	}
	
	
}
