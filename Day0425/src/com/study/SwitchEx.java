package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEx {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("����������?");
		int eng = Integer.parseInt(br.readLine());
		System.out.println("����������?");
		int kor = Integer.parseInt(br.readLine());
		System.out.println("�Ͼ�������?");
		int jpn = Integer.parseInt(br.readLine());
		System.out.println("����������?");
		int mat = Integer.parseInt(br.readLine());
		System.out.println("��ǻ�Ͱ���������?");
		int com = Integer.parseInt(br.readLine());

		int sum = eng + kor + jpn + mat + com;

		int avg = sum / 5;

		String grade = "";

		switch (avg / 10) {
		
		case 10:
			grade = "A+";
			break;
		
		case 9:
			grade = "A";
			break;

		case 8:
			grade = "B";
			break;

		case 7:
			grade = "C";
			break;

		case 6:
			grade = "D";
			break;

		default:
			grade = "F";
			break;
		}

		System.out.println("����������: " + eng + ", ����������: " + kor );
		
		System.out.println("�Ͼ�������: " + jpn + ", ����������: " + mat + ", �İ�������: "
				+ com );
		
		System.out.println( "������ " + sum + ", ����� " + avg + ", ������ " + grade);
		
		
	}

}
