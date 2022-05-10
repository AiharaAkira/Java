package com.study;

import java.util.Scanner;

/*
 * 임의의 숫자가 들어있는 배열의 숫자 데이터들 중
 * 짝수인 요소만 골라서 출력,
 * 3의 배수인 요소만 골라서 출력
 * 
 * */
public class Test01 {

	public static void main(String[] args) {

		int arr[] = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };

		int arr2[];
		arr = new int[9];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i ++) {
			System.out.println("임의의 9수 입력: ");
			arr[i] = sc.nextInt();
		}
		
		for (int i : arr) {
			System.out.println("전체수= "+i);
				}
		
		for (int i : arr) {
			if (i % 2 == 0) {
				System.out.println("짝수= "+i);
			}

		}
		
		for (int i : arr) {

			if (i % 3 == 0) {
				System.out.println("3의배수= " + i);
			}
		}

	}

}
