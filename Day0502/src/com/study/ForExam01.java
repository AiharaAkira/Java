package com.study;

public class ForExam01 {

	public static void main(String[] args) {
		//1~100������ ���� �߿��� 2,3,5,7�� ����� ������ ���� ���࿡
		//10���� ����ϴ� ���α׷�.
		//���� ����
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
