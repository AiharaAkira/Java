package com.card;

import java.util.ArrayList;

public class CardMain {

	public static void main(String[] args) {

		ArrayList<Card> cards = new ArrayList<>();
		
		
		int cnt = 1;
		String shape = "";
		String num[] = new String[53];

		for (int i = 2; i <= 10; i++) {

			num[i] = Integer.toString(i);
		}

		for (int i = 0; i < 52; i++) {
			if (cnt <= 13) {
				shape = "Ŭ��";
				if (cnt == 1) {
					num[1] = "���̽�";
				} else if (cnt == 11) {
					num[cnt] = "��";
				} else if (cnt == 12) {
					num[cnt] = "��";
				} else if (cnt == 13) {
					num[cnt] = "ŷ";
				} else {
					num[cnt] = Integer.toString(cnt);
				}

			} else if (cnt <= 26) {
				shape = "���̾Ƹ��";

				if (cnt == 14) {
					num[14] = "���̽�";
				} else if (cnt == 24) {
					num[cnt] = "��";
				} else if (cnt == 25) {
					num[cnt] = "��";
				} else if (cnt == 26) {
					num[cnt] = "ŷ";
				} else {
					num[cnt] = Integer.toString(cnt - 13);
				}

			} else if (cnt <= 39) {
				shape = "��Ʈ";

				if (cnt == 27) {
					num[27] = "���̽�";
				} else if (cnt == 37) {
					num[cnt] = "��";
				} else if (cnt == 38) {
					num[cnt] = "��";
				} else if (cnt == 39) {
					num[cnt] = "ŷ";
				} else {
					num[cnt] = Integer.toString(cnt - 26);
				}

			} else if (cnt <= 52) {
				shape = "�����̵�";

				if (cnt == 40) {
					num[40] = "���̽�";
				} else if (cnt == 50) {
					num[cnt] = "��";
				} else if (cnt == 51) {
					num[cnt] = "��";
				} else if (cnt == 52) {
					num[cnt] = "ŷ";
				} else {
					num[cnt] = Integer.toString(cnt - 39);
				}

			}

			cards.add(new Card(shape, num[cnt]));
			cnt++;

		}
		System.out.print("[");
		int x = 1;
		for (Card card2 : cards) {
			System.out.print(card2.shape);
			System.out.print(" ");
			System.out.print(card2.num);
			x++;
			if (x == 53) {
				System.out.print("");
			} else {

				System.out.print(", ");
			}
		}
		System.out.print("]");

	}

}
