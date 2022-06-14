package com.ioex;

import java.io.File;
import java.io.IOException;

public class FileEx03 {

	public static void main(String[] args) {

		//파일생성
		File f1 = new File("d:/Akira/zzz1.txt");
		try {
			
			if(f1.exists()) {
				
				System.out.println("파일 이름:"+f1.getName());
				
			}else {
				
				f1.createNewFile();
				System.out.println("새로운 파일을 만들었습니다.");
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//디랙토리 생성
		File f2 = new File("d:/newDirectory");
		
		if(!f2.exists()) {
			
			f2.mkdir();
			System.out.println("디렉토리 생성");
			
		}else {
			
			System.out.println("디렉토리 이름: "+f2.getPath());
			
		}
		
		//파일혹은 디렉토리 삭제
		
		f2.delete();
		f1.delete();
		
		File f3 = new File("d:/text.txt");
		if(f3.exists()) {
			
			f3.delete();
			
		}else {
			
			System.out.println("파일혹은 디렉토리가 존재하지 않습니다.");
			
		}
		
		//파일혹은 디렉토리 이름 변경
		if(f1.exists()) {
			
			f1.renameTo(f3);
			f2.renameTo(f3);
			
		}else {
			System.out.println("파일이 존재 x");
		}
		
		
	}

}
