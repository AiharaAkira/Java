package com.study;

public class Array5 {

	public static void main(String[] args) {

		int[][] arr = new int[4][4];
		/*
		 * 78910
		 * 456
		 * 23
		 * 1
		 * */
		int k = 1;
		for (int i = 0; i < 4; i++) {

			if(i == 3) {
				for(int j = 0; j<1; j++) {
					
					arr[i][j] = k;
					System.out.print(arr[i][j]);
					System.out.print(" ");
					}
				System.out.println();
			}
			
			if(i == 2) {
				for(int j = 0; j<2; j++) {
					
					
					arr[i][j] = k;
					
					System.out.print(arr[i][j]);
					System.out.print(" ");
					k++;
					
					}
				
				System.out.println();
				
				
			}
			
			if(i == 1) {
				for(int j = 0; j<3; j++) {
					arr[i][j] = k;
					System.out.print(arr[i][j]);
					System.out.print(" ");
					k++;
					}
				System.out.println();
			}
			
			if(i == 0) {
				for(int j = 0; j<4; j++) {
					arr[i][j] = k;
					System.out.print(arr[i][j]);
					System.out.print(" ");
					k++;
					}
				System.out.println();
			}

		}
		
	}

}
