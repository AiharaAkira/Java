package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * ������ �⵵�� �Է¹޾� �Է¹��� �⵵�� �������� ��������� �����ϴ� ���α׷����� �⵵�� 4�ǹ���̸鼭 100�� ����� �ƴϰų� 400��
		 * ����̸� ���� �׷��� ������ ���
		 */

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		System.out.println("������ �⵵?");
		int a = Integer.parseInt(br.readLine());

		/*
		 * if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
		 * 
		 * 
		 * System.out.println(a + "���� ����"); } else { System.out.println(a + "���� ���");
		 * 
		 * }
		 */
		
		String result = ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) ? "�����Դϴ�." : "����Դϴ�.";
		System.out.println(result);
		
		
		
	}

}
