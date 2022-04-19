package com.study;

import java.io.IOException;
import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/* 임의의 정수를 입력받아 입력받은 수가 짝수인지 판정 */

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 a는?");
		int a = sc.nextInt();

		System.out.println("연산자는?");
		char op = sc.next().charAt(0);

		System.out.println("정수 b는?");
		int b = sc.nextInt();
		if (op == '+') {
			System.out.printf("%d%c%d=%d", a, op, b, (a + b));
		} else if (op == '-') {
			System.out.printf("%d%c%d=%d", a, op, b, (a - b));

		} else if (op == '*') {
			System.out.printf("%d%c%d=%d", a, op, b, (a * b));

		} else if ((op == '/' && b == 0) || (op == '%' && b == 0)) {
			System.out.println("어떤 숫자를 0으로 나누는 나눗셈을 수행하는 것이 일반적으로 나눗셈 연산은 0으로 나누는 경우를 정의하지 않기 때문에 수학적 의미는 없습니다.");
		
		}else if (op == '%') {
			System.out.printf("%d%c%d=%d", a, op, b, (a % b));

		} else if (op == '/') {
			System.out.printf("%d%c%d=%d", a, op, b, (a / b));

		} else {
			System.out.println("연산자를 잘 못 입력하셨습니다.");
		}

		sc.close();

	}

}
