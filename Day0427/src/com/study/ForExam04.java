package com.study;

import java.util.Scanner;

public class ForExam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float sum = 0;
		int cnt = 0;
		while (true) {
			System.out.println(" �Ǽ��Է�: ");
			float a = sc.nextFloat();
			if (a < 0) {

				cnt++;
				float avg = sum / cnt;
				System.out.println(cnt);
				System.out.println(sum);
				System.out.printf("���� �Ǽ� �Է�: %.1f \n", a);
				System.out.printf("���: %.1f\n", avg);

				break;

			} else if (a > 0) {
				sum += a;
				cnt++;
				System.out.printf("���� �Ǽ� �Է�: %.1f \n", a);
				System.out.println();

			}else {
				System.out.println("0�̿��� ���� �Է����ּ���.");
			}

		}

	}

}
