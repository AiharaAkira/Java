package com.study;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// ��øif�Ἥ, ������ �г��� �Է¹޾� 60�� �̻��̸� �հ�,���հ�
		// �� 4�г��ϰ�� 70���̻��̸� �հ�,���հ�

		Scanner sc = new Scanner(System.in);

		System.out.println("�г���?");
		int grade = sc.nextInt();
		System.out.println("������?");
		int point = sc.nextInt();
		
		
		
			
			if (grade <= 4 && point >= 60) {
				
				if (grade <= 3 && point >= 60) {
					System.out.println("�հ�");
					
				} else if (grade == 4 && point < 70) {
					System.out.println("���հ�");

				} else if (grade == 4 && point >= 70) {
					System.out.println("�հ�");
					
				}

			} else if(grade <= 3 && point <60){
				System.out.println("���հ�");

			}else {
				System.out.println("�г��� ��Ȯ�� �Է����ּ���");
			}
			
		
		
		

	}

}
