package com.study;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {

		//���� ���� ���� ������ �Է¹޾� ������ ��� �׸��� ������ ���ض�
		//90A 60���� F
		//����� �Ҽ��� ���� ���ڸ� ����
		//���� �������� 100��
		Scanner sc = new Scanner(System.in);
		
		String grade = "";
		
		do {
			System.out.println("����������?");
			double kor = sc.nextDouble();
			if(kor>100||kor<0) {
				System.out.println("������ ��Ȯ�� �Է��ϼ���.");
				continue;
			}
			System.out.println("����������?");
			double eng = sc.nextDouble();
			if(eng>100||eng<0) {
				System.out.println("������ ��Ȯ�� �Է��ϼ���.");
				continue;
			}
			System.out.println("����������?");
			double mat = sc.nextDouble();
			if(mat>100&&mat<0) {
				System.out.println("������ ��Ȯ�� �Է��ϼ���.");
				continue;
			}
			
			double sum = kor + eng + mat;
			double avg = sum/3;
			
			if(avg >=90) {
				grade ="A";
			}else if(avg >=80) {
				grade ="B";
			}else if(avg >=70) {
				grade ="C";
			}else if(avg >=61) {
				grade ="D";
			}else {
				grade = "F";
			}
			System.out.printf("������ %.2f\n",sum);
			System.out.printf("����� %.2f\n",avg);
			System.out.println("������ "+grade);
		} while (true);
		
	}

}
