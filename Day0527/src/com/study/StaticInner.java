package com.study;

public class StaticInner {

	
	/**
	 * static�̳� Ŭ������ ��¿ �� ���� �����ϴ� ��찡 �ִµ�,
	 *��¿ �� ���� ���� �ϴ� ���� �̳�Ŭ���� ���� static ������ ������ ���� ���,
	 *��¿ �� ���� �ش� �̳� Ŭ������ static���� �����ؾ� �Ѵٴ¸�
	 *
	 *�̳�Ŭ������ ������� static�� �����ؾ���
	 *����
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
