package com.study;

public class Book {// Ŭ���� ���(Ŭ���� ��)
//����ʵ�(����,���),�Ӽ�
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;// �Ϸù�ȣ


	
	//������
	public Book() {
	}
	
	//�޼ҵ�(����, ����)
	
	// ���� �������� �ѱ��
	public void nextPage() {
		nowPage++;
	}
	
	//����������
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
