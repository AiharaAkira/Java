package com.study;

import java.io.IOException;
import java.util.Scanner;

public class IfExam01_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/* ������ ������ �Է¹޾� �Է¹��� ���� ¦������ ���� */

		Scanner sc = new Scanner(System.in);

		System.out.println("���� a��?");
		int a = sc.nextInt();

		System.out.println("�����ڴ�?");
		String op = sc.next();

		System.out.println("���� b��?");
		int b = sc.nextInt();
		if (op.equals("+") ) {
			System.out.printf("%d%s%d=%d", a, op, b, (a + b));
			
		} else if (op.equals("-")) {
			System.out.printf("%d%s%d=%d", a, op, b, (a - b));

		} else if (op.equals("*")) {
			System.out.printf("%d%s%d=%d", a, op, b, (a * b));

		} else if ((op.equals("/") && b == 0) || (op.equals("%") && b == 0)) {
			System.out.println("� ���ڸ� 0���� ������ �������� �����ϴ� ���� �Ϲ������� ������ ������ 0���� ������ ��츦 �������� �ʱ� ������ ������ �ǹ̴� �����ϴ�.");
		
		}else if (op.equals("%")) {
			System.out.printf("%d%s%d=%d", a, op, b, (a % b));

		} else if (op.equals("/")) {
			System.out.printf("%d%s%d=%d", a, op, b, (a / b));

		} else {
			System.out.println("�����ڸ� �� �� �Է��ϼ̽��ϴ�.");
		}

		sc.close();

	}

}
