package com.ioex;

import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		
		File directory = new File("d:/");
		
		if(directory.exists()) {//파일 존재 여부 검사
			if(directory.isDirectory()) {//디렉토리인지 아닌지 검사
				
				//현재 디렉토리 내의 모든 파일
				String[] fileNameList = directory.list();
				
				for (String str : fileNameList) {
					System.out.println(str);
				}
				
			}
		}
		
	
		
		
	}
	
}
