package com.javalec.calex;

import java.util.Scanner;

public class Ex01 {

	public Ex01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		System.out.println("i를3으로 나누어서 나머지 0이 아오면 사용자가 입력한 숫자는 3의 배수");
		System.out.println("i%3="+(i%3));
		// TODO Auto-generated method stub

	}

}
