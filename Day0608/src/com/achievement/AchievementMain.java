package com.achievement;

import java.io.IOException;


public class AchievementMain {

	public static void main(String[] args) {

		char ch;

		AchievementSVC score = new AchievementSVC();

		try {

			while (true) {

				do {

					System.out.println("1.�߰�  2.���� 3.���� 4, ��ü��� 5.�й��˻� 6.�̸���� 7.����");
					ch = (char) System.in.read();
					System.in.skip(2);

				} while (ch < '1' || ch > '7');

				switch (ch) {
				case '1':
					score.intsert();
					break;

				case '2':
					score.update();
					break;

				case '3':
					score.delete();
					break;

				case '4':
					score.listAll();
					break;

				case '5':

					score.searchHak();

					break;

				case '6':
					
					score.searchName();

					break;

				case '7':
					System.out.println("����");
					return;

				}

			}
		} catch (IOException ioe) {
			ioe.printStackTrace();

		}
		
		
	}

}
