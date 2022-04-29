package com.study;

public class ForExam07 {

	public static void main(String[] args) {

		/*
		 * 1 212 32123 4321234
		 */

		int j = 0;

		for (int i = 1; i <= 4; i++) {

			for (j = i; j <= 4; j++) {
				System.out.print("бр");
			}

			for (j = i; j > 0; j--) {

				if (j == 1) {
					for (int k = 1; k <= i; k++) {
						System.out.print(k);
					}
				} else {
					System.out.print(j);
				}

			}

			System.out.println();

		}

	}

}
