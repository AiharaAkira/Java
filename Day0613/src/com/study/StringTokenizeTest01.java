package com.study;

import java.util.StringTokenizer;

public class StringTokenizeTest01 {

	public static void main(String[] args) {

		//문제 
		String str = "삶이 그대를 속일지라도 슬퍼하거나 노여워 말라.";
		
		StringTokenizer st = new StringTokenizer(str);
		
		System.out.println("토큰 수(token count): "+st.countTokens());
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
			
		}
		
		
		
	}

}
