package com.study;

import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {

		//사용자가 입력하는 정수를 계속더해 나간다.
		//만약 0이 입력되면 지금까지 입력된 정수의 합계를 출력하고 종료.
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.println("더할 정수는(0입력시 종료): ");
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("총 합계: "+sum);
				break;
			}
			sum+=num;
			
		}
		
	}

}
