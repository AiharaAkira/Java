package com.study;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {

		/*
		 * ������ �⵵�� �Է¹޾� �Է¹��� �⵵�� �������� ��������� �����ϴ� ���α׷����� �⵵�� 4�ǹ���̸鼭 100�� ����� �ƴϰų� 400��
		 * ����̸� ���� �׷��� ������ ��� �����̸� 2���� 29�� �޾Ƽ�
		 * 
		 * 1���� ��ճ�¥�� 365.2425 ���� 1�⺸�� 0.0003���� ���..
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �⵵��?");
		int year = sc.nextInt();
		System.out.println("���?");
		int month = sc.nextInt();

		int day = 0;


		switch (month) {
		
		case 2:
			if(((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
				day = 29;
			}else {
				day = 28;
			}
		break;

		case 1:

		case 3:

		case 7:

		case 8:

		case 10:

		case 12:
			day = 31;
			break;
			
		case 4:	
		case 6:	
		case 9:	
		case 11:
			day= 30;

		default :
			day = 0;
			break;
		}
		
		if(day != 0) {
			System.out.println(year+"��"+month+"���� "+ day +"�����Դϴ�.");
		}else {
			System.out.println("�Է¿���");
		}


		
		
	}

}
