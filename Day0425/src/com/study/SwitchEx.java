package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEx {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("영어점수는?");
		int eng = Integer.parseInt(br.readLine());
		System.out.println("국어점수는?");
		int kor = Integer.parseInt(br.readLine());
		System.out.println("일어점수는?");
		int jpn = Integer.parseInt(br.readLine());
		System.out.println("수학점수는?");
		int mat = Integer.parseInt(br.readLine());
		System.out.println("컴퓨터개론점수는?");
		int com = Integer.parseInt(br.readLine());

		int sum = eng + kor + jpn + mat + com;

		int avg = sum / 5;

		String grade = "";

		switch (avg / 10) {
		
		case 10:
			grade = "A+";
			break;
		
		case 9:
			grade = "A";
			break;

		case 8:
			grade = "B";
			break;

		case 7:
			grade = "C";
			break;

		case 6:
			grade = "D";
			break;

		default:
			grade = "F";
			break;
		}

		System.out.println("영어점수는: " + eng + ", 국어점수는: " + kor );
		
		System.out.println("일어점수는: " + jpn + ", 수학점수는: " + mat + ", 컴개점수는: "
				+ com );
		
		System.out.println( "총점은 " + sum + ", 평균은 " + avg + ", 학점은 " + grade);
		
		
	}

}
