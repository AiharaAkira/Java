package com.board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		boolean isStop = false;

		Scanner sc = new Scanner(System.in);

		BoardSVC boardSVC = new BoardSVC();
		String menu;
		do {

			System.out.println("메뉴를 선택하세요.");

			System.out.println("1.글쓰기 2. 글 목록 보기 3. 글 삭제 4. 종료");

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
