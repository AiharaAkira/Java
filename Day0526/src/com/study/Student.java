package com.study;

public class Student  {

	private String name;
	private String[] subject;//과목명
	private int[] sco;//과목점수
	private int number;
	private int avg;
	private int sum;
	
	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public int[] getSco() {
		return sco;
	}

	public void setSco(int[] sco) {
		this.sco = sco;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public Student(String name, String[] subject, int[] sco, int number, int avg, int sum) {
		super();
		this.name = name;
		this.subject = subject;
		this.sco = sco;
		this.number = number;
		this.avg = avg;
		this.sum = sum;
	}
	
	
	
}
