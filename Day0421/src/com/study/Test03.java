package com.study;

import java.util.Scanner;

public class Test03 {

	static Test03 t3;

	public static  void swap(int house1, int house2) {
		int temp = house1;
		house1 = house2;
		house2 = temp;
	}

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 정수a는?");
		int a = sc.nextInt();
		System.out.println("임의의 정수b는?");
		int b = sc.nextInt();
		System.out.println("임의의 정수c는?");
		int c = sc.nextInt();

		int temp;
		if (a > b) {

			temp = a;
			a = b;
			b = temp;

			/*
			 * a = a ^ b; b = b ^ a; a = a ^ b;
			 */

		}

		if (a > c) {

			temp = a;
			a = c;
			c = temp;

			/*
			 * a = a ^ c; c = c ^ a; a = a ^ c;
			 */

		}

		if (b > c) {
			// 

			temp = b;
			b = c;
			c = temp;

			/*
			 * b = b ^ c; c = c ^ b; b = b ^ c;
			 */

		}
		System.out.println(a + "," + b + "," + c);

	}

}
