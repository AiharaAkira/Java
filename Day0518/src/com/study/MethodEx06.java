package com.study;

public class MethodEx06 {

	
	public static void main(String[] args) {
		/*
		 *원의 면적을 구하는 메소드  
		 * */
		
		Circle c = new Circle();
		
		c.radius = 10;
		c.name = "자바피자";
		
		System.out.println("피자크기: "+ c.area());
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name ="자바도넛";
		System.out.println(donut.area());
		
		
		
		
		
		
		
	}

}
