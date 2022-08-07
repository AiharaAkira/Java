package com.study;

public class OperEx01 {

	public static void main(String[] args) {

		/* 
		 * 증감연산자(++, --):하나씩 증가시키거나 감소시키는 연산자
		 *  */
		
		int x = 10;
		int y = x++;
		System.out.println(x);
		System.out.println(y);
		
		int i = 5;
		i++;//i=i+1; sum = sum +1 후위형
		
		System.out.println(i);
		i=5;
		++i;//전위형
		System.out.println(i);
		
		
	}

}
