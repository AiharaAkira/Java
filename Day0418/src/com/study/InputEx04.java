package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx04 {

	public static void main(String[] args) throws IOException {

		String name, age, adress, tel;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름:");
		name = br.readLine();
		System.out.println("나이:");
		age = br.readLine();
		System.out.println("주소:");
		adress = br.readLine();
		System.out.println("전화번호:");
		tel = br.readLine();
		
		System.out.println("이름:");
		System.out.println(name);
		System.out.println("나이:");
		System.out.println(age);
		System.out.println("주소:");
		System.out.println(adress);
		System.out.println("전화번호:");
		System.out.println(tel);
		
		
	}

}
