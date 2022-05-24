package com.inherex;

class PointEx {
	private int x;
	private int y;

	public PointEx() {
	}

	public PointEx(int x) {
		this.x = x;
	}

	public PointEx(int x, int y) {
		this(x);
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void display() {
		System.out.println("x value is " + x);
		System.out.println("y value is " + y);
	}

}

public class CircleEx extends PointEx {

	private int r;

	public CircleEx() {

	}

	public CircleEx(int x) {
		super(1);
		r = 1;
		
	}
	
	public CircleEx(int x, int y, int r) {
		super(x, y);
		this.r = r;
		
	}
	
	@Override
	public void display() {
		
		super.display();
		System.out.println("r: "+r);
		
	}
	
	

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public static void main(String[] args) {

		PointEx p = new PointEx(1, 2);

		p.display();

	}

}
