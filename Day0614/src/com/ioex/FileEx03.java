package com.ioex;

import java.io.File;
import java.io.IOException;

public class FileEx03 {

	public static void main(String[] args) {

		//���ϻ���
		File f1 = new File("d:/Akira/zzz1.txt");
		try {
			
			if(f1.exists()) {
				
				System.out.println("���� �̸�:"+f1.getName());
				
			}else {
				
				f1.createNewFile();
				System.out.println("���ο� ������ ��������ϴ�.");
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//���丮 ����
		File f2 = new File("d:/newDirectory");
		
		if(!f2.exists()) {
			
			f2.mkdir();
			System.out.println("���丮 ����");
			
		}else {
			
			System.out.println("���丮 �̸�: "+f2.getPath());
			
		}
		
		//����Ȥ�� ���丮 ����
		
		f2.delete();
		f1.delete();
		
		File f3 = new File("d:/text.txt");
		if(f3.exists()) {
			
			f3.delete();
			
		}else {
			
			System.out.println("����Ȥ�� ���丮�� �������� �ʽ��ϴ�.");
			
		}
		
		//����Ȥ�� ���丮 �̸� ����
		if(f1.exists()) {
			
			f1.renameTo(f3);
			f2.renameTo(f3);
			
		}else {
			System.out.println("������ ���� x");
		}
		
		
	}

}
