package com.study;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����?");
		int a = sc.nextInt();
		
		if(a%3==0||a%2==0) {

			if(a%2==0&&a%3==0) {
				System.out.println("2��3�� ����Դϴ�.");
			}else if(a%3==0) {
				
				System.out.println("3�� ����Դϴ�.");
			}else {
				System.out.println("2�� ����Դϴ�.");
				
			}
		}else {
			System.out.println("2�� 3�� ����� �ƴմϴ�.");
		}
		
		
	}

}
