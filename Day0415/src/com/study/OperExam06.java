package com.study;

/*[문제] 정수 35 가 짝수인지 홀수인지 판정하는 프로그램 구현*/
public class OperExam06 {

	public static void main(String[] args) {

		int a = 20; 
		int b = 30;
		int max = a>b?++a:++b;
		System.out.println(max);
		
		int c = 35;
		String judge = c%2 == 0? "짝수": "홀수";
		System.out.println("정수35는 "+judge+" 입니다");
		
		
		
		
		
	}

}
