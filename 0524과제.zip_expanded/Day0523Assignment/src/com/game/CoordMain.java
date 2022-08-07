package com.game;

import java.util.Scanner;

public class CoordMain {
	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);
		Coordinate coord = new Coordinate(3, 3);

		while (true) {
			String playerStr;
			do {
				coord.print();
				System.out.println("ĳ���� ���� �̵�?-����(h)�Ʒ�(j)������(k)��(i)-");
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
				System.out.println("��ȭ�� �տ� �־���.");
				break;

			} else {
				// print
				coord.print();
			}

		}

	}
}
