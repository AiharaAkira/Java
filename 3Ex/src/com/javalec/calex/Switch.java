package com.javalec.calex;

import java.util.Scanner;

public class Switch {

	public Switch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int result = i%2;
		
		switch (result) {
		case 0: {
			
			System.out.println("�Է��Ͻ� ���ڴ� ¦��");
		}break;
		case 1:{
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ��");
		}break;
		default: {
			System.out.println("�߸����Է�");
		}break;
		}
	}
}
		
	


