package com.study;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� a��?");
		
		String a = sc.next();
		
		
		try {
			if(Integer.parseInt(a)%2==0) {
				System.out.println(a+"�Դϴ�.");
			}else if (Integer.parseInt(a)==0) {
				System.out.println("¦��");
				
			}else if (Integer.parseInt(a)%2!=0) {
				System.out.println("Ȧ��");
				
			}else {
				System.out.println("�����Ұ�");
				
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����Ұ�");
		}
		
			
		
	}

}
