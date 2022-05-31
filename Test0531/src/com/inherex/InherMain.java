package com.inherex;




class Parent {

	int parentVar = 10;

	public void parentMethod() {
		
	}

}

class Child extends Parent{
	int childVar = 20;

	public void childMethod() {
		
	}
}

public class InherMain {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println(c.parentVar);
		System.out.println(c.childVar);
		c.parentMethod();
		c.childMethod();
	}

}
