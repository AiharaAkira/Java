package com.study;

import java.io.IOException;

public class TestExam {

	public static void main(String[] args) throws IOException  {

		// aiueo

		System.out.println("�� �ܾ� �Է�: ");
		char word = (char) System.in.read();

		if ((word >= 'a' && word <= 'z' )||( word >= 'A' && word <= 'Z')) {
			
			
			if(word == 'a' || word == 'A'||word == 'I' || word == 'i'||word == 'U' || word == 'u'||word == 'E' || word == 'e'||word == 'O' || word == 'o') {
				System.out.println("����");
			}else {
				System.out.println("����");
			}

		} else {
			System.out.println("��� �Է����ּ���");
		}

	}

}
