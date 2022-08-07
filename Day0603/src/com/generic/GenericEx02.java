package com.generic;

public class GenericEx02<T> {

	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	
	
	public T getT() {
		return t;
	}



	public void setT(T t) {
		this.t = t;
	}
	
	
	public <U> void print(U t) {
		System.out.println("T"+t.getClass().getName());
	}



	public static void main(String[] args) {
		
		GenericEx02<Integer> g = new GenericEx02<Integer>();
		g.add(new Integer(10));
		g.print("Test");
		
	}
	
}
