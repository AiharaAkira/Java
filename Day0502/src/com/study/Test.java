package com.study;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("몇 번째 까지 출력? ");
		int k = sc.nextInt();

		// 단
		int height = 2;
		// 단2
		int j = 0;

		// if 조건문에 k+1을 넣기 위해서 k+2까지 반복
		// if 조건문에 k값이 들어가면 >>3까지 출력 -> 2이후에 조건문에 들어감
		// ==2까지 밖에 출력 안됨
		for (int i = 1; i <= k + 2; i++) {

			if (j == 5 && i == k + 1) {
				height = 5;
				i = 1;
				System.out.println();
			}

			if (j == 8 && i == k + 1) {
				height = 8;
				i = 1;
				System.out.println();
			}

			// height는 3단씩 끊을 거기때문에 +2까지 반복
			for (j = height; j <= height + 2; j++) {
				// 10단이 나오는거 방지
				if (j == 10) {
					break;
				}

				// 8단 전까지는 if문에서 height 값(단값)이 바뀌었지만,
				// 8단 이후부터는 if문이 없기때문에 k+1값=행값 이출력됨
				// 따라서, k+1값일때 break
				if (j == 8 && i >= k + 1) {
					break;
				}

				System.out.print(j + "*" + i + "=" + (i * j) + "\t");

			}

			System.out.println();

		}

	}

}
