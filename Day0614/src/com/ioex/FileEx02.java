package com.ioex;

import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		
		File directory = new File("d:/");
		
		if(directory.exists()) {//���� ���� ���� �˻�
			if(directory.isDirectory()) {//���丮���� �ƴ��� �˻�
				
				//���� ���丮 ���� ��� ����
				String[] fileNameList = directory.list();
				
				for (String str : fileNameList) {
					System.out.println(str);
				}
				
			}
		}
		
	
		
		
	}
	
}
