package com.study;

public class OverloadingEx {

	public static void main(String[] args) {

		Boiler bb = new Boiler();
		System.out.println("����µ�"+ bb.temp);
		
		bb.tempUp();
		System.out.println("����µ�"+ bb.temp);
		bb.tempUp(20);
		System.out.println("����µ�"+ bb.temp);
		
		
		
		
	}

}
