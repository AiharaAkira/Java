package com.study;

import java.util.Scanner;

public class IfExam01_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("임의정수 a:");
		int a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a+"는 짝수");
		}else {
			System.out.println(a+"는 홀수");
		}
		
		sc.close();
	}

}
