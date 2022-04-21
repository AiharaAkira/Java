package com.study;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 정수?");
		int a = sc.nextInt();
		
		if(a%3==0||a%2==0) {

			if(a%2==0&&a%3==0) {
				System.out.println("2와3의 배수입니다.");
			}else if(a%3==0) {
				
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("2의 배수입니다.");
				
			}
		}else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
		
		
	}

}
