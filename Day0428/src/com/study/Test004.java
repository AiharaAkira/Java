package com.study;

import java.util.Scanner;

public class Test004 {

	public static void main(String[] args) {
		
		//�Է��� ������ ����
		//�Է¹��� ����. �Է¹��� ����ŭ ��հ��� ���Ͽ� ���
		//�� ��հ��� �Ǽ��� ó��
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է�: ");
		int numCnt = sc.nextInt();
		int sum = 0;
		
		
		for(int i = 1; i <= numCnt; i++) {
			
			System.out.println("���� �Է�: ");
			int num = sc.nextInt();
			
			sum += num;
			
		}
		
		double avg = (double)sum/numCnt;
		
		System.out.println("�����"+avg);
		
	}

}
