package com.study;

import java.util.Scanner;

public class Test002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
while(true) {
		/*for (;;) {*/
			
			System.out.println("첫번째 정수(0이면종료)?");
			int n1 = sc.nextInt();

			if (n1 == 0) {

				break;

			}

			System.out.println("두번째 정수(0이면종료)?");
			int n2 = sc.nextInt();

			if (n2 == 0) {

				break;

			}

			sum += (n1 + n2);
			System.out.println("현재까지 합: " + sum);

		}

	}

}
