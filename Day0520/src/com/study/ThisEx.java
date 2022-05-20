package com.study;


class circleEx002{
	int radius;
	
	public circleEx002(int radius) {
		this.radius = radius;
	}
	
}

public class ThisEx {

	/*
	 * this: 객체 자신을 가리키는 레퍼런스임(참조)
	 * */
	
	public static void main(String[] args) {

		CircleEx02 c = new CircleEx02(2);
		
		System.out.println(c.radius);
		CircleEx02 c2 = new CircleEx02(3);
		
		System.out.println(c2.radius);
		
		
	}

}
