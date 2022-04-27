package com.study;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {

		//두개의 정수와 n 값을 배수를 입력받아 두 수 사이의 n값을 배수의 합으로 구함.
		
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
