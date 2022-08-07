package com.study;

import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("무슨 메뉴를 드릴까요?");
			String order = sc.next();
			int price = 0;
			switch (order) {
			case "에스프레소":
				price = 3500;
				break;

			case "카푸치노":
				price = 3500;

				break;

			case "카페라떼":
				price = 3500;

				break;

			case "아메리카노":
				price = 2000;

				break;
				
			default:
				System.out.println("잘못된 커피명입니다.");
				break;
			}
			
			if(order.equals("에스프레소")||order.equals("카푸치노")||order.equals("카페라떼")||order.equals("아메리카노")) {
				
				System.out.println(order+"는 "+price +"원");
			}

		}
		
				
	}

}
