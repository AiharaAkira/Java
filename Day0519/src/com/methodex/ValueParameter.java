package com.methodex;

/*
 * 값에 의한 호출(call by value)
 * 메소드 호출시 기본 자료형의 값을 인자(매개변수)로 전달하는 방식
 *   
 */

public class ValueParameter {

	public int increase(int n) {
		return n++;
	}
	
	public static void main(String[] args) {

		int value = 100;
		
		ValueParameter v = new ValueParameter();
		
		System.out.println(v.increase(value));
		
		
		
	}

}
