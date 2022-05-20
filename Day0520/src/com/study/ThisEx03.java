package com.study;

class Book3 {
	String title;
	String writter;

	public void info() {
		System.out.println(title + "," + writter);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWritter() {
		return writter;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}

	public Book3(String title) {
		this(title, "ÀÛÀÚ¹Ì»ó");
	}
	
	public Book3(String title, String writter) {
		super();
		this.title = title;
		this.writter = writter;
	}

	public Book3() {
	}

}

public class ThisEx03 {

	public static void main(String[] args) {

		Book3 b = new Book3("È«±æµ¿Àü","Çã±Õ");
		Book3 b2 = new Book3("È«±æµ¿Àü");
		Book3 b3 = new Book3();
		
		b.info();
		b2.info();
		b3.info();
		
		
		
	}

}
