package com.study;

public class Method_Test {

	public static void showHi() {
		System.out.println("Hi");
	}
	
	public  void showHello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		showHi();
		new Method_Test().showHello();
	}

}
