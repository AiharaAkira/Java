package com.study;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a를 입력: ");
		int a = sc.nextInt();
		System.out.println("연산자를 입력: ");
		String cal = sc.next();
		System.out.println("정수 b를 입력: ");
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
				report = "0으로는 나눌수 없습니다.";
				System.out.println(report);
				return;
			} else {

				result = (a % b);
			}

			break;

		case "/":
			if (b == 0 && cal.equals("/")) {
				report = "0으로는 나눌수 없습니다.";
				System.out.println(report);
				return;

			} else {

				result = (a / b);
			}

			break;
			
		default:
			System.out.println("연산자를 잘 못 입력 했네요~");
			break;
		}
		
			System.out.println(a + cal + b + "=" + result);
		
	}

}
