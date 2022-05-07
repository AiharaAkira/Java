package com.cmw.book;
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends B{}
class F extends C{}

public class ABCD {

	public static void main(String[] args) {
		
//		B b = (B)new A();//
//		System.out.println(b);
		
		
		//강제 타입변환 : 하위 클래스를 상위 클래스로 생성해야됨
		A a = new B();
		B b = (B)a;
		System.out.println(b);

	}

}
