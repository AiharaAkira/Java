package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileExam02 {

	public static void main(String[] args) throws IOException {
		/*����ڰ� �Է��ϴ� ������ ����ؼ� ���� ���ư�
		 * ����, 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ ���� ��� ��� */
		
		InputStreamReader is  = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(is);
		int num=1;
		int sum = 0;
		while(num != 0) {
			System.out.println("���� ����?(0�� ����)");
			num = Integer.parseInt(br.readLine()) ;
			sum += num;
			
		}
		
		System.out.println("�հ�: "+sum);
		
		
		
		
		
	}
	
}
