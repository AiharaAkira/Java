package com.test;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String[] str = {"����","����","��"};
		while (true) {
			int randomNum = r.nextInt(3)+1;
			
			int user;
			
			do {
				System.out.println("1.���� 2.���� 3.�� 4.(����)");
				user=sc.nextInt();
			}while(user <1||user>3);
			
			System.out.println("�����: "+str[user-1]);
			System.out.println("��ǻ��: "+str[randomNum-1]);
			//ó��������
			String result;
			result = "���º�";
			if((user==1&&randomNum==3)||(user==2&&randomNum==1)||(user==3&&randomNum==2)) {
				result ="�¸�";
			}else if((user==1&&randomNum==2)||(user==2&&randomNum==3)||(user==3&&randomNum==1)) {
				result ="�й�";
			}
			System.out.println(result);
			
		}
		
		
		
	}
}
