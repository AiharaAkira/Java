package com.study;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SearchService ssv = new SearchService();
		
		do {
			
			System.out.println("�˻��� �̸�:");
			String name = sc.next();
			
			boolean searchResult = ssv.searchMember(name);
			if(searchResult) {
				break;
			}
			
			System.out.println("�ش� ȸ���� �����ϴ�.");
		
		}while(true);
		
		
	}
	
}
