package com.study;

public class ForExam01 {

	public static void main(String[] args) {
		//1~100까지의 정수 중에서 2,3,5,7의 배수를 제외한 수를 한행에
		//10개씩 출력하는 프로그램.
		//조건 삼항
		int cnt = 0;
		
		String result ="";
		
		for(int i =1; i<=100; i++) {
			if(i%2 == 0||i%3 == 0|| i%5==0||i%7 ==0) {
				continue;
			}
			cnt++;
			
			System.out.print(cnt ==11? "\n":i+" ");
		}
	}
	
}
