package com.study;

public class Test001 {

	public static void main(String[] args) {

		/* 
		 * 형변환
		 * 묵시적 형변환(자동형변환)
		 * -더큰 자료형으로 반환(자동)
		 * -정보 손실 없음
		 * 
		 * ex)short a,b;
		 * a=b=10;
		 * int c = a+b;
		 * 
		 * 
		 * 명시적형변환(강제형변환)
		 * -더작은자료형으로변환(명시)
		 * -정보의 손실 가능성이 있음
		 * 
		 * ex)int c = 0;
		 * short s = 10;
		 * s = (short)(c+s);
		 * boolean 형은 형 변환 불가
		 * byte : char은 casting임
		 * 16byte 
		 * long : float은 자동으로 실수형처리됨(실수형이 정수형보다 커서)
		 * 
		 * 
		 *  */
		
		//형변환이란:변수 또는 상수 타입을 다른 타입으로 변환하고자 할때
		//변환 방법: (자료형)(변수명)
		double d = 97.64;
		int score = (int)d;
		System.out.println(score);
		
		int i = 10;
		byte b = (byte) i;
		
		i=500;
		b = (byte) i;
		
		
		
		
	}

}
