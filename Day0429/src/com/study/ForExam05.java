package com.study;

import java.util.Scanner;

/*
 * �ҹ��� ���ĺ��� �ϳ� �Է� �ް�
 * 
 * ���ĺ� �Է� : e >> 
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
