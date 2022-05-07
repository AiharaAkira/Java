package com.cmw.product;

public class Computer extends Product{
	public String cpu;
	int ram;
	protected int hdd;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String name, int price) {
		super(name, price);
		
	}
	
	public void info() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
}
