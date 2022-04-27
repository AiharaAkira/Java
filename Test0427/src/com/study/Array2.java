package com.study;

public class Array2 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];
		int k = 1;

		for (int i = 0; i < 4; i++) {

			if (i % 2 == 0) {
				
				if (i == 2) {
					k = 11;
				} 
				
				for (int j = 0; j < 5; j++) {

					arr[i][j] = k;
					System.out.print(arr[i][j]);
					System.out.print(" ");

					if (j == 4) {
						System.out.println();
					}

					k++;
				}
			}

			if (i % 2 != 0) {

				if (i == 1) {
					k = 10;
				} 
				
				if (i == 3) {
					k = 20;
				}

				for (int j = 4; j >= 0; j--) {

					arr[i][j] = k;
					k--;
					
					
					System.out.print(arr[i][j]);
					System.out.print(" ");
					
					if (j == 0) {
						System.out.println();
					}
					
				}
				
				





			}
		}

	}

}
