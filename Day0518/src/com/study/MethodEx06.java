package com.study;

public class MethodEx06 {

	
	public static void main(String[] args) {
		/*
		 *���� ������ ���ϴ� �޼ҵ�  
		 * */
		
		Circle c = new Circle();
		
		c.radius = 10;
		c.name = "�ڹ�����";
		
		System.out.println("����ũ��: "+ c.area());
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name ="�ڹٵ���";
		System.out.println(donut.area());
		
		
		
		
		
		
		
	}

}
