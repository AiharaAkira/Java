package com.study;

public class ArrayEx02 {

	public static void main(String[] args) {

		String subject[] = {"±¹", "¿µ", "¼ö"};
		for (String s : subject) {
			System.out.println(s);
		}
		System.out.println();
		char ch[] = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		for (char c : ch) {
			System.out.print(c);
		}
		
		System.out.println();
		
		char ch1[] = new char[] {'J','A','V','A'};
		
		
	}

}
