package com.account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banking {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strWork ;
		Account a = new Account("ȫ�浿");
		do {
			
			System.out.println("\n�۾��� �����ϼ���");
			System.out.println("======================");
			System.out.println("�Ա�>1");
			System.out.println("���>2");
			System.out.println("�ܾ�Ȯ��>3");
			System.out.println("����>0");
			System.out.println("======================");
			
			strWork = br.readLine();
			
			if(strWork.equals("1")) {
				
				System.out.println("�󸶸� �Ա��Ͻó���?");
				Long amount = Long.parseLong(br.readLine());
				a.deposit(amount);
				System.out.println("�Աݾ�: "+ amount);
				System.out.println("�ܾ�: "+a.getMoney());
				
				
			}else if(strWork.equals("2")) {
				
				System.out.println("�󸶸� ����Ͻó���?");
				Long amount;
				a.withdrawal( amount = Long.parseLong(br.readLine()));
				System.out.println("��ݾ�: "+ amount);
				System.out.println("�ܾ�: "+a.getMoney());
				
				
			}else if(strWork.equals("3")) {
				
				System.out.println("������: "+a.getName());
				System.out.println("�ܾ�: "+a.getMoney());
				
			}
			
		}while(!strWork.equals("0"));
		
		
		System.out.println("��������: "+a.getName()+"�ܾ�: "+a.getMoney());
		
		
	}
	
}
