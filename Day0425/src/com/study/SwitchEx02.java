package com.study;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {

		/*
		 * 임의의 년도를 입력받아 입력받은 년도가 윤년인지 평년인지를 판정하는 프로그램구현 년도가 4의배수이면서 100의 배수가 아니거나 400의
		 * 배수이면 윤년 그러지 않은면 평년 윤년이면 2월이 29일 받아서
		 * 
		 * 1년의 평균날짜는 365.2425 실제 1년보다 0.0003일이 길다..
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 년도는?");
		int year = sc.nextInt();
		System.out.println("몇월?");
		int month = sc.nextInt();

		int day = 0;


		switch (month) {
		
		case 2:
			if(((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
				day = 29;
			}else {
				day = 28;
			}
		break;

		case 1:

		case 3:

		case 7:

		case 8:

		case 10:

		case 12:
			day = 31;
			break;
			
		case 4:	
		case 6:	
		case 9:	
		case 11:
			day= 30;

		default :
			day = 0;
			break;
		}
		
		if(day != 0) {
			System.out.println(year+"년"+month+"월은 "+ day +"까지입니다.");
		}else {
			System.out.println("입력오류");
		}


		
		
	}

}
