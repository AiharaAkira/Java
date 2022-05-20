package com.account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banking {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strWork ;
		Account a = new Account("홍길동");
		do {
			
			System.out.println("\n작업을 선택하세요");
			System.out.println("======================");
			System.out.println("입금>1");
			System.out.println("출금>2");
			System.out.println("잔액확인>3");
			System.out.println("종료>0");
			System.out.println("======================");
			
			strWork = br.readLine();
			
			if(strWork.equals("1")) {
				
				System.out.println("얼마를 입금하시나요?");
				Long amount = Long.parseLong(br.readLine());
				a.deposit(amount);
				System.out.println("입금액: "+ amount);
				System.out.println("잔액: "+a.getMoney());
				
				
			}else if(strWork.equals("2")) {
				
				System.out.println("얼마를 출금하시나요?");
				Long amount;
				a.withdrawal( amount = Long.parseLong(br.readLine()));
				System.out.println("출금액: "+ amount);
				System.out.println("잔액: "+a.getMoney());
				
				
			}else if(strWork.equals("3")) {
				
				System.out.println("계좌주: "+a.getName());
				System.out.println("잔액: "+a.getMoney());
				
			}
			
		}while(!strWork.equals("0"));
		
		
		System.out.println("통장주인: "+a.getName()+"잔액: "+a.getMoney());
		
		
	}
	
}
