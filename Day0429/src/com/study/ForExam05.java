package com.study;

import java.util.Scanner;

/*
 * 소문자 알파벳을 하나 입력 받고
 * 
 * 알파벳 입력 : e >> 
 * abcde
 * abcd
 * abc
 * ab
 * a
 * */

public class ForExam05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		
		
			for(char i = ch; i >= 97; i--) {
				
				for(char j = 97; j <= i; j++) {
					System.out.print(j);
				}
				
				System.out.println();
			}
		
			
			
			
		
		
		
	}

}
