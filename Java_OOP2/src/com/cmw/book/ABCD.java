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
		
		
		//���� Ÿ�Ժ�ȯ : ���� Ŭ������ ���� Ŭ������ �����ؾߵ�
		A a = new B();
		B b = (B)a;
		System.out.println(b);

	}

}
