package com.study;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		//����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ 
		//¦������ Ȧ�������� �����ϴ� ���α׷��� �ۼ�
		//�� ���ǻ��� ������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ������ �Է�:");
		int a = sc.nextInt();
		/*
		 * String result =(a%2==0)?result="¦���Դϴ�." :"Ȧ���Դϴ�." ;
		 * System.out.println(result);
		 */
		
		
		if(a%2 == 0) {
			System.out.println("¦���Դϴ�.");
			
		}else {
			System.out.println("Ȧ���Դϴ�.");
			
		}
		
		sc.close();
		
		
		
		
		
	}
	
}
