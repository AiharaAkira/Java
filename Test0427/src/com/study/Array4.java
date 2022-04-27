package com.study;

public class Array4 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];
		int k = 1;
		
		for (int i = 0; i < 4; i++) {

			
				
				if (i == 1) {
					k = 2;
				} 
				
				if (i == 2) {
					k = 3;
				} 
				
				if (i == 3) {
					k = 4;
				} 
				
				for (int j = 0; j < 5; j++) {

					arr[i][j] = k;
					System.out.print(arr[i][j]);
					System.out.print(" ");

					if (j == 4) {
						System.out.println();
					}

					k+=4;
				}
			}

			
				
				





			}
		}
		
		
	



