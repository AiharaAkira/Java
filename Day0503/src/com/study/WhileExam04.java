package com.study;

import java.util.Random;
import java.util.Scanner;

public class WhileExam04 {

	public static void main(String[] args) {

		/*
		 * 0~99���� �����Ǽ��� ī�� 1�� �� ī�� ���� ���ߴ� ���� ���ٿ�
		 */

		Random r = new Random();
		int gameNum = r.nextInt(100);
		String gameNum2 = Integer.toString(gameNum);
		System.out.println(gameNum);
		System.out.println("---------������ ����?---------");

		while (true) {
			try {

				Scanner sc = new Scanner(System.in);
				System.out.println("���� ���ϱ�? ");
				String numP = sc.next();
				int num = 0;

				if(Integer.parseInt(numP)>99 || Integer.parseInt(numP)<0) {
					System.out.println("0~99������ ���ڸ� �Է��� �ּ���.");
					continue;
				}
				
				if (numP.equals(gameNum2)) {
					System.out.println("����!");

				}
				if (Integer.parseInt(numP) > gameNum) {
					System.out.println("�� ���� �� ");

				}
				if (Integer.parseInt(numP) < gameNum) {
					System.out.println("�� ū �� ");

				}

				String numP2 = "";
				while (true) {

					System.out.println("���:y || ����:n?");
					numP2 = sc.next();

					if (numP2.equals("n") || numP2.equals("N")) {
						System.out.println("�����մϴ�.");
						break;
					} else if (numP2.equals("y") || numP2.equals("Y")) {
						System.out.println("����մϴ�.");
						break;
					}

				}

				if (numP2.equals("n") || numP2.equals("N")) {
					break;
				}

			} catch (Exception e) {
				System.out.println("���ڸ� �Է����ּ���.");
				continue;
			}

		}

	}

}
