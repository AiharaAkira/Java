package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//����ڷκ��� ������ ������ �Է¹޾�, �Է¹��� ������ ������� �������� 0����
		
		InputStreamReader is = new  InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("������������ ??");
		int a = Integer.parseInt(br.readLine());
		
		if(a==0) {
			
			System.out.println("0�̳׿�");
		}else if(a >0) {
			
			System.out.println("����׿�");
		}else {
			
			System.out.println("�����׿�");
		}
		
		
		
	}

}
