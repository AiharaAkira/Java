package com.study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntExcep {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = 0;
		for(int i = 0; i< 3; i++) {
			
			System.out.println(i+1+"��° ����");
			
			try {
				
				n = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("���ڴ� ��� x");
				sc.nextLine();
				continue;
				
			}
				
			sum += n;

		}
		
		System.out.println("����: "+sum);
		
	}
	
}
