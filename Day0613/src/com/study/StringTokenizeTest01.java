package com.study;

import java.util.StringTokenizer;

public class StringTokenizeTest01 {

	public static void main(String[] args) {

		//���� 
		String str = "���� �״븦 �������� �����ϰų� �뿩�� ����.";
		
		StringTokenizer st = new StringTokenizer(str);
		
		System.out.println("��ū ��(token count): "+st.countTokens());
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
			
		}
		
		
		
	}

}
