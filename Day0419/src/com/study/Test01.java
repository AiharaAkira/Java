package com.study;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 중첩if써서, 점수와 학년을 입력받아 60점 이상이면 합격,불합격
		// 단 4학년일경우 70점이상이면 합격,불합격

		Scanner sc = new Scanner(System.in);

		System.out.println("학년은?");
		int grade = sc.nextInt();
		System.out.println("점수는?");
		int point = sc.nextInt();
		
		
		
			
			if (grade <= 4 && point >= 60) {
				
				if (grade <= 3 && point >= 60) {
					System.out.println("합격");
					
				} else if (grade == 4 && point < 70) {
					System.out.println("불합격");

				} else if (grade == 4 && point >= 70) {
					System.out.println("합격");
					
				}

			} else if(grade <= 3 && point <60){
				System.out.println("불합격");

			}else {
				System.out.println("학년을 정확히 입력해주세요");
			}
			
		
		
		

	}

}
