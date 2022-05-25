package com.study;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("=============");
			System.out.println("1.책등록");
			System.out.println("2.책검색");
			System.out.println("3.책출력");
			System.out.println("4.종료");
			System.out.println("=============");
		
			System.out.println("메뉴 선택:");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("책제목:");
				String title = sc.next();
				System.out.println("책평점:");
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
				System.out.println("검색할 책 제목?");

				String str = sc.next();
				
				for (Book book : books) {
					
					if(book.getTitle().equals(str)) {
						System.out.println(book.getTitle());
						System.out.println(book.getPoint());
						
					}else {
						System.out.println("그런책은 없습니다.");
					}
					
					
					
				}
				
				break;
				
			case 4:
				System.out.println("종료");
				break;
	
			}
			
			
			
			
		}
		
		
		
	}
	
}
