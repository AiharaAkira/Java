package com.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		/* 양의 정수 10개를 입력받아 배열에 저장하고, 배열에있는 정수중에서
		 * 3의 배수만을 출력 */
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			System.out.println("양의정수 10개입력 :");
			arr[i] = sc.nextInt();
		}
		System.out.println("3의 배수는...");
		for (int i : arr) {
			
			if(i%3 == 0) {
				
				System.out.println(i);
			}
			
		}
		
		
	}

}
