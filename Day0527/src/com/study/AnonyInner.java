package com.study;

/*
 * Anonymous(익명) 이너 클래스
 * 
 * -익명이란?
 * 이름이 없는 것을 의미함
 * 자바의 프로그램적인 해석인 경우 클래스의 이름이 없다.
 * 
 * event와 관련이 있음
 * interface 구현이 필요없음
 * 일반 메소드 내부에서 정의부를 가질 수 있음
 * abstract 를 상속 받을 수 있음
 * 인터페이스를 상속받아 구현할 때는 한 개만 구현함
 * 
 * */


abstract class AbsExam{
	int data = 10000;
	public abstract void printData();
}


public class AnonyInner {
	
		AbsExam ae = new AbsExam() {
	
		@Override
		public void printData() {

			System.out.println("추상클래스로만든거");
			
		}
		
	};
	
	public static void main(String[] args) {

		AnonyInner ai = new AnonyInner();
		ai.ae.printData();
		
		
		
	}

}
