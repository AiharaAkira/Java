package com.study;

public class ForExam06 {

	public static void main(String[] args) {

		String s = "";
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				
				System.out.print(s = (i == j)?("(" + i + "," + j + ")"):" ");
				
				/*
				 * if (i == j) { System.out.print("(" + i + "," + j + ")"); } else {
				 * System.out.print(" "); }
				 */
			}

			System.out.println();
		}

	}

}
