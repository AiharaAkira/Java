package com.study;

import java.util.Scanner;

public class Test004 {

	public static void main(String[] args) {
		
		//입력할 정수의 개수
		//입력받은 정수. 입력받은 수만큼 평균값을 구하여 출력
		//단 평균값은 실수로 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("정수개수 입력: ");
		int numCnt = sc.nextInt();
		int sum = 0;
		
		
		for(int i = 1; i <= numCnt; i++) {
			
			System.out.println("정수 입력: ");
			int num = sc.nextInt();
			
			sum += num;
			
		}
		
		double avg = (double)sum/numCnt;
		
		System.out.println("평균은"+avg);
		
	}

}
