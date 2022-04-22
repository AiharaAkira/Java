package com.study;

import java.io.IOException;

public class TestExam2 {

	public static void main(String[] args) throws IOException  {

		// aiueo

		System.out.println("한 단어 입력: ");
		char word = (char) System.in.read();

		
		String judge =((word >= 'a' && word <= 'z' )||( word >= 'A' && word <= 'Z')) ? (word == 'a' || word == 'A'||word == 'I' || word == 'i'||word == 'U' || word == 'u'||word == 'E' || word == 'e'||word == 'O' || word == 'o')?"모음":"자음":"영어를 입력해주세요";
		System.out.println(judge);

	}

}
