package com.study;

public class ForExam01 {

	public static void main(String[] args) {

		// 1���� 10������ �ݺ�ó���ϴ� ����

		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			sum += i;
			System.out.println("i= " + i + "sum= " + sum);

		}

		int j = 1;
		int sum2 = 0;

		/*
		 * while(j<=10) {
		 * 
		 * sum2+=j; System.out.println("j= " + j+"sum= "+sum2);
		 * 
		 * j++; }
		 */

		do {
			sum2 += j;
			System.out.println("j= " + j + "sum= " + sum2);

			j++;
		} while (j <= 10);

	}

}
