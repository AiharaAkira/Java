package com.ioex;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {

		File f = new File("D:\\Akira\\zzz.txt");
		
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		//����� : ��� ��� D:\\Akira\\zzz.txt 
		//������ : ���� ��ġ�� �������� �� ���� ��ġ�� �ǹ���.
		/*
		 * . : ���� ��ġ
		 * .. : ���� ��ġ�� �ٷ� ������ ���丮�� �ǹ���
		 * / : ��Ʈ(\)
		 * dir
		 */
		
		System.out.println("��� ��� : " + f.getPath());
		System.out.println("���� ��� : " + f.getAbsolutePath());
		System.out.println("���� �̸� : "+ f.getName());
		System.out.println("���� ���� : "+ f.length());
		System.out.println("���� ���� ���� ��¥ : "+ f.lastModified());
		
		
	}
	
}
