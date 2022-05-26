package com.study;

import java.util.Scanner;

/*
 * Sung Ŭ���� 
 * -�ο����� �Է¹޾� �Է¹��� �ο��� ��ŭ �̸�, ����, ����, ���������� �Է¹ް�
 * ������ ���, ������ ���α׷�
 */

public class Sung02 {
	
	int peopleNum;
	Record[] rec;
	
	// 1.�ο��� �Է�
	public void InputPeopleNum() {
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("�� ���?");
			peopleNum = sc.nextInt();
			
		} while (peopleNum < 1 || peopleNum > 100);
		
		// RecordŬ������ �迭 ������ peopleNum��ŭ ����
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
		
		rec = new Record[peopleNum];

	}
	// 2.�󼼵����� �Է��ϴ� ���//3.���� ó���ϴ� ���

	public void input() {
		double max = 0;
		int rank = 1;
		String[] title = { "����", "����", "����" };
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < peopleNum; i++) {

			// �ν��Ͻ� ����;
			rec[i] = new Record();
			System.out.println(i + 1 + "��° �̸� �Է�:");
			rec[i].name = sc.next();

			rec[i].score = new int[title.length];
			for (int j = 0; j < title.length; j++) {
				System.out.println(title[j] + "������?");
				rec[i].score[j] = sc.nextInt();
				rec[i].tot += rec[i].score[j];
			}

			rec[i].avg = rec[i].tot / 3.0;

		}

	}

	// �������
	public void ranking() {

		int i, j;
		// ��� �л��� ����� 1�� �ʱ�ȭ

		for (i = 0; i < peopleNum; i++) {

			rec[i].rank = 1;
		}
		// ������
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

	// 4.����� ����ϴ� ���

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
