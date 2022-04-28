package com.study;

import java.util.Scanner;

public class Test003 {

	public static void main(String[] args) {

		// 사용자로 부터 임의의 정수
		// 1부터 입력 받은 수까지의 전체의 합계, 짝수의 합계, 홀수의 합
		// 10단위 합로 합도 출력
		// 1~10, 1~20

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		int sumJJak = 0;
		int sumHol = 0;
		int sum = 0;
		int sumTen = 0;
		int sumJJakT = 0;
		int sumHolT = 0;

		for (int i = 1; i <= num; i++) {

			if (i >= 10 && i % 10 == 0) {
				for (int j = 1; j <= i; j++) {
					
					
					if (j % 2 == 0) {
						sumJJakT += j;
					}

					if (j % 2 != 0) {
						sumHolT += j;
					}
					
					sumTen += j;
					
				}

				System.out.println("1부터" + i + "까지의합 : " + sumTen);
				
				 System.out.println("1부터" + i + "까지홀수의합 : " + sumHolT);
				  System.out.println("1부터" + i + "까지짝수의합 : " + sumJJakT);
				 
			}

			if (i % 2 == 0) {
				sumJJak += i;
			}

			if (i % 2 != 0) {
				sumHol += i;
			}

			sum += i;

		}

		System.out.println("전체의합: " + sum);
		System.out.println("짝수의합: " + sumJJak);
		System.out.println("홀수의합: " + sumHol);

	}

}
