package com.study;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		String names[] = { "ȫ�浿", "����ġ", "�̵�", "�������", "�̼���", "������", "�縸��" };

		Scanner sc = new Scanner(System.in);

		int index = -1;

		do {
			System.out.println("�˻��� �̸� �Է�:");
			String name = sc.next();

			for (int i = 0; i < names.length; i++) {

				if (name.equals(names[i])) {
					index = i;
				}

			}

			if (index != -1) {
				System.out.println(name + "�� �迭��" + index + "�� ��ġ�Դϴ�.");
				break;
			}

			System.out.println("�Է��� �̸��� �迭�� �����ϴ�.");
		} while (true);

		for (String s : names) {
			System.out.print(s + "\t");
		}

	}

}
