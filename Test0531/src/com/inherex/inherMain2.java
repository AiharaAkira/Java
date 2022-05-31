package com.inherex;

class Super{
	int x = 90;
	
	public void superMethod() {
		System.out.println("super Method...");
	}
	
}

class Sub extends Super{
	int y = 10;
	
	public void subMethod() {
		System.out.println("sub Method...");
	}
}

class Subsub extends Sub{
	int z = 30;
	
	public void subSubMethod() {
		System.out.println("subSub Method...");
	}
}

public class inherMain2 {
	public static void main(String[] args) {
		
		Subsub ss = new Subsub();
		
		System.out.println(ss.x);
		System.out.println(ss.y);
		System.out.println(ss.z);
		
		ss.superMethod();
		ss.subMethod();
		ss.subSubMethod();
		
		
		
	}
}
