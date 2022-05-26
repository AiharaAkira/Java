package com.study;

import java.util.Scanner;

/*
 * �Ӽ��� �����ϴ� Ŭ����
 * 
 * �Ӽ� : �̸�, ����, ����, ����, ����, ���, ����
 * 
 * �������̽� ���� Ŭ���� impl
 * 
 */

public class Record3 implements Sung {

	String name;
	private String[] subject;// �����
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

			System.out.println("�� ���?");
			peopleNum = sc.nextInt();

		} while (peopleNum < 1 || peopleNum > 100);

		// RecordŬ������ �迭 ������ peopleNum��ŭ ����
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.

		rec = new Record3[peopleNum];
	}

	@Override
	public void input() {

		double max = 0;
		int rank = 1;
		String[] title = { "����", "����", "����" };
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < peopleNum; i++) {

			// �ν��Ͻ� ����;
			rec[i] = new Record3();
			System.out.println((i + 1) + "��° �̸� �Է�:");
			rec[i].name = sc.next();

			rec[i].score = new String[title.length];
			for (int j = 0; j < title.length; j++) {
				do {

					System.out.println(title[j] + "������?");
					rec[i].score[j] = sc.next();
				} while (!rec[i].score[j].equals("��") && !rec[i].score[j].equals("��") && !rec[i].score[j].equals("��")
						&& !rec[i].score[j].equals("��") && !rec[i].score[j].equals("��"));

				if (rec[i].score[j].equals("��")) {
					rec[i].tot += 5;
				} else if (rec[i].score[j].equals("��")) {
					rec[i].tot += 4;
				} else if (rec[i].score[j].equals("��")) {
					rec[i].tot += 3;
				} else if (rec[i].score[j].equals("��")) {
					rec[i].tot += 2;
				} else if (rec[i].score[j].equals("��")) {
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
		// ��� �л��� ����� 1�� �ʱ�ȭ

		for (i = 0; i < peopleNum; i++) {

			rec[i].rank = 1;
		}
		// ������
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
