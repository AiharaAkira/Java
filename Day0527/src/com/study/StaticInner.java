package com.study;

public class StaticInner {

	
	/**
	 * static이너 클래스로 어쩔 수 없이 정의하는 경우가 있는데,
	 *어쩔 수 없이 정의 하는 경우란 이너클래스 내에 static 변수를 가지고 있을 경우,
	 *어쩔 수 없이 해당 이너 클래스는 static으로 선언해야 한다는말
	 *
	 *이너클래스의 지정어로 static을 지정해야함
	 *형식
	 *
	 *int aa;
	 *int bb ;
	 *
	 *static class Inner(){
	 *
	 *	static int bb;
	 *}
	 *
	 *Outer.Inner in = new Outer.Inner(new Outer.new Inner());
	 * Outer.Inner in = new Outer.new Inner();
	 * 
	 */
	
	static int a = 10;
	static private int b = 100;
	static int c = 200;
	
	static class Inner{
		
		static int d = 1000;
		
		public void printData() {
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		
		}
		
	}
	
	
	public static void main(String[] args) {
	
		StaticInner.Inner in = new StaticInner.Inner();
		in.printData();
		
	
	}

}
