package com.study;

import java.util.Scanner;

/*
 * 속성만 존재하는 클래스
 * 
 * 속성 : 이름, 국어, 영어, 수학, 총점, 평균, 석차
 * 
 * */

public class Record implements Sung {

	String name;
	private String[] subject;// 과목명
	int[] score = new int[3];
	String[] score2 = new String[3];
	int tot;
	double avg;
	int rank;

	int peopleNum;
	Record[] rec;

	public Record() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
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

	public Record(String name, int[] score, int tot, double avg, int rank) {
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

		rec = new Record[peopleNum];
	}

	@Override
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
			
				if(rec[i].score[j]>=90) {

					rec[i].score2[j] = "수";
				}else if(rec[i].score[j]>=80) {
					rec[i].score2[j] = "우";
				}else if(rec[i].score[j]>=70) {
					rec[i].score2[j] = "미";
				}else if(rec[i].score[j]>=60) {
					rec[i].score2[j] = "양";
				}else {
					rec[i].score2[j] = "가";
				}
			
			}

			rec[i].avg = rec[i].tot / 3.0;

			
			
		}

	}

	@Override
	public void print() {
		for (Record record : rec) {
			System.out.print(record.name + "\t");

			for (int i = 0; i < 3; i++) {
				System.out.print(record.score[i] + "\t");
				System.out.print("("+record.score2[i] +")"+ "\t");

			}
			System.out.print(record.tot + "\t");
			System.out.printf("%.2f\t", record.avg);
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

				if (rec[i].avg > rec[j].avg) {
					rec[j].rank++;
				} else if (rec[i].avg < rec[j].avg) {
					rec[i].rank++;
				}

			}

		}

	}

}
