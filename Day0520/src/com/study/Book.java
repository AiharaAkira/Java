package com.study;

public class Book {

	String title;
	String author;
	
	public Book(String t, String a) {
		
		title = t;
		author = a;
		
	}
	
	public void info() {
		System.out.println("����: "+title+" �۰�: "+author);
	}
	
}
