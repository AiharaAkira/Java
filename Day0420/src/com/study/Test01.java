package com.study;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 5���� ������ ������ �Է¹޾� ������ ����� ���ϰ�
		// ����� �̿��Ͽ� ������ �����ϴ� ���α׷�
		// ����(a:90 b:80 c:70 d:60 f60�̸�)

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������?");
		int eng = sc.nextInt();
		System.out.println("���� ������?");
		int mat = sc.nextInt();
		System.out.println("���� ������?");
		int kor = sc.nextInt();
		System.out.println("�Ϻ��� ������?");
		int jpn = sc.nextInt();
		System.out.println("��ǻ�Ͱ��� ������?");
		int com = sc.nextInt();
		
		char grade;
		int sum = kor + com + eng + mat + jpn;
		double avg = sum / 5;
		
		System.out.println("����� ���������� ���� : "+eng+ "�� , ���� : "+kor+"��, ���� : "+mat+ "��, �Ϻ��� : " +jpn+"��, ��ǻ�Ͱ���: "+com+"��"+"���� : "+sum+"��"+"��� : "+avg+"��");

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.printf("�����%.2f�� ������%c", avg, grade);

	}

}
