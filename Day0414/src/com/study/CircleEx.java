package com.study;

public class CircleEx {

	public static final double PI = Math.PI;
	
	public static void main(String[] args) {
	
		//1.�������� �� �ʱ�ȭ
		int r = 5;
		
		//2.���� �� ó��
//		���ǳ���
		double circleWidth=r*r*PI;
//		���ǵѷ�
		double circleLength =2*PI*r;
		System.out.println("���ǳ���:"+circleWidth);
		System.out.printf("���ǳ���:%.3f\n",circleWidth);
		System.out.println("���ǵѷ�:"+circleLength);
	}
	
}
