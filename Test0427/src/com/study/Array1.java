package com.study;

public class Array1 {

	public static void main(String[] args) {

		int[][] arr = new int[4][4];
		/*
		 * 1
		 * 23
		 * 456
		 * 78910
		 * */
		int k = 1;
		for (int i = 0; i < 4; i++) {

			if(i == 0) {
				for(int j = 0; j<1; j++) {
					
					arr[i][j] = k;
					System.out.print(arr[i][j]);
					System.out.print(" ");
					}
				System.out.println();
			}
			
			if(i == 1) {
				for(int j = 0; j<2; j++) {
					
					k++;
					
					arr[i][j] = k;
					
					System.out.print(arr[i][j]);
					System.out.print(" ");
					
					}
				
				System.out.println();
				
				
			}
			
			if(i == 2) {
				for(int j = 0; j<3; j++) {
					k++;
					arr[i][j] = k;
					System.out.print(arr[i][j]);
					System.out.print(" ");
					}
				System.out.println();
			}
			
			if(i == 3) {
				for(int j = 0; j<4; j++) {
					k++;
					arr[i][j] = k;
					System.out.print(arr[i][j]);
					System.out.print(" ");
					}
				System.out.println();
			}

		}

	}

}
