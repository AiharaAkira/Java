package com.study;

import java.util.Random;
import java.util.Scanner;

public class WhileExam04 {

	public static void main(String[] args) {

		/*
		 * 0~99까지 임의의수의 카드 1장 이 카드 수를 맞추는 게임 업다운
		 */

		Random r = new Random();
		int gameNum = r.nextInt(100);
		String gameNum2 = Integer.toString(gameNum);
		System.out.println(gameNum);
		System.out.println("---------임의의 수는?---------");

		while (true) {
			try {

				Scanner sc = new Scanner(System.in);
				System.out.println("무슨 수일까? ");
				String numP = sc.next();
				int num = 0;

				if(Integer.parseInt(numP)>99 || Integer.parseInt(numP)<0) {
					System.out.println("0~99까지의 숫자만 입력해 주세요.");
					continue;
				}
				
				if (numP.equals(gameNum2)) {
					System.out.println("정답!");

				}
				if (Integer.parseInt(numP) > gameNum) {
					System.out.println("더 작은 수 ");

				}
				if (Integer.parseInt(numP) < gameNum) {
					System.out.println("더 큰 수 ");

				}

				String numP2 = "";
				while (true) {

					System.out.println("계속:y || 종료:n?");
					numP2 = sc.next();

					if (numP2.equals("n") || numP2.equals("N")) {
						System.out.println("종료합니다.");
						break;
					} else if (numP2.equals("y") || numP2.equals("Y")) {
						System.out.println("계속합니다.");
						break;
					}

				}

				if (numP2.equals("n") || numP2.equals("N")) {
					break;
				}

			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}

		}

	}

}
