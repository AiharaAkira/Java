package com.study;

public class Book {// 클래서 헤더(클래스 명)
//멤버필드(변수,상수),속성
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;// 일련번호


	
	//생성자
	public Book() {
	}
	
	//메소드(동작, 행위)
	
	// 다음 페이지로 넘기기
	public void nextPage() {
		nowPage++;
	}
	
	//이전페이지
	public void previous() {
		nowPage++;
	}
	
	
	public Book(String name, String writer, int price, int nowPage, String isbn) {
		super();
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.nowPage = nowPage;
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

}
