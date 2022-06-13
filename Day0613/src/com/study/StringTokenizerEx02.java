package com.study;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	
	public static void main(String[] args) {

		
		String str = "학교 , 집, 게임방";
		StringTokenizer tokens = new StringTokenizer(str, ",");
		
		for(int x = 1; tokens.hasMoreTokens(); x++) {
			
			System.out.print("문자 "+ x + " : "+tokens.nextToken()+"\t");
			
		}
		//StringTokenizer 클래스의 경우 무의미한 공백을 무시하고 제거함
		
		
		System.out.println();
		System.out.println("=====================");
		
		String[] values = str.split(",");
		
		for(int x = 0; x < values.length; x++) {
			
			System.out.print("문자 "+ (x+1) + ":"+values[x]+"\t");
			
		}
		//String 클래스의 split()메소드는 무의미한 공백도 하나의 자리로 인정함
		
	}

}
