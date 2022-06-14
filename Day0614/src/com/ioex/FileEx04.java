package com.ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx04 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		byte _read[] = new byte[100];
		//파일을 읽기위한 배열선언
		byte _console[] = new byte[100];
		
		//키보드로 입력한 값을 읽어서 console배열에 저장
		
		try {
			
			System.out.println("파일명: ");
			
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
