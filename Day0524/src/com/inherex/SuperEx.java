package com.inherex;

class Sub extends SuperEx {

	private static int a = 10;
	
	public void test() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public Sub() {
		super(a);
		System.out.println("�ڽ� ������");
		
	}
	
	
	
}

public class SuperEx {

	int a = 5;
	
	public SuperEx(int n) {
	System.out.println("�θ� Ŭ���� ������: "+n);
	}
	
	public static void main(String[] args) {

		Sub s = new Sub();
		s.test();
		
	}

}
