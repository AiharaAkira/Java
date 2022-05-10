package com.study;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("변환할 영어 입력: ");
		String s = sc.next();
		
		
		int k = 65;
		
		/*
		 * char[] ch = new char[26];
		 * 
		 * for(int i = 0; i<ch.length; i++) { ch[i]= (char) k; k++; //
		 * System.out.println(ch[i]); }
		 */
		
		for(int i = 0; i < s.length(); i++ ) {
			
			if(s.charAt(i)>=65&&s.charAt(i)<97) {
				char c = s.charAt(i);
				c= (char)(s.charAt(i)+32);
				System.out.print(c);
			}
			
			if(s.charAt(i)>=97&&s.charAt(i)<=122) {
				char c = s.charAt(i);
				c= (char)(s.charAt(i)-32);
				System.out.print(c);
			}
			
		}
		
		
		
	}

}
