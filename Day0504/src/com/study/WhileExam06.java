package com.study;

import java.util.Scanner;

public class WhileExam06 {

	public static void main(String[] args) {

		//콜라, 사이다, 마운틴, 초코송이 , 에이스, 웨하스가 나오는 자판기 프로그램.
		//0입력하면 종료.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("돈을 넣어주세요(0원 넣으면 종료):");
			int money = sc.nextInt();
			
			 if(money == 0) {
					System.out.println("종료!");
					break;
				}
			
			System.out.println("메뉴를 골라주세요.");
			System.out.println("-----콜라(500), 사이다(600), 마운틴(700), 초코송이(800) , 에이스(900), 웨하스(1500) -----");
			String menu = sc.next();
			if(money >= 500&&menu.equals("콜라")) {
				money = money - 500;
				System.out.println("콜라!");
			}else if(money >= 600&&menu.equals("사이다")) {
				money = money - 600;
				System.out.println("사이다!");
			}else if(money >= 700&&menu.equals("마운틴")) {
				money = money - 700;
				System.out.println("마운틴!");
			}else if(money >= 800&&menu.equals("초코송이")) {
				money = money - 800;
				System.out.println("초코송이!");
			}else if(money >= 900&&menu.equals("에이스")) {
				money = money - 900;
				System.out.println("에이스!");
			}else if(money >= 1500&&menu.equals("웨하스")) {
				money = money - 1500;
				System.out.println("웨하스!");
			}else {
				System.out.println("없는 메뉴입니다.");
			}
			
			System.out.println("거스름돈: "+money+"원");
		}
		
	}

}
