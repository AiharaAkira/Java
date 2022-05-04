package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileExam02 {

	public static void main(String[] args) throws IOException {
		/*사용자가 입력하는 정수를 계속해서 더해 나아감
		 * 만약, 0이 입력되면 지금까지 입력된 정수의 덧셈 결과 출력 */
		
		InputStreamReader is  = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(is);
		int num=1;
		int sum = 0;
		while(num != 0) {
			System.out.println("더할 정수?(0은 종료)");
			num = Integer.parseInt(br.readLine()) ;
			sum += num;
			
		}
		
		System.out.println("합계: "+sum);
		
		
		
		
		
	}
	
}
