package com.study;

public class Except02 {

	public static void main(String[] args) {
		
		//throw new Exception
		
		//throw : 예외를 강제로 발생시킴
		//throw new 발생시킬 예외객체의 생성자
		
		
		System.out.println("1");
		System.out.println("2");
		
		try {
			
			System.out.println("3");
			System.out.println(0 / 0);
			System.out.println("4");
			
		} catch (Exception e) {
			
			System.out.println("5");
			
		}
		
		System.out.println("6");
		
	}

}
