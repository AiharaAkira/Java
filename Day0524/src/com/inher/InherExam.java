package com.inher;

public class InherExam extends SuperExam{

	protected int b = 100;
	
	public void print() {
		System.out.println("sub print �޼ҵ�: "+b+" : "+c);
	}
	
	@Override
	public void write() {
		
		System.out.println("sub write �޼ҵ�: " + super.b + " : " + c);
		
	}
	
	
	
}
