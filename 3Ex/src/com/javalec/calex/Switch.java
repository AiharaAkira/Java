package com.javalec.calex;

import java.util.Scanner;

public class Switch {

	public Switch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int result = i%2;
		
		switch (result) {
		case 0: {
			
			System.out.println("입력하신 숫자는 짝수");
		}break;
		case 1:{
			System.out.println("입력하신 숫자는 홀수");
		}break;
		default: {
			System.out.println("잘못된입력");
		}break;
		}
	}
}
		
	


