package com.study;

public class House {

	int price;//멤버변수
	int size;
	String dong;
	String kind;
	
	public House() {
		
		//기본 생성자
		this(100, 32, "상계동", "아파트");
		
	}
	
	public House(int price) {
		//기본 생성자
		
		this(price, 32, "상계동", "아파트");
	}
	
	
	public House(int price, int size) {
		//기본 생성자
		this.price = price;
		this.size = size;
		
	}
	
	public House(int price, int size, String dong) {
		//기본 생성자
		
		this.price = price;
		this.size = size;
		this.dong = dong;
		
	}

	public House(int price, int size, String dong, String kind) {
		this.price = price;
		this.size = size;
		this.dong = dong;
		this.kind = kind;
	}
	
	
	
}
