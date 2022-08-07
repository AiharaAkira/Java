package com.generic;

class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Box() {
	}

	public Box(T t) {
		super();
		this.t = t;
	}

}

public class GenericEx01 {

	public static void main(String[] args) {

		Box<Integer> bi = new Box<Integer>();
		bi.setT(1);
		System.out.println(bi.getT());

		Box<String> bi2 = new Box<>();
		bi2.setT("zzz");
		System.out.println(bi2.getT());

		Box<Integer> bit;
		bit = creatBox();

	}

	static Box creatBox() {
		return new Box();
	}

}
