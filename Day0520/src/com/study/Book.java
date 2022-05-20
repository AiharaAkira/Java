package com.study;

public class Book {

	String title;
	String author;
	
	public Book(String t, String a) {
		
		title = t;
		author = a;
		
	}
	
	public void info() {
		System.out.println("제목: "+title+" 작가: "+author);
	}
	
}
