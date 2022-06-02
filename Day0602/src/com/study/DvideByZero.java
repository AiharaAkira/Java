package com.study;

import java.util.Scanner;

public class DvideByZero {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("나뉨수?");
			//나뉨수
			int dividend = sc.nextInt();
			
			System.out.println("나눌수?");
			//나눌수
			int divisor = sc.nextInt();
			
			System.out.println(dividend/divisor);
		} catch (Exception e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			e.printStackTrace();
			
		}finally {
			
			sc.close();
			
		}
		
	}

}
