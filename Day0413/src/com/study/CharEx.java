package com.study;

import java.util.Scanner;

/*
 * char:2byte
 * �ƽ�Ű�ڵ�:1����Ʈ���ڸ� ǥ��, 0~255���� ����
 * �����ڵ�:2����Ʈ�� ǥ��(0~65535���ڹ���)���� ǥ��
 * */

public class CharEx {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		char ch2='\u0041';
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ�:");
		String str = sc.next();
		
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		System.out.println((char)(ch1 + ch2));
		System.out.println("���ڿ�:"+str);
		
		
		
		
	}
	
}
