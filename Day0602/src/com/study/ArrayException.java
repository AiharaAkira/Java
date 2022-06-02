package com.study;

public class ArrayException {

	public static void main(String[] args) {

		int[] intArray = new int[5];
		intArray[0] = 0;

		for (int i = 0; i < intArray.length; i++) {

			try {

				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println(intArray[i]);

			} catch (IndexOutOfBoundsException e) {

				System.out.println("배열의 인덱스 범위를 벗어남");

			}

		}

	}

}
