package com.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchEx01 {

	public static void main(String[] args) {

		//�� ������ �����ڸ� �Է¹޾� ����ϴ� ���α׷��� ����
		//switch ~ case
		try {
			
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("����a�Է�: ");
		int a = Integer.parseInt(br.readLine()); 
		System.out.println("������ �Է�: ");
		char cal = br.readLine().charAt(0);
		
		System.out.println("����b�Է�: ");
		int b = Integer.parseInt(br.readLine());
		int tot = 0;
		switch (cal) {
		case '+':
			tot = a+b;
			System.out.printf("���:%d%c%d=%d\n",a,cal,b,tot);
			break;
			
		case '-':
			tot = a-b;
			System.out.printf("���:%d%c%d=%d\n",a,cal,b,tot);
			break;
		case '*':
			tot = a*b;
			System.out.printf("���:%d%c%d=%d\n",a,cal,b,tot);
			break;
		case '/':
			tot = a/b;
			System.out.printf("���:%d%c%d=%d\n",a,cal,b,tot);
			break;
		case '%':
			tot = a%b;
			System.out.printf("���:%d%c%d=%d\n",a,cal,b,tot);
			break;	
		default:
			System.out.println("�����ڸ� ��Ȯ�� �Է����ּ���");
			break;
		}
		
		} catch (Exception e) {
			System.out.println("�������� ���� �����ϸ�");
			System.out.println("0���� ������ �����ϴ�.");
		}
		

	}

}
