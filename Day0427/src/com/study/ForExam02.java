package com.study;

import java.util.Iterator;
import java.util.Scanner;

public class ForExam02 {

	public static void main(String[] args) {

		// 정수 두개를 입력받아 두수 사이의 수들을 더함

		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 정수 a는?");
		int a = sc.nextInt();
		System.out.println("임의의 정수 b는?");
		int b = sc.nextInt();
		int sum = 0;

		if (a > b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}

		for (int i = a; i <= b; i++) {
			sum += i;
		}
		/*
		 * if(a>=b) { for(int i = 1; i<=a; i++) { sum += b; b++; } }else if(b>=a) {
		 * for(int i = 1; i<=b; i++) {
		 * 
		 * sum += a; a++; } }
		 */

		System.out.println("합계: " + sum);

	}

}
