package com.study;

public class ArrayCopyEx02 {

	public static void main(String[] args) {

		//������ �� �ִ� �迭 ����
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;

			System.out.print(arr[i] + "\t");
		}

		System.out.println("�������� �迭�� ����: " + arr.length);

		//
		int[] temp = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];

			System.out.print(temp[i] + "\t");
		}

		arr = temp;

		System.out.println("��Ʈ�� �迭�� ����: " + temp.length);
		System.out.println("�������� arr�� ����: " + arr.length);

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + "\t");
		}
	}

}
