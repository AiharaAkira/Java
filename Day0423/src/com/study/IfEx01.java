package com.study;

import java.io.IOException;

public class IfEx01 {

	public static void main(String[] args) throws IOException {
		System.out.println("영어 한글자 입력:");
		char a = (char)System.in.read();
		
		if(a>=65&&a<97) {
			System.out.print("소문자로 변환된결과:");
			a +=32;
			System.out.print(a);
		}else if(a>=97&&a<=122) {
			System.out.print("대문자로 변환된결과:");
			a -=32;
			System.out.print(a);
			
		}else {
			System.out.println("영어가 아니네요~");
		}
		
	}

}
