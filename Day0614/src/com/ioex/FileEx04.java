package com.ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx04 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		byte _read[] = new byte[100];
		//������ �б����� �迭����
		byte _console[] = new byte[100];
		
		//Ű����� �Է��� ���� �о console�迭�� ����
		
		try {
			
			System.out.println("���ϸ�: ");
			
			System.in.read(_console);
			
			String file = new String(_console).trim();
			
			fis = new FileInputStream(file);
			
			fis.read(_read, 0, _read.length);
			
			System.out.println(new String(_read).trim());
			
		} catch (FileNotFoundException fnfe) {
			
			fnfe.printStackTrace();
		
		}catch(IOException ie) {
			
			ie.printStackTrace();
			
		}finally {
			
			try {
				
				if(fis != null) {
					
					fis.close();
				
				}
				
			} catch (IOException ie) {
				
				ie.printStackTrace();
			
			}
	
		}
		
	}
	
}
