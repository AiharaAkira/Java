package com.study;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("=============");
			System.out.println("1.å���");
			System.out.println("2.å�˻�");
			System.out.println("3.å���");
			System.out.println("4.����");
			System.out.println("=============");
		
			System.out.println("�޴� ����:");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("å����:");
				String title = sc.next();
				System.out.println("å����:");
				int point = sc.nextInt();
				books.add(new Book(title,point));
				break;

			case 3:
				
				for (Book book : books) {
					System.out.println(book.title);
					System.out.println(book.point);
				}
				
				break;
	
			case 2:
				System.out.println("�˻��� å ����?");

				String str = sc.next();
				
				for (Book book : books) {
					
					if(book.getTitle().equals(str)) {
						System.out.println(book.getTitle());
						System.out.println(book.getPoint());
						
					}else {
						System.out.println("�׷�å�� �����ϴ�.");
					}
					
					
					
				}
				
				break;
				
			case 4:
				System.out.println("����");
				break;
	
			}
			
			
			
			
		}
		
		
		
	}
	
}
