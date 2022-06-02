package com.study;

public class NumExcep {

	public static void main(String[] args) {
		
		String[] stringNumber = {"23", "12", "3.14", "999"};
		
		try {
			
			for(int i = 0; i<stringNumber.length; i++) {
				
				int n = Integer.parseInt(stringNumber[i]);
				
			}
			
		} catch (Exception e) {

			e.printStackTrace();
			
			System.out.println("숫자만 입력가능");
			
		}
		
	}

}
