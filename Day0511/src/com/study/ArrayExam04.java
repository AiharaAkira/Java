package com.study;

public class ArrayExam04 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		int j = 0;

		for (int i : arr) {
			i = j++;
		}

		for (int i = 1; i < 100; i++) {
			int n = (int) (Math.random() * 10);

			int temp = arr[0];
			arr[0] = arr[n];
			arr[n] = temp;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
