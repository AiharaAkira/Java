package com.study;

import java.util.Scanner;

public class Test003 {

	public static void main(String[] args) {

		// ����ڷ� ���� ������ ����
		// 1���� �Է� ���� �������� ��ü�� �հ�, ¦���� �հ�, Ȧ���� ��
		// 10���� �շ� �յ� ���
		// 1~10, 1~20

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int num = sc.nextInt();
		int sumJJak = 0;
		int sumHol = 0;
		int sum = 0;
		int sumTen = 0;
		int sumJJakT = 0;
		int sumHolT = 0;

		for (int i = 1; i <= num; i++) {

			if (i >= 10 && i % 10 == 0) {
				for (int j = 1; j <= i; j++) {
					
					
					if (j % 2 == 0) {
						sumJJakT += j;
					}

					if (j % 2 != 0) {
						sumHolT += j;
					}
					
					sumTen += j;
					
				}

				System.out.println("1����" + i + "�������� : " + sumTen);
				
				 System.out.println("1����" + i + "����Ȧ������ : " + sumHolT);
				  System.out.println("1����" + i + "����¦������ : " + sumJJakT);
				 
			}

			if (i % 2 == 0) {
				sumJJak += i;
			}

			if (i % 2 != 0) {
				sumHol += i;
			}

			sum += i;

		}

		System.out.println("��ü����: " + sum);
		System.out.println("¦������: " + sumJJak);
		System.out.println("Ȧ������: " + sumHol);

	}

}
