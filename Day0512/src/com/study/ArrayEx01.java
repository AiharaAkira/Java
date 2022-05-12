package com.study;

public class ArrayEx01 {

	public static void main(String[] args) {

		//2차원 배열의 선언과 초기화
		//1.방법 1
		int [][] arr = new int[3][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		
		int[][] arr2 = {
				{1,2},{2},{3}
		};
		
		int[][] arr3 = new int[3][3];
		int n = 1;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
		}
		
		System.out.println();
		
		for(int i = 0; i<arr3.length; i++) {
			for(int j = 0; j<arr3[i].length; j++) {
				arr3[i][j] = n++;
				System.out.print(arr3[i][j]);
			}
		}
		
		
	}

}
