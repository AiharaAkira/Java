package com.study;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {

		//사용자로부터 하나의 숫자를 입력받은 다음, 
		//그 수 만큼 3의 배수를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 정수: ");
		int num = sc.nextInt();
		
		int num2=1;
		
		while(num > 0) {
			
			System.out.print(num2 * 3+"\t");
			
			num--;
			num2++;
			
		}
		
	}

}
