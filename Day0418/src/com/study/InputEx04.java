package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx04 {

	public static void main(String[] args) throws IOException {

		String name, age, adress, tel;
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�̸�:");
		name = br.readLine();
		System.out.println("����:");
		age = br.readLine();
		System.out.println("�ּ�:");
		adress = br.readLine();
		System.out.println("��ȭ��ȣ:");
		tel = br.readLine();
		
		System.out.println("�̸�:");
		System.out.println(name);
		System.out.println("����:");
		System.out.println(age);
		System.out.println("�ּ�:");
		System.out.println(adress);
		System.out.println("��ȭ��ȣ:");
		System.out.println(tel);
		
		
	}

}
