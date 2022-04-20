package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//사용자로부터 임의의 정수를 입력받아, 입력받은 정수가 양수인지 음수인지 0인지
		
		InputStreamReader is = new  InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("임의의정수는 ??");
		int a = Integer.parseInt(br.readLine());
		
		if(a==0) {
			
			System.out.println("0이네요");
		}else if(a >0) {
			
			System.out.println("양수네요");
		}else {
			
			System.out.println("음수네요");
		}
		
		
		
	}

}
