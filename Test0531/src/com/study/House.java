package com.study;

public class House {

	int price;//�������
	int size;
	String dong;
	String kind;
	
	public House() {
		
		//�⺻ ������
		this(100, 32, "��赿", "����Ʈ");
		
	}
	
	public House(int price) {
		//�⺻ ������
		
		this(price, 32, "��赿", "����Ʈ");
	}
	
	
	public House(int price, int size) {
		//�⺻ ������
		this.price = price;
		this.size = size;
		
	}
	
	public House(int price, int size, String dong) {
		//�⺻ ������
		
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
