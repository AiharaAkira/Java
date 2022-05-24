package com.study;

public class Card {
	
	String shape;
	String num;
	
	
	public Card() {
		
	}


	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public String getNum() {
		return num;
		
	}


	public void setNum(String num) {
		this.num = num;
		
	}


	public Card(String shape, String num) {
		super();
		this.shape = shape;
		this.num = num;
	}
	
	
}
