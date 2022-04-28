package com.study;

import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {

		System.out.println("팩토리얼 계산할 정수: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 1;

		
		  for (int i = num; i >= 1; i--) {
		  
		  result *= i;
		  
		  }
		 

		

		

		System.out.println(result);

		sc.close();

	}

}
