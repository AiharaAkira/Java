package com.study;

import java.util.Scanner;

public class IfExam01_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� a:");
		int a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a+"�� ¦��");
		}else {
			System.out.println(a+"�� Ȧ��");
		}
		
		sc.close();
	}

}
