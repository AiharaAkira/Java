package com.javalec.calex;

import java.util.Scanner;

public class ExCodeitPresentation {



	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		boolean inMainMenu = true;
		while(inMainMenu) {
			System.out.println("(I)ntro (C)ourses (E)xit");
			
			switch(scanner.next()) {
			
			case "I":
			case "i":
				System.out.println("  �ȳ��ϼ���! �츮�� �ڵ����Դϴ�.\r\n" + 
						"�Բ� �����սô�!");
				break;
			case "C":
			case "c":
				
				boolean inCourseMenu = true;
				while (inCourseMenu) {
					System.out.println("�ڵ��� ������ �Ұ��մϴ�.\r\n" + 
							"(P)ython (J)ava (i)OS (B)ack");
					
					switch (scanner.next()) {
					case "P": 
					case "p":
						System.out.println("Python �� ���� ��ǻ�� ���̾��� ���ʸ� ���ϴ�.\r\n" + 
								"����: ������\r\n" + 
								"��õ ��������: ����");
						break;
						
					case "J": 
					case "j":
						System.out.println("Java�� �⺻ ������ ��ü������ ���α׷����� ���ϴ�.\r\n" + 
								"����: �����\r\n" + 
								"��õ ��������: Python");
						break;
						
					case "I": 
					case "i":
						System.out.println("  �ֽ� Swift �� ���� iOS ������ ������ �� �ֽ��ϴ�.\r\n" + 
								"����: ����ȣ\r\n" + 
								"��õ ��������: Python, Java");
						break;
						
					case "B": 
					case "b":
						inCourseMenu = false;
						break;
						
					default:
						System.out.println("�ٽ� �Է��� �ּ���.");
						break;
					}
				}
				
				break;
			case "E":
			case "e":
				System.out.println("�ȳ��� ������.");
				inMainMenu = false;
				break;
			default:
				System.out.println("�ٽ� �Է��� �ּ���.");
				break;
			
			}
		}
	}
	
}
/*
(I)ntro (C)ourses (E)xit

�ȳ��� ������.
  
  �ȳ��ϼ���! �츮�� �ڵ����Դϴ�.
�Բ� �����սô�!

�ڵ��� ������ �Ұ��մϴ�.
(P)ython (J)ava (i)OS (B)ack

Python �� ���� ��ǻ�� ���̾��� ���ʸ� ���ϴ�.
����: ������
��õ ��������: ����

Java�� �⺻ ������ ��ü������ ���α׷����� ���ϴ�.
����: �����
��õ ��������: Python
  
  
  �ֽ� Swift �� ���� iOS ������ ������ �� �ֽ��ϴ�.
����: ����ȣ
��õ ��������: Python, Java
 

 */
