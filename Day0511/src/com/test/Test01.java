package com.test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		/*
		 * 학생수를 입력받아 입력받은 인원수 만큼학생의 이름과 전화번호를 입력받고 입력받은 내용을 전체를출력
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("학생 인원수는?");
		String[] students = new String[(sc.nextInt() * 2)];

		for (int i = 0; i < students.length; i++) {

			if (i % 2 == 0) {
				System.out.println("이름을 입력하세요.");

			}
			if (i % 2 != 0) {

				System.out.println("전화번호를 입력하세요.");

			}
			students[i] = sc.next();
		}

		for (int i = 0; i < students.length; i++) {

			if (i == 0) {
				System.out.println("--------------------------");
				System.out.println("이름\t전화번호");
			}

			if (i % 2 == 0) {

				System.out.print(students[i] + "\t");
			}
			if (i % 2 != 0) {

				System.out.println(students[i]);
			}
		}
		System.out.println("-----------------------------");

	}
}
