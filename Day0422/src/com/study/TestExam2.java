package com.study;

import java.io.IOException;

public class TestExam2 {

	public static void main(String[] args) throws IOException {

		// aiueo

		System.out.println("�� �ܾ� �Է�: ");
		char word = (char) System.in.read();

		String judge = ((word >= 'a' && word <= 'z') || (word >= 'A' && word <= 'Z'))
				? (word == 'a' || word == 'i' || word == 'u' || word == 'e' || word == 'o'
						|| word == 'A' || word == 'I' || word == 'U' || word == 'E' || word == 'O') ? "����" : "����"
				: "��� �Է����ּ���";

		System.out.println(judge);
		
		/*
		 * int a = 1_000_000; int b = 2_000_000; System.out.println(a);
		 * System.out.println(b); long c = (long)a*b; System.out.println(c);
		 */
		
		
	}

}
