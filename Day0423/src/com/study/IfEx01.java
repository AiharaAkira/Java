package com.study;

import java.io.IOException;

public class IfEx01 {

	public static void main(String[] args) throws IOException {
		System.out.println("���� �ѱ��� �Է�:");
		char a = (char)System.in.read();
		
		if(a>=65&&a<97) {
			System.out.print("�ҹ��ڷ� ��ȯ�Ȱ��:");
			a +=32;
			System.out.print(a);
		}else if(a>=97&&a<=122) {
			System.out.print("�빮�ڷ� ��ȯ�Ȱ��:");
			a -=32;
			System.out.print(a);
			
		}else {
			System.out.println("��� �ƴϳ׿�~");
		}
		
	}

}
