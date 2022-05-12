package com.study;

public class ArrayEx02 {

	public static void main(String[] args) {

		/*12345
		 * 678919
		 * 1112131415
		 * 1617181920
		 * 2122232425*/
		
		int[][] arr = new int[5][5];
		
		int n = 1;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = n++;
				
			}
			n=i+2;
			//n-=4;
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

}
