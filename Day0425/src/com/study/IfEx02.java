package com.study;

import java.io.IOException;

public class IfEx02 {

	public static void main(String[] args) throws IOException {
		System.out.println("���� �ѱ��� �Է�:");
		char a = (char)System.in.read();
		
		char judge =(a>=65&&a<97)?(a +=32):(a>=97&&a<=122)?(a -=32):'?';
		
		System.out.println(judge);
		
		
		
		
	}

}
