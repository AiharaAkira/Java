package com.ex02;

/*
 * �Ӽ��� �����ϴ� Ŭ����
 * 
 * �Ӽ� : �̸�, ����, ����, ����, ����, ���, ����
 * 
 * */

public class Record {

	String name;
	int[] score = new int[3];
	int tot;
	double avg;
	int rank;
	
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
	
	
	
}
