package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodEx05 {
		
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static String getString(String str) throws IOException {
		
		
		System.out.println(str+":");
		String imsi = br.readLine();
		
		return imsi;
	}
	
	public int getInt(String str) throws NumberFormatException, IOException {
		System.out.println(str+":");
		
		return Integer.parseInt(br.readLine());
	}
		
	public static void main(String[] args) throws IOException {
			
		String name = getString("�̸�");
		System.out.println(name+"�� �ȳ��ϼ���");
		
		MethodEx05 m5 = new MethodEx05();
		
		System.out.println("��������: "+m5.getInt("����")+"��");
		
	}

}
