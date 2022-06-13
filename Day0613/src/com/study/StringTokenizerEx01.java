package com.study;

import java.util.StringTokenizer;

/*4교시(2~3교시 다른 반 프로젝트 봄)
 * java.util패키지에 포함 
 * '2016/06/13'이라는 문자열을 delim(구분자를 / 로) 각각 2022, 06, 13으로 분리할때
 * 사용함. 각각의 문자열을 토큰이라고 함
 * */

public class StringTokenizerEx01 {

	StringTokenizer st;
	
	public StringTokenizerEx01(String str) {
	
		st = new StringTokenizer(str);
	
	}
	
	public StringTokenizerEx01(String str, String delim) {
		
		System.out.println("str: " + str);
		st = new StringTokenizer(str, delim);
	
	}
	
	public void print() {
		
		System.out.println("Token count: " + st.countTokens());
		while(st.hasMoreTokens()) {
			
			String token = st.nextToken();
			System.out.println(token);
			
		}
		
	}
	
	public static void main(String[] args) {

		//delim지정안하면 공백
		StringTokenizerEx01 st1 = new StringTokenizerEx01("Happy Day");
		st1.print();
		System.out.println("-------------------");
		StringTokenizerEx01 st2= new StringTokenizerEx01("2022/06/13","/");
		st2.print();
		//tip: 엑셀파일 ,로 구분해서 액셀 파일불러와서(import해서) 사용할때 유용함
	}

}
