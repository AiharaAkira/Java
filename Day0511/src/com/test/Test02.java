package com.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		/* ���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭���ִ� �����߿���
		 * 3�� ������� ��� */
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			System.out.println("�������� 10���Է� :");
			arr[i] = sc.nextInt();
		}
		System.out.println("3�� �����...");
		for (int i : arr) {
			
			if(i%3 == 0) {
				
				System.out.println(i);
			}
			
		}
		
		
	}

}
