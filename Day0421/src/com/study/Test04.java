package com.study;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		// 임의의 정수로 돈의 금액을 입력받아 오만원권, 만원권, 천원권, 오백원,백원,십원,일원
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("금액을 입력하시오. 입력금액:");
		int price = sc.nextInt();
		int oman = 0;
		int man = 0;
		int chon = 0;
		int obak = 0;
		int bak = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;

		if (50000 <= price) {
			oman = (price / 50000);
			price = price % 50000;
			
		}
		
		if (10000 <= price) {
			man = price / 10000;
			price = price % 10000;
			
		}
		
		if (1000 <= price) {
			chon = price / 1000;
			price = price % 1000;

		}
		
		if (500 <= price) {
			obak = price / 500;
			price = price % 500;

		} else if (100 <= price) {
			bak = price / 100;
			price = price % 100;

		}
		
		if (50 <= price) {
			osip = price / 50;
			price = price % 50;

		}
		
		if (10 <= price) {
			sip = price / 10;
			price = price % 10;

		}
		
		if (1 <= price) {
			il = price / 1;

		}

		System.out.println("오만원권: " + oman + "장");
		System.out.println("만원권: " + man + "장");
		System.out.println("천원권: " + chon + "장");
		System.out.println("오백원권: " + obak + "개");
		System.out.println("백원권: " + bak + "개");
		System.out.println("오십원권: " + osip + "개");
		System.out.println("십원권: " + sip + "개");
		System.out.println("일원권: " + il + "개");

	}

}
