package com.study;

public class Array3 {
	public static void main(String[] args) {
		int[][] arr = new int[4][5];
		int k = 1;
		
		for (int i = 0; i < 4; i++) {

				if(i == 0) {
					k = 20;
				}
				
				if (i == 1) {
					k = 19;
				} 
				
				if (i == 2) {
					k = 18;
				} 
				
				if (i == 3) {
					k = 17;
				} 
				
				for (int j = 0; j < 5; j++) {

					arr[i][j] = k;
					System.out.print(arr[i][j]);
					System.out.print(" ");

					if (j == 4) {
						System.out.println();
					}

					k-=4;
				}
			}

	}
}
