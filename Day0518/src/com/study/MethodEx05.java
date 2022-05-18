package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx05 {
		
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static String getString(String str) throws IOException {
		
		
		System.out.println(str+":");
		String imsi = br.readLine();
		
		return imsi;
	}
	
	public int getInt(String str) throws NumberFormatException, IOException {
		System.out.println(str+":");
		
		return Integer.parseInt(br.readLine());
	}
		
	public static void main(String[] args) throws IOException {
			
		String name = getString("이름");
		System.out.println(name+"님 안녕하세요");
		
		MethodEx05 m5 = new MethodEx05();
		
		System.out.println("국어점수: "+m5.getInt("국어")+"점");
		
	}

}
