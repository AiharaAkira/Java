package com.study;

import java.util.Scanner;

public class WhileExam06 {

	public static void main(String[] args) {

		//�ݶ�, ���̴�, ����ƾ, ���ڼ��� , ���̽�, ���Ͻ��� ������ ���Ǳ� ���α׷�.
		//0�Է��ϸ� ����.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �־��ּ���(0�� ������ ����):");
			int money = sc.nextInt();
			
			 if(money == 0) {
					System.out.println("����!");
					break;
				}
			
			System.out.println("�޴��� ����ּ���.");
			System.out.println("-----�ݶ�(500), ���̴�(600), ����ƾ(700), ���ڼ���(800) , ���̽�(900), ���Ͻ�(1500) -----");
			String menu = sc.next();
			if(money >= 500&&menu.equals("�ݶ�")) {
				money = money - 500;
				System.out.println("�ݶ�!");
			}else if(money >= 600&&menu.equals("���̴�")) {
				money = money - 600;
				System.out.println("���̴�!");
			}else if(money >= 700&&menu.equals("����ƾ")) {
				money = money - 700;
				System.out.println("����ƾ!");
			}else if(money >= 800&&menu.equals("���ڼ���")) {
				money = money - 800;
				System.out.println("���ڼ���!");
			}else if(money >= 900&&menu.equals("���̽�")) {
				money = money - 900;
				System.out.println("���̽�!");
			}else if(money >= 1500&&menu.equals("���Ͻ�")) {
				money = money - 1500;
				System.out.println("���Ͻ�!");
			}else {
				System.out.println("���� �޴��Դϴ�.");
			}
			
			System.out.println("�Ž�����: "+money+"��");
		}
		
	}

}
