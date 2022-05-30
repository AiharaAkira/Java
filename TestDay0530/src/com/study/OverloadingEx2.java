package com.study;

class Rec{
	
	int wid;
	int hei;
	
	public int area(int wid, int hei) {
		return wid * hei;
	}
	
	public double area(double wid, double hei) {
		return wid * hei;
	}
	
	public void write(int wid, int hei) {
		System.out.println("사각형의 넓이:"+area(wid, hei));
	}
	
	public void write(double wid, double hei) {
		System.out.println("사각형의 넓이:"+area(wid, hei));
	}
	
	
	
	
}

public class OverloadingEx2 {

	public static void main(String[] args) {

		Rec r = new Rec();
		
		r.write(10, 10);
		
		
		
		
	}

}
