package com.inherex;

public class Son extends ParentEx {

	/*
	 * 다형성
	 * 한 타입의 참조변수로 여러 타입의 객체를 참조 할 수 있도록 하는 것을 의미함
	 * 부모클래스는 타입의 참조변수로 자식 클래스의 인스턴스를 참조할 수 있도록 함.
	 * 부모 클래스 = 자식
	 * 
	 * 기존의 선언과 생성
	 * Super super = new Super();
	 * */
	
	int foo = 1;
	
	@Override 
	public int getNumber(int a) {
		
		return a +2;
		
	}
	
	
	public static void main(String[] args) {
		
		ParentEx pe = new Son();
		
		System.out.println(pe.setNumber(0));
		System.out.println(pe.foo);
		
	}
	
}
