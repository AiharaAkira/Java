package com.study;

import java.util.Iterator;
import java.util.Scanner;

public class ForExam02 {

	public static void main(String[] args) {

		// ���� �ΰ��� �Է¹޾� �μ� ������ ������ ����

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� a��?");
		int a = sc.nextInt();
		System.out.println("������ ���� b��?");
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

		System.out.println("�հ�: " + sum);

	}

}
