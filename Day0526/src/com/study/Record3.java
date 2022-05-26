package com.study;

import java.util.Scanner;

/*
 * 속성만 존재하는 클래스
 * 
 * 속성 : 이름, 국어, 영어, 수학, 총점, 평균, 석차
 * 
 * 인터페이스 구현 클래스 impl
 * 
 */

public class Record3 implements Sung {

	String name;
	private String[] subject;// 과목명
	String[] score = new String[3];
	int tot;
	double avg;
	int rank;

	int peopleNum;
	Record3[] rec;

	public Record3() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getScore() {
		return score;
	}

	public void setScore(String[] score) {
		this.score = score;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Record3(String name, String[] score, int tot, double avg, int rank) {
		super();
		this.name = name;
		this.score = score;
		this.tot = tot;
		this.avg = avg;
		this.rank = rank;
	}

	@Override
	public void InputPeopleNum() {
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("총 몇명?");
			peopleNum = sc.nextInt();

		} while (peopleNum < 1 || peopleNum > 100);

		// Record클래스의 배열 변수를 peopleNum만큼 생성
		// Record 클래스의 인스턴스를 생성한 것은 아니다.

		rec = new Record3[peopleNum];
	}

	@Override
	public void input() {

		double max = 0;
		int rank = 1;
		String[] title = { "국어", "영어", "수학" };
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < peopleNum; i++) {

			// 인스턴스 생성;
			rec[i] = new Record3();
			System.out.println((i + 1) + "번째 이름 입력:");
			rec[i].name = sc.next();

			rec[i].score = new String[title.length];
			for (int j = 0; j < title.length; j++) {
				do {

					System.out.println(title[j] + "점수는?");
					rec[i].score[j] = sc.next();
				} while (!rec[i].score[j].equals("수") && !rec[i].score[j].equals("양") && !rec[i].score[j].equals("미")
						&& !rec[i].score[j].equals("우") && !rec[i].score[j].equals("가"));

				if (rec[i].score[j].equals("수")) {
					rec[i].tot += 5;
				} else if (rec[i].score[j].equals("우")) {
					rec[i].tot += 4;
				} else if (rec[i].score[j].equals("미")) {
					rec[i].tot += 3;
				} else if (rec[i].score[j].equals("양")) {
					rec[i].tot += 2;
				} else if (rec[i].score[j].equals("가")) {
					rec[i].tot += 1;
				}

			}

			// rec[i].avg = rec[i].tot / 3.0;

		}

	}

	@Override
	public void print() {
		for (Record3 record : rec) {
			System.out.print(record.name + "\t");

			for (int i = 0; i < 3; i++) {
				System.out.print(record.score[i] + "\t");

			}
			System.out.print(record.rank + "\t");
			System.out.println();
		}
	}

	@Override
	public void set() {

		int i, j;
		// 모든 학생의 등수를 1로 초기화

		for (i = 0; i < peopleNum; i++) {

			rec[i].rank = 1;
		}
		// 등수계산
		for (i = 0; i < peopleNum - 1; i++) {

			for (j = i + 1; j < peopleNum; j++) {

				if (rec[i].tot > rec[j].tot) {
					rec[j].rank++;
				} else if (rec[i].tot < rec[j].tot) {
					rec[i].rank++;
				}

			}

		}

	}

}
