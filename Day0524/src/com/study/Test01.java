package com.study;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		// 좌표불러옴
		// 출력
		// 몬스터 >> 죽음
		// 황금 >> 승리+게임끝

		Scanner sc = new Scanner(System.in);
		Coordinate coord = new Coordinate(3, 3);

		while (true) {
			String playerStr;
			do {
				coord.print();
				System.out.println("캐릭터 어디로 이동?-왼쪽(h)아래(j)오른쪽(k)위(i)-");
				playerStr = sc.next();

			} while (!playerStr.equals("h") && !playerStr.equals("j") && !playerStr.equals("k")
					&& !playerStr.equals("i"));

			if (playerStr.equals("h")) {

				coord.left();

			} else if (playerStr.equals("j")) {

				coord.down();

			} else if (playerStr.equals("k")) {

				coord.right();

			} else if (playerStr.equals("i")) {

				coord.up();

			}

			if (coord.getX() > 18 || coord.getY() > 9 || coord.getX() < 0 || coord.getY() < 0) {
				coord = new Coordinate(3, 3);
			}

			if (coord.monX == coord.getY() && coord.monY == coord.getX()) {

				System.out.println("you died");
				break;

			} else if (coord.getX() == 5 && coord.getY() == 4) {
				System.out.println("금화를 손에 넣었다.");
				break;

			} else {
				// print
				coord.print();
			}

		}

	}
}
