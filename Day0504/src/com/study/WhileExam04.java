package com.study;

import java.util.Random;
import java.util.Scanner;

public class WhileExam04 {

	public static void main(String[] args) {

		/*
		 * 0~99���� �����Ǽ��� ī�� 1�� �� ī�� ���� ���ߴ� ���� ���ٿ�
		 */

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		// �������� low, high, card
		int low = 0;
		int high = 0;
		int card = 0;

		// y/n���ڿ��� ���� ������ �ݺ� ���� ���� ����
		while (true) {
			int i = 0;// ������� ����Ƚ��
			low = 0;// ī�� ���� �ּ� ����
			high = 99;

			// 0�� 99������ ����(����)���� ����(���谪)
			card = r.nextInt(100);
			System.out.println(card);
			System.out.println("������ �ִ� ī�� ���� ���߾� ������.");

			while (true) {

				System.out.println("�Է��Ͻ� �� �ִ� ���� ���� " + low + "~~" + high);

				int n = 0;
				n = sc.nextInt();// ���� �Է� ����
				// �Է��� ���� ������ ��� ���� �������� ��� ����
				if (n > high || n < low) {

					System.out.println("�Է��ϴ� ���� ������ �ʰ��ϼ̽��ϴ�.");

				} else {

					if (n == card) {
						System.out.println("���߼̽��ϴ�. ���ϵ帳�ϴ�.");
						break;
					} else if (n > card) {
						System.out.println("�Է°��� ī�尪���� Ů�ϴ�.");
						high = n;
						continue;

					} else {
						System.out.println("�Է°��� ī�尪���� �۽��ϴ�.");
						low = n;
						continue;

					}

				}

				i++;

			} // ���� end while
			System.out.println("��� ������ ���� �Ͻðڽ��ϱ�?(y/n)");
			if (sc.next().equals("n")) {
				break;
			}

		} // �ٱ��� end while

	}

}
