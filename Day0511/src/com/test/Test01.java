package com.test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		/*
		 * �л����� �Է¹޾� �Է¹��� �ο��� ��ŭ�л��� �̸��� ��ȭ��ȣ�� �Է¹ް� �Է¹��� ������ ��ü�����
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("�л� �ο�����?");
		String[] students = new String[(sc.nextInt() * 2)];

		for (int i = 0; i < students.length; i++) {

			if (i % 2 == 0) {
				System.out.println("�̸��� �Է��ϼ���.");

			}
			if (i % 2 != 0) {

				System.out.println("��ȭ��ȣ�� �Է��ϼ���.");

			}
			students[i] = sc.next();
		}

		for (int i = 0; i < students.length; i++) {

			if (i == 0) {
				System.out.println("--------------------------");
				System.out.println("�̸�\t��ȭ��ȣ");
			}

			if (i % 2 == 0) {

				System.out.print(students[i] + "\t");
			}
			if (i % 2 != 0) {

				System.out.println(students[i]);
			}
		}
		System.out.println("-----------------------------");

	}
}
