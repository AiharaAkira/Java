package com.ioex;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {

		File f = new File("D:\\Akira\\zzz.txt");
		
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		//상대경로 : 모든 경로 D:\\Akira\\zzz.txt 
		//절대경로 : 현재 위치를 기준으로 그 곳의 위치를 의미함.
		/*
		 * . : 현재 위치
		 * .. : 현재 위치의 바로 상위의 디렉토리를 의미함
		 * / : 루트(\)
		 * dir
		 */
		
		System.out.println("상대 경로 : " + f.getPath());
		System.out.println("절대 경로 : " + f.getAbsolutePath());
		System.out.println("파일 이름 : "+ f.getName());
		System.out.println("파일 길이 : "+ f.length());
		System.out.println("파일 최종 수정 날짜 : "+ f.lastModified());
		
		
	}
	
}
