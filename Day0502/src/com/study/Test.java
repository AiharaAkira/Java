package com.study;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("�� ��° ���� ���? ");
		int k = sc.nextInt();

		// ��
		int height = 2;
		// ��2
		int j = 0;

		// if ���ǹ��� k+1�� �ֱ� ���ؼ� k+2���� �ݺ�
		// if ���ǹ��� k���� ���� >>3���� ��� -> 2���Ŀ� ���ǹ��� ��
		// ==2���� �ۿ� ��� �ȵ�
		for (int i = 1; i <= k + 2; i++) {

			if (j == 5 && i == k + 1) {
				height = 5;
				i = 1;
				System.out.println();
			}

			if (j == 8 && i == k + 1) {
				height = 8;
				i = 1;
				System.out.println();
			}

			// height�� 3�ܾ� ���� �ű⶧���� +2���� �ݺ�
			for (j = height; j <= height + 2; j++) {
				// 10���� �����°� ����
				if (j == 10) {
					break;
				}

				// 8�� �������� if������ height ��(�ܰ�)�� �ٲ������,
				// 8�� ���ĺ��ʹ� if���� ���⶧���� k+1��=�ప ����µ�
				// ����, k+1���϶� break
				if (j == 8 && i >= k + 1) {
					break;
				}

				System.out.print(j + "*" + i + "=" + (i * j) + "\t");

			}

			System.out.println();

		}

	}

}
