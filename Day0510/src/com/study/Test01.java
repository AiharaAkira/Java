package com.study;

import java.util.Scanner;

/*
 * ������ ���ڰ� ����ִ� �迭�� ���� �����͵� ��
 * ¦���� ��Ҹ� ��� ���,
 * 3�� ����� ��Ҹ� ��� ���
 * 
 * */
public class Test01 {

	public static void main(String[] args) {

		int arr[] = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };

		int arr2[];
		arr = new int[9];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i ++) {
			System.out.println("������ 9�� �Է�: ");
			arr[i] = sc.nextInt();
		}
		
		for (int i : arr) {
			System.out.println("��ü��= "+i);
				}
		
		for (int i : arr) {
			if (i % 2 == 0) {
				System.out.println("¦��= "+i);
			}

		}
		
		for (int i : arr) {

			if (i % 3 == 0) {
				System.out.println("3�ǹ��= " + i);
			}
		}

	}

}
