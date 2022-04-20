package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * 임의의 년도를 입력받아 입력받은 년도가 윤년인지 평년인지를 판정하는 프로그램구현 년도가 4의배수이면서 100의 배수가 아니거나 400의
		 * 배수이면 윤년 그러지 않은면 평년
		 */

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		System.out.println("임의의 년도?");
		int a = Integer.parseInt(br.readLine());

		/*
		 * if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
		 * 
		 * 
		 * System.out.println(a + "년은 윤년"); } else { System.out.println(a + "년은 평년");
		 * 
		 * }
		 */
		
		String result = ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) ? "윤년입니다." : "평년입니다.";
		System.out.println(result);
		
		
		
	}

}
