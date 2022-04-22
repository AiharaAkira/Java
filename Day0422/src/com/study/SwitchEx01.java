package com.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchEx01 {

	public static void main(String[] args) {

		//두 정수와 연산자를 입력받아 계산하는 프로그램을 구현
		//switch ~ case
		try {
			
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("정수a입력: ");
		int a = Integer.parseInt(br.readLine()); 
		System.out.println("연산자 입력: ");
		char cal = br.readLine().charAt(0);
		
		System.out.println("정수b입력: ");
		int b = Integer.parseInt(br.readLine());
		int tot = 0;
		switch (cal) {
		case '+':
			tot = a+b;
			System.out.printf("결과:%d%c%d=%d\n",a,cal,b,tot);
			break;
			
		case '-':
			tot = a-b;
			System.out.printf("결과:%d%c%d=%d\n",a,cal,b,tot);
			break;
		case '*':
			tot = a*b;
			System.out.printf("결과:%d%c%d=%d\n",a,cal,b,tot);
			break;
		case '/':
			tot = a/b;
			System.out.printf("결과:%d%c%d=%d\n",a,cal,b,tot);
			break;
		case '%':
			tot = a%b;
			System.out.printf("결과:%d%c%d=%d\n",a,cal,b,tot);
			break;	
		default:
			System.out.println("연산자를 정확히 입력해주세요");
			break;
		}
		
		} catch (Exception e) {
			System.out.println("정수값만 연산 가능하며");
			System.out.println("0으로 나눌수 없습니다.");
		}
		

	}

}
