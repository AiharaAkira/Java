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
		
		
		
		//������(��,��,��) �� 3������ ������ �Է¹޾� ����, ���(�Ҽ�2�ڸ�)�� ���
		double koreanP ;
		double englishP ;
		double mathP  ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����������?:");
		koreanP = sc.nextDouble();
		System.out.println("����������?:");
		englishP = sc.nextDouble();
		System.out.println("����������?:");
		mathP = sc.nextDouble();
		Double avg = ((koreanP+englishP+mathP)/3);
		Double sum = (koreanP+englishP+mathP);
		System.out.println("����:"+sum+"��");
		System.out.printf("���:%.2f��\n",avg);
		sc.close();
		//��Ʈ����
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
