package com.study;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 정수 a는?");
		
		String a = sc.next();
		
		
		try {
			if(Integer.parseInt(a)%2==0) {
				System.out.println(a+"입니다.");
			}else if (Integer.parseInt(a)==0) {
				System.out.println("짝수");
				
			}else if (Integer.parseInt(a)%2!=0) {
				System.out.println("홀수");
				
			}else {
				System.out.println("판정불가");
				
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("판정불가");
		}
		
			
		
	}

}
