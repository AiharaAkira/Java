package com.study;

public class CircleEx {

	public static final double PI = Math.PI;
	
	public static void main(String[] args) {
	
		//1.변수선언 및 초기화
		int r = 5;
		
		//2.연산 및 처리
//		원의넓이
		double circleWidth=r*r*PI;
//		원의둘레
		double circleLength =2*PI*r;
		System.out.println("원의넓이:"+circleWidth);
		System.out.printf("원의넓이:%.3f\n",circleWidth);
		System.out.println("원의둘레:"+circleLength);
	}
	
}
