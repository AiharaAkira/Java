package com.study;

import java.util.Scanner;

/*
 * Sung 클래스 
 * -인원수를 입력받아 입력받은 인원수 만큼 이름, 국어, 영어, 수학점수를 입력받고
 * 총점과 평균, 석차를 프로그램
 */

public class Sung02 {
	
	int peopleNum;
	Record[] rec;
	
	// 1.인원수 입력
	public void InputPeopleNum() {
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("총 몇명?");
			peopleNum = sc.nextInt();
			
		} while (peopleNum < 1 || peopleNum > 100);
		
		// Record클래스의 배열 변수를 peopleNum만큼 생성
		// Record 클래스의 인스턴스를 생성한 것은 아니다.
		
		rec = new Record[peopleNum];

	}
	// 2.상세데이터 입력하는 기능//3.연산 처리하는 기능

	public void input() {
		double max = 0;
		int rank = 1;
		String[] title = { "국어", "영어", "수학" };
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < peopleNum; i++) {

			// 인스턴스 생성;
			rec[i] = new Record();
			System.out.println(i + 1 + "번째 이름 입력:");
			rec[i].name = sc.next();

			rec[i].score = new int[title.length];
			for (int j = 0; j < title.length; j++) {
				System.out.println(title[j] + "점수는?");
				rec[i].score[j] = sc.nextInt();
				rec[i].tot += rec[i].score[j];
			}

			rec[i].avg = rec[i].tot / 3.0;

		}

	}

	// 석차계산
	public void ranking() {

		int i, j;
		// 모든 학생의 등수를 1로 초기화

		for (i = 0; i < peopleNum; i++) {

			rec[i].rank = 1;
		}
		// 등수계산
		for (i = 0; i < peopleNum - 1; i++) {

			for (j = i + 1; j < peopleNum; j++) {

				if (rec[i].avg > rec[j].avg) {
					rec[j].rank++;
				} else if (rec[i].avg < rec[j].avg) {
					rec[i].rank++;
				}

			}

		}

	}

	// 4.결과를 출력하는 기능

	public void output() {

		for (Record record : rec) {
			System.out.print(record.name + "\t");

			for (int i = 0; i < 3; i++) {
				System.out.print(record.score[i] + "\t");

			}
			System.out.print(record.tot + "\t");
			System.out.printf("%.2f\t", record.avg);
			System.out.print(record.rank + "\t");
			System.out.println();

		}
	}

	public Sung02() {
	}

}
