package com.study;

import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���� �޴��� �帱���?");
			String order = sc.next();
			int price = 0;
			switch (order) {
			case "����������":
				price = 3500;
				break;

			case "īǪġ��":
				price = 3500;

				break;

			case "ī���":
				price = 3500;

				break;

			case "�Ƹ޸�ī��":
				price = 2000;

				break;
				
			default:
				System.out.println("�߸��� Ŀ�Ǹ��Դϴ�.");
				break;
			}
			
			if(order.equals("����������")||order.equals("īǪġ��")||order.equals("ī���")||order.equals("�Ƹ޸�ī��")) {
				
				System.out.println(order+"�� "+price +"��");
			}

		}
		
				
	}

}
