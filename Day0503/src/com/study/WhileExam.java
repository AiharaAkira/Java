package com.study;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {

		//����ڷκ��� �ϳ��� ���ڸ� �Է¹��� ����, 
		//�� �� ��ŭ 3�� ����� ����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����: ");
		int num = sc.nextInt();
		
		int num2=1;
		
		while(num > 0) {
			
			System.out.print(num2 * 3+"\t");
			
			num--;
			num2++;
			
		}
		
	}

}
