package com.study;

import java.io.IOException;

public class TestExam2 {

	public static void main(String[] args) throws IOException  {

		// aiueo

		System.out.println("�� �ܾ� �Է�: ");
		char word = (char) System.in.read();

		
		String judge =((word >= 'a' && word <= 'z' )||( word >= 'A' && word <= 'Z')) ? (word == 'a' || word == 'A'||word == 'I' || word == 'i'||word == 'U' || word == 'u'||word == 'E' || word == 'e'||word == 'O' || word == 'o')?"����":"����":"��� �Է����ּ���";
		System.out.println(judge);

	}

}
