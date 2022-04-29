package com.study;
public class ForExam03 {
	public static void main(String[] args) {
		int j = 0;
		String judge;

		for (int i = 0; i < 5; i++) {
			for ( j = i; j <= 4; j++) {
				System.out.print("5");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
