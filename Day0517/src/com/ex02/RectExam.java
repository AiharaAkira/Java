package com.ex02;

import java.util.Scanner;

class Rect{
	/*�簢���� ���̿� �ѷ� ���(����, �ѷ�, ����,����,����)
	 * ���� ���, �ѷ����, ����/���� �Է�. ������*/
	int width;
	int height;
	
	public Rect() {
	}
	
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int calArea() {
		return width *height;
	}
	
	public int calRound() {
		return (width *2)+(height*2);
	}
	
	public void info() {
		System.out.println("����: "+width);
		System.out.println("����: "+height);
		System.out.println("�ѷ�: "+calRound());
		System.out.println("����: "+calArea());
	}
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����:");
		width = sc.nextInt();
		System.out.println("����:");
		height = sc.nextInt();
		
	}
	
	//���� ��� ���(�޼ҵ� ����)
	
}

public class RectExam {

	public static void main(String[] args) {

		/*
		 * 
		 * ��������: Ŭ���� ��ü �ȿ��� Ȱ�������� ����(static)
		 * �������: Ŭ������ �ҼӵǾ� �ִ� ����
		 * �ν��Ͻ� ����: �ν��Ͻ��� �����ɶ��� �ǹ���
		 * 
		 * �޼ҵ�� ���Ϲ��� ���ؼ��� ����� ����(��ȯ�ϰ�)�ְ� �ȴ�.
		 * 
		 */
		
		Rect r = new Rect(1,1);
		r.input();
		r.info();
		
		
	}

}
