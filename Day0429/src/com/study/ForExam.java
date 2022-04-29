package com.study;

public class ForExam {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				System.out.print(i + " * " + j + " = " + i * j + "		");

			}

			System.out.println();

		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				System.out.print(j + " * " + i + " = " + i * j + "		");

			}

			System.out.println();

		}

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" * ");

			}

			System.out.println();

		}

		int k = 1;
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= i; j++) {
				
				System.out.print(k);
				k++;
				
			}

			System.out.println();

		}

	}

}
