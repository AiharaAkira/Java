package com.study;

public class CircleEx02 {

	int radius;
	
	public CircleEx02() {
	}

	void set(int r) {
		radius = r;
	}
	
	public CircleEx02(int r) {
	
		radius = r;
	
	}
	
	
	public static void main(String[] args) {

		CircleEx02 ce = new CircleEx02(2);
		
		System.out.println(ce.radius);
		
	}

}
