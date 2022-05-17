package com.ex02;

import java.util.Scanner;

class Rect{
	/*사각형의 넓이와 둘레 계산(넓이, 둘레, 무게,색깔,재질)
	 * 넓이 계산, 둘레계산, 가로/세로 입력. 결과출력*/
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
		System.out.println("가로: "+width);
		System.out.println("세로: "+height);
		System.out.println("둘레: "+calRound());
		System.out.println("넓이: "+calArea());
	}
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가로:");
		width = sc.nextInt();
		System.out.println("세로:");
		height = sc.nextInt();
		
	}
	
	//넓이 계산 기능(메소드 정의)
	
}

public class RectExam {

	public static void main(String[] args) {

		/*
		 * 
		 * 전역변수: 클래스 전체 안에서 활동가능한 변수(static)
		 * 멤버변수: 클래스에 소속되어 있는 변수
		 * 인스턴스 변수: 인스턴스가 생성될때를 의미함
		 * 
		 * 메소드는 리턴문을 통해서만 결과를 돌려(반환하게)주게 된다.
		 * 
		 */
		
		Rect r = new Rect(1,1);
		r.input();
		r.info();
		
		
	}

}
