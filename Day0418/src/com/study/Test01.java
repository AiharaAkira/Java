package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws IOException {

		//임의 두정수와 연산자를 입력받아  산술 연산프로그램을 구현하시오.
		//단 산술연산자는 +-*/%
		//모든 입력은 BufferedReader
		
		int a,b;
		String calc;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수a입력:");
		a = Integer.parseInt(br.readLine());

		System.out.print("연산자입력(+,-,*,/,%):");
		//calc = br.readLine();
		char calc2 = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("정수b입력:");
		b = Integer.parseInt(br.readLine());
		
		System.out.printf("%d%c%d=%d\n",a,calc2,b,(a+b));
		System.out.println(a+"+"+b+"="+(a+b));
		
		
	}

}
