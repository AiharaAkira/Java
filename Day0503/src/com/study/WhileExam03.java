package com.study;

public class WhileExam03 {

	public static void main(String[] args) {

		// -1^2 + 2^2 - 3^2 + 4^2....+100^2의 합계
		int i = 1;
		int num = 1;
		int sum = 0;
		
		while (i <= 100) {
			/*
			 * if(i%2 != 0) { num = -num; }
			 */
			//num = i * i;
			num = -num;
			sum += num * (i * i);
			i++;
		}

		System.out.println("-1^2 + 2^2  - 3^2 + 4^2....+100^2의 합계: " + sum);

	}

}
