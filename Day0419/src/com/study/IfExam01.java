package com.study;

import java.io.IOException;
import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/* ������ ������ �Է¹޾� �Է¹��� ���� ¦������ ���� */

		Scanner sc = new Scanner(System.in);

		System.out.println("���� a��?");
		int a = sc.nextInt();

		System.out.println("�����ڴ�?");
		char op = sc.next().charAt(0);

		System.out.println("���� b��?");
		int b = sc.nextInt();
		if (op == '+') {
			System.out.printf("%d%c%d=%d", a, op, b, (a + b));
		} else if (op == '-') {
			System.out.printf("%d%c%d=%d", a, op, b, (a - b));

		} else if (op == '*') {
			System.out.printf("%d%c%d=%d", a, op, b, (a * b));

		} else if ((op == '/' && b == 0) || (op == '%' && b == 0)) {
			System.out.println("� ���ڸ� 0���� ������ �������� �����ϴ� ���� �Ϲ������� ������ ������ 0���� ������ ��츦 �������� �ʱ� ������ ������ �ǹ̴� �����ϴ�.");
		
		}else if (op == '%') {
			System.out.printf("%d%c%d=%d", a, op, b, (a % b));

		} else if (op == '/') {
			System.out.printf("%d%c%d=%d", a, op, b, (a / b));

		} else {
			System.out.println("�����ڸ� �� �� �Է��ϼ̽��ϴ�.");
		}

		sc.close();

	}

}
