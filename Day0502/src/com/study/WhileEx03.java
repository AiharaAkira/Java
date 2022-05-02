package com.study;

public class WhileEx03 {

	public static void main(String[] args) {

		//while문으로 구구단
		
		int i = 1;
		int j =2;
		while(i<=9) {
			
			while(j<=9) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
				j++;
				
			}
			
			if(j==10) {
				j =2;
			}
			System.out.println();
			i++;
		}
		
	}

}
