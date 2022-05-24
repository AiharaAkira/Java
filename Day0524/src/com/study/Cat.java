package com.study;

public class Cat extends Animal {

	private String name;
	
	public Cat() {

		this.name = getClass().getSimpleName();
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	void scream() {
		System.out.println("³É");
	}
	
	
}
