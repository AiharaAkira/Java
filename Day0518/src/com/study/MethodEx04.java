package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx04 {

	public static int plus(int x, int y) {

		return x + y;
	}

	public static int minus(int x, int y) {

		return x - y;
	}

	public static int multi(int x, int y) {

		return x * y;
	}

	public static int div(int x, int y) {

		return x / y;
	}
	
	public static int per(int x, int y) {

		return x % y;
	}
	
	public static void disp(int a, char c, int b) {
		
		if(c == '+') {
			System.out.println(plus(a, b));
		}else if(c == '-') {
			System.out.println(minus(a, b));
		}else if(c == '*') {
			System.out.println(multi(a, b));
		}else if(c == '/') {
			System.out.println(div(a, b));
		}else if(c == '%') {
			System.out.println(per(a, b));
		}else {
			System.out.println("���������ʴ� ������");
		}
		
	}
	
	

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 0;
		char c='1';
		do {
			System.out.println("ù��° ��?");
			a = Integer.parseInt(br.readLine()) ;
			System.out.println("������?");
			c = br.readLine().charAt(0);
			System.out.println("�ι�° ��?");
			 b = Integer.parseInt(br.readLine()) ;
			
//			c = (char) System.in.skip(2);
			
		}while(c != '+'&&c != '+'&&c != '+'&&c != '+'&&c != '+');
		
		
		disp(a, c, b);
		
		
		
		
		
	}

}
