package com.study;

public class ArrayExam03 {

	public static void main(String[] args) {
		// 배열을 활용하여 최대값과 최소값

		int[] num = { 79, 88, 91, 33, 100, 55, 95 };
		// 배열의 첫번째 값으로 최댓값 초기화
		int max = num[0];
		// 배열의 첫번째 값으로 최솟값 초기화
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= max) {
				max = num[i];
			} else if (num[i] <= min) {
				min = num[i];
			}
		}

		System.out.println("최댓값:" + max);
		System.out.println("최솟값:" + min);
	}

}
