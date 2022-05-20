package com.study;

public class BookEx01 {

	public static void main(String[] args) {

		Book b = new Book("어린왕자", "생텍쥐페리");
		
		Book b2 = new Book("춘향전", "미상");
		
		b.info();
		b2.info();
	}

}
