package com.study;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		// ������ ������ ���� �ݾ��� �Է¹޾� ��������, ������, õ����, �����,���,�ʿ�,�Ͽ�
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�ݾ��� �Է��Ͻÿ�. �Է±ݾ�:");
		int price = sc.nextInt();
		int oman = 0;
		int man = 0;
		int chon = 0;
		int obak = 0;
		int bak = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;

		if (50000 <= price) {
			oman = (price / 50000);
			price = price % 50000;
			
		}
		
		if (10000 <= price) {
			man = price / 10000;
			price = price % 10000;
			
		}
		
		if (1000 <= price) {
			chon = price / 1000;
			price = price % 1000;

		}
		
		if (500 <= price) {
			obak = price / 500;
			price = price % 500;

		} else if (100 <= price) {
			bak = price / 100;
			price = price % 100;

		}
		
		if (50 <= price) {
			osip = price / 50;
			price = price % 50;

		}
		
		if (10 <= price) {
			sip = price / 10;
			price = price % 10;

		}
		
		if (1 <= price) {
			il = price / 1;

		}

		System.out.println("��������: " + oman + "��");
		System.out.println("������: " + man + "��");
		System.out.println("õ����: " + chon + "��");
		System.out.println("�������: " + obak + "��");
		System.out.println("�����: " + bak + "��");
		System.out.println("���ʿ���: " + osip + "��");
		System.out.println("�ʿ���: " + sip + "��");
		System.out.println("�Ͽ���: " + il + "��");

	}

}
