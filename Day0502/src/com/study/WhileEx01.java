package com.study;

import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {

		//����ڰ� �Է��ϴ� ������ ��Ӵ��� ������.
		//���� 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ �հ踦 ����ϰ� ����.
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.println("���� ������(0�Է½� ����): ");
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("�� �հ�: "+sum);
				break;
			}
			sum+=num;
			
		}
		
	}

}
