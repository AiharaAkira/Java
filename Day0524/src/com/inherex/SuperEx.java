package com.inherex;

class Sub extends SuperEx {

	private static int a = 10;
	
	public void test() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public Sub() {
		super(a);
		System.out.println("자식 생성자");
		
	}
	
	
	
}

public class SuperEx {

	int a = 5;
	
	public SuperEx(int n) {
	System.out.println("부모 클래스 생성자: "+n);
	}
	
	public static void main(String[] args) {

		Sub s = new Sub();
		s.test();
		
	}

}
