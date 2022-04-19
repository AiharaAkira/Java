package com.study;

import java.io.IOException;

/*숫자하나 입력
 * -System.in.read()-48or'0'*/
public class InputEx03 {

	
	public static void main(String[] args) throws IOException {
		
		int num1;
		int num2;
		System.out.print("숫자1: ");
		num1 = System.in.read() - 48;
		System.in.read();//\r
		System.in.read();//\n
		System.out.print("숫자2: ");
		num2 = System.in.read() - 48;
		
		System.out.println(num1+", "+num2);
		
		
	}
	
}
