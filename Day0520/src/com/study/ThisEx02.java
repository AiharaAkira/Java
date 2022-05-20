package com.study;

class C{
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public C(int a) {
		super();
		this.a = a;
	}
	
	
	
}


public class ThisEx02 {

	
	
	public static void main(String[] args) {

		C c = new C(2);
		
		System.out.println(c.getA());
		
	}

}
