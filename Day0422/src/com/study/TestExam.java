package com.study;

import java.io.IOException;

public class TestExam {

	public static void main(String[] args) throws IOException  {

		// aiueo

		System.out.println("한 단어 입력: ");
		char word = (char) System.in.read();

		if ((word >= 'a' && word <= 'z' )||( word >= 'A' && word <= 'Z')) {
			
			
			if(word == 'a' ||  word == 'i'|| word == 'u'|| word == 'e'|| word == 'o') {
				System.out.println("모음");
			}else if(word == 'A'||word == 'I' ||word == 'U' ||word == 'E' ||word == 'O' ){
				System.out.println("모음");
				
			}else {
				System.out.println("자음");
			}

		} else {
			System.out.println("영어를 입력해주세요");
		}

	}

}
