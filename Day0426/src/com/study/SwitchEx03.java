package com.study;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� a�� �Է�: ");
		int a = sc.nextInt();
		System.out.println("�����ڸ� �Է�: ");
		String cal = sc.next();
		System.out.println("���� b�� �Է�: ");
		int b = sc.nextInt();
		int result = 0;
		String report = "";
		
		
		switch (cal) {
		case "+":
			result = (a + b);
			break;

		case "-":
			result = (a - b);
			break;

		case "*":

			result = (a * b);
			break;

		case "%":
			if (b == 0 && cal.equals("%")) {
				report = "0���δ� ������ �����ϴ�.";
				System.out.println(report);
				return;
			} else {

				result = (a % b);
			}

			break;

		case "/":
			if (b == 0 && cal.equals("/")) {
				report = "0���δ� ������ �����ϴ�.";
				System.out.println(report);
				return;

			} else {

				result = (a / b);
			}

			break;
			
		default:
			System.out.println("�����ڸ� �� �� �Է� �߳׿�~");
			break;
		}
		
			System.out.println(a + cal + b + "=" + result);
		
	}

}
