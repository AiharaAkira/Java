package com.study;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	
	public static void main(String[] args) {

		
		String str = "�б� , ��, ���ӹ�";
		StringTokenizer tokens = new StringTokenizer(str, ",");
		
		for(int x = 1; tokens.hasMoreTokens(); x++) {
			
			System.out.print("���� "+ x + " : "+tokens.nextToken()+"\t");
			
		}
		//StringTokenizer Ŭ������ ��� ���ǹ��� ������ �����ϰ� ������
		
		
		System.out.println();
		System.out.println("=====================");
		
		String[] values = str.split(",");
		
		for(int x = 0; x < values.length; x++) {
			
			System.out.print("���� "+ (x+1) + ":"+values[x]+"\t");
			
		}
		//String Ŭ������ split()�޼ҵ�� ���ǹ��� ���鵵 �ϳ��� �ڸ��� ������
		
	}

}
