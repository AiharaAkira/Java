package com.inher;

public class InherExam extends SuperExam{

	protected int b = 100;
	
	public void print() {
		System.out.println("sub print 메소드: "+b+" : "+c);
	}
	
	@Override
	public void write() {
		
		System.out.println("sub write 메소드: " + super.b + " : " + c);
		
	}
	
	
	
}
