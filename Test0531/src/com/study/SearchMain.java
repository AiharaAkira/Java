package com.study;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SearchService ssv = new SearchService();
		
		do {
			
			System.out.println("검색할 이름:");
			String name = sc.next();
			
			boolean searchResult = ssv.searchMember(name);
			if(searchResult) {
				break;
			}
			
			System.out.println("해당 회원은 없습니다.");
		
		}while(true);
		
		
	}
	
}
