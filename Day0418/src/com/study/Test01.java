package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws IOException {

		//���� �������� �����ڸ� �Է¹޾�  ��� �������α׷��� �����Ͻÿ�.
		//�� ��������ڴ� +-*/%
		//��� �Է��� BufferedReader
		
		int a,b;
		String calc;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("����a�Է�:");
		a = Integer.parseInt(br.readLine());

		System.out.print("�������Է�(+,-,*,/,%):");
		//calc = br.readLine();
		char calc2 = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("����b�Է�:");
		b = Integer.parseInt(br.readLine());
		
		System.out.printf("%d%c%d=%d\n",a,calc2,b,(a+b));
		System.out.println(a+"+"+b+"="+(a+b));
		
		
	}

}
