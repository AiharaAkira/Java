package com.study;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {

		//�ΰ��� ������ n ���� ����� �Է¹޾� �� �� ������ n���� ����� ������ ����.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int sum = 0;
		
		if (a > b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}

		for (int i = a; i <= b; i++) {
			
			if(i%c == 0) {
				
				sum += i;
			}
			
		}
		
		System.out.println(sum);
		
		
	}

}
