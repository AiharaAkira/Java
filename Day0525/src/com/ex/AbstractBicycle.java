package com.ex;

public abstract class AbstractBicycle {

	public AbstractBicycle() {
	}
	
	int id;
	String brand;
	
	//�߻� �޼ҵ� ����(�ݵ�� �ϳ��� ����Ǿ����)
	abstract public void prtInfo();
	
	
	//�Ϲ� �޼ҵ� ����

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
