package com.test;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		/* ��ǻ�Ϳ� ����� ������ ���������� ������ ����
		 * ����ڰ� ���� 3������ �ϳ��� �Է��ϰ� ������
		 * ��ǻ�ʹ� �������� �ϳ��� �����Ͽ� ����
		 * �����̰������ �Ǵ��ϰ� ����ڰ� �׸��� �Է��ϸ� ������ ������ */
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String[] str = {"����","����","��"};
		while (true) {
			int randomNum = r.nextInt(3);
			
			String com = str[randomNum];
			System.out.println("��ǻ��:"+com);
			System.out.println("����ڰ� �Է�(����,����,��)(����)");
			String player = sc.next();
			
			if(player.equals("����")) {
				System.out.println("�����մϴ�!");
				break;
			}
			
			if(player.equals(com)) {
				System.out.println("���º�!");
			}else if((player.equals(str[0])&&com.equals(str[1]))||(player.equals(str[1])&&com.equals(str[0]))||(player.equals(str[2])&&com.equals(str[1]))) {
				System.out.println("�й�!");
			}else if((player.equals(str[0])&&com.equals(str[2]))||(player.equals(str[1])&&com.equals(str[2]))||(player.equals(str[2])&&com.equals(str[0]))) {
				System.out.println("�¸�!");
			}else {
				System.out.println("�ٽ��Է��ϼ���");
				continue;
			}
			
		}
		
		
		
	}
}
