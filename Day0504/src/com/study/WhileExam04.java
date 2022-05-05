package com.study;

import java.util.Random;
import java.util.Scanner;

public class WhileExam04 {

	public static void main(String[] args) {

		/*
		 * 0~99까지 임의의수의 카드 1장 이 카드 수를 맞추는 게임 업다운
		 */

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		// 변수선언 low, high, card
		int low = 0;
		int high = 0;
		int card = 0;

		// y/n문자열이 들어가면 게임을 반복 진행 여부 결정
		while (true) {
			int i = 0;// 사용자의 시행횟수
			low = 0;// 카드 값의 최소 범위
			high = 99;

			// 0과 99사이의 정수(난수)값을 생성(숨김값)
			card = r.nextInt(100);
			System.out.println(card);
			System.out.println("숨겨져 있는 카드 값을 맞추어 보세요.");

			while (true) {

				System.out.println("입력하실 수 있는 값의 범위 " + low + "~~" + high);

				int n = 0;
				n = sc.nextInt();// 값을 입력 받음
				// 입력한 값이 범위를 벗어난 경우와 정상적인 경우 판정
				if (n > high || n < low) {

					System.out.println("입력하는 값은 범위를 초과하셨습니다.");

				} else {

					if (n == card) {
						System.out.println("맞추셨습니다. 축하드립니다.");
						break;
					} else if (n > card) {
						System.out.println("입력값이 카드값보다 큽니다.");
						high = n;
						continue;

					} else {
						System.out.println("입력값이 카드값보다 작습니다.");
						low = n;
						continue;

					}

				}

				i++;

			} // 안쪽 end while
			System.out.println("계속 게임을 진행 하시겠습니까?(y/n)");
			if (sc.next().equals("n")) {
				break;
			}

		} // 바깥쪽 end while

	}

}
