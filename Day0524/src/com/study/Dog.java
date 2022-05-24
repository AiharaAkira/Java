package com.study;

public class Dog extends Animal {

	private String name;
	
	public Dog() {
		
		name = getClass().getSimpleName();
	}
	
	@Override
	void scream() {

			System.out.println("¸Û");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
