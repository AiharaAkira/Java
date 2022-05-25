package com.ex;

public abstract class AbstractBicycle {

	public AbstractBicycle() {
	}
	
	int id;
	String brand;
	
	//추상 메소드 선언(반드시 하나는 선언되어야함)
	abstract public void prtInfo();
	
	
	//일반 메소드 구현

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public AbstractBicycle(int id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	} 
	

	
	
	
}
