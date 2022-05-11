package com.study;

public class ArrayExam01 {

	public static void main(String[] args) {
		
		int[] score = new int[5];
		
		score[0] = 1;
		score[1] = 1;
		score[2] = 1;
		score[3] = 1;
		score[4] = 3;
		
		System.out.println(score);
		
//		int sum = score[0] + score[1]+score[2]+score[3]+score[4];
		int sum = 0;
		for (int i : score) {
			sum += i;
		}
		
		System.out.println(sum);
		System.out.println(score.length);
		
		
	}
	
}
