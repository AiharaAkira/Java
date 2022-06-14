package com.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calendar cal = Calendar.getInstance();

		int y, m, i;

		System.out.println("�⵵ : ");
		y = sc.nextInt();

		do {

			System.out.println("�� : ");
			m = sc.nextInt();

		} while (m < 1 || m > 12);

		cal.set(y, m - 1, 1);

		int w = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(" " + y + "�� " + m + "��");
		System.out.println(" ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=============");

		for (i = 1; i <= w; i++) {

			System.out.print(" ");

		}

		for (i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%4d", i);
			w++;

			if (w % 7 == 1) {

				System.out.println();

			}

		}

		if (w % 7 != 1) {
			System.out.println();
		}

		System.out.println("================");

	}

}
