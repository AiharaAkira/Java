package com.board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		boolean isStop = false;

		Scanner sc = new Scanner(System.in);

		BoardSVC boardSVC = new BoardSVC();
		String menu;
		do {

			System.out.println("�޴��� �����ϼ���.");

			System.out.println("1.�۾��� 2. �� ��� ���� 3. �� ���� 4. ����");

			menu = sc.next();

			switch (menu) {
			case "1":
				boardSVC.writeArticle(sc);
				
				break;

			case "2":
				boardSVC.getAllArticle();
				break;

			case "3":
				boardSVC.removeArticle();;
				break;

			case "4":

				isStop = true;

			}

		} while (!isStop||(!menu.equals("1")&&!menu.equals("2")&&!menu.equals("3")&!menu.equals("4")));

	}

}
