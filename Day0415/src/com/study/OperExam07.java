package com.study;

import java.util.Scanner;

public class OperExam07 {

	public static void main(String[] args) {

		
		  int a = 10; int result = 0;
		  
		  a=10; result = 0; result += a; System.out.println("result="+result);
		  
		  
		  a=10; result = 0; result -= a; System.out.println("result="+result);
		  
		  
		  a=10; result = 0; result *= a; System.out.println("result="+result);
		  
		  
		  a=10; result = 0; result /= a; System.out.println("result="+result);
		 
		  
		  a=10; result = 0; result %= a; System.out.println("result="+result);
		
		
		
		//세과목(국,영,수) 위 3과목의 점수를 입력받아 총점, 평균(소수2자리)을 출력
		double koreanP ;
		double englishP ;
		double mathP  ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수는?:");
		koreanP = sc.nextDouble();
		System.out.println("영어점수는?:");
		englishP = sc.nextDouble();
		System.out.println("수학점수는?:");
		mathP = sc.nextDouble();
		Double avg = ((koreanP+englishP+mathP)/3);
		Double sum = (koreanP+englishP+mathP);
		System.out.println("총점:"+sum+"점");
		System.out.printf("평균:%.2f점\n",avg);
		sc.close();
		//비트연산
		/* 
		 * a100101 == 37
		 * 	b011000 == 24
		 * ---------
		 * a111101 == 61
		 * b100101 == 37
		 * a011000 == 24
		 */
		
	}

}
