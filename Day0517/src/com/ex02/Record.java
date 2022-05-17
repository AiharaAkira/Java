package com.ex02;

/*
 * 속성만 존재하는 클래스
 * 
 * 속성 : 이름, 국어, 영어, 수학, 총점, 평균, 석차
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
