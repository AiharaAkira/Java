package com.study;

import java.util.Scanner;

public class DvideByZero {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("������?");
			//������
			int dividend = sc.nextInt();
			
			System.out.println("������?");
			//������
			int divisor = sc.nextInt();
			
			System.out.println(dividend/divisor);
		} catch (Exception e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
			e.printStackTrace();
			
		}finally {
			
			sc.close();
			
		}
		
	}

}
