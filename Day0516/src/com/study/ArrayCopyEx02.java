package com.study;

public class ArrayCopyEx02 {

	public static void main(String[] args) {

		//복사할 값 있는 배열 존재
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;

			System.out.print(arr[i] + "\t");
		}

		System.out.println("변경전의 배열의 길이: " + arr.length);

		//
		int[] temp = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];

			System.out.print(temp[i] + "\t");
		}

		arr = temp;

		System.out.println("템트의 배열의 길이: " + temp.length);
		System.out.println("변경후의 arr의 길이: " + arr.length);

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + "\t");
		}
	}

}
