package com.study;

import java.util.Scanner;

/*
 * char:2byte
 * 아스키코드:1바이트문자를 표현, 0~255문자 범위
 * 유니코드:2바이트를 표현(0~65535문자범위)까지 표현
 * */

public class CharEx {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		char ch2='\u0041';
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열:");
		String str = sc.next();
		
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		System.out.println((char)(ch1 + ch2));
		System.out.println("문자열:"+str);
		
		
		
		
	}
	
}
