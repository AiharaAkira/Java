package com.study;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {

		//국어 영어 수학 점수를 입력받아 총점과 평균 그리고 학점을 구해라
		//90A 60이하 F
		//평균은 소수점 이하 두자리 까지
		//과목 총점수는 100점
		Scanner sc = new Scanner(System.in);
		
		String grade = "";
		
		do {
			System.out.println("국어점수는?");
			double kor = sc.nextDouble();
			if(kor>100||kor<0) {
				System.out.println("점수를 정확히 입력하세요.");
				continue;
			}
			System.out.println("영어점수는?");
			double eng = sc.nextDouble();
			if(eng>100||eng<0) {
				System.out.println("점수를 정확히 입력하세요.");
				continue;
			}
			System.out.println("수학점수는?");
			double mat = sc.nextDouble();
			if(mat>100&&mat<0) {
				System.out.println("점수를 정확히 입력하세요.");
				continue;
			}
			
			double sum = kor + eng + mat;
			double avg = sum/3;
			
			if(avg >=90) {
				grade ="A";
			}else if(avg >=80) {
				grade ="B";
			}else if(avg >=70) {
				grade ="C";
			}else if(avg >=61) {
				grade ="D";
			}else {
				grade = "F";
			}
			System.out.printf("총점은 %.2f\n",sum);
			System.out.printf("평균은 %.2f\n",avg);
			System.out.println("학점은 "+grade);
		} while (true);
		
	}

}
