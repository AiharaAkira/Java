package com.study;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int []arr;
		System.out.println("배열의 크기는?");
		arr = new int[sc.nextInt()];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("임의의 수?");
			arr[i] = sc.nextInt();
			
		}
		
		int max = 0;
		for (int i : arr) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println("가장큰수는: "+max);
		
	}

}
