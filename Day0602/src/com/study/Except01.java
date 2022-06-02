package com.study;

public class Except01 {

	public static void main(String[] args) {
		
		int num = 100;
		int result = 0;
		
		
			for(int i = 0; i< 10; i++) {
				
				try {
				
				result = num/(int)(Math.random()*10);
				System.out.println(result);
	
				} catch (ArithmeticException e) {
					
					System.out.println("0으로는 나눌 수 없습니다.");
					
				}
				
			}
			
			
			
			
		
		
	}
	
}
