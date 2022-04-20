package com.study;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 5개의 과목을 점수를 입력받아 총점과 평균을 구하고
		// 평균을 이용하여 학점을 판정하는 프로그램
		// 학점(a:90 b:80 c:70 d:60 f60미만)

		Scanner sc = new Scanner(System.in);
		System.out.println("영어 점수는?");
		int eng = sc.nextInt();
		System.out.println("수학 점수는?");
		int mat = sc.nextInt();
		System.out.println("국어 점수는?");
		int kor = sc.nextInt();
		System.out.println("일본어 점수는?");
		int jpn = sc.nextInt();
		System.out.println("컴퓨터개론 점수는?");
		int com = sc.nextInt();
		
		char grade;
		int sum = kor + com + eng + mat + jpn;
		double avg = sum / 5;
		
		System.out.println("당신의 과목점수는 영어 : "+eng+ "점 , 국어 : "+kor+"점, 수학 : "+mat+ "점, 일본어 : " +jpn+"점, 컴퓨터개론: "+com+"점"+"총점 : "+sum+"점"+"평균 : "+avg+"점");

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.printf("평균은%.2f점 학점은%c", avg, grade);

	}

}
