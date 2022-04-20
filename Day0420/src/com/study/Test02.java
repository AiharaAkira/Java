package com.study;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		//사용자로부터 임의의 정수를 입력받아 입력받은 정수가 
		//짝수인지 홀수인지를 판정하는 프로그램을 작성
		//단 조건삼항 연산자
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력:");
		int a = sc.nextInt();
		/*
		 * String result =(a%2==0)?result="짝수입니다." :"홀수입니다." ;
		 * System.out.println(result);
		 */
		
		
		if(a%2 == 0) {
			System.out.println("짝수입니다.");
			
		}else {
			System.out.println("홀수입니다.");
			
		}
		
		sc.close();
		
		
		
		
		
	}
	
}
