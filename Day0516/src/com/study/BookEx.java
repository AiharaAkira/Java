package com.study;

public class BookEx {

	public static void main(String[] args) {

		Book b = new Book();
		
		b.name = "���";
		b.writer = "����";
		b.price = 6000;
		b.isbn = "#1000";
		b.nowPage =1;
		
		
		
		Book b2 = new Book("���","����",6000,1,"#1000");
		
		
		

	}

}
