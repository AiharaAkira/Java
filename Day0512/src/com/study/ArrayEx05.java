package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx05 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] sub = new int[4];
		
		int kor = 0; 
		int eng = 0; 
		int mat = 0; 
		int sum = 0; 
		double avg = 0;
		
		
		do {
			System.out.println("국어점수");
			kor = Integer.parseInt(br.readLine());
		}while(kor < 0 ||kor>100);
		
		do {
			System.out.println("영어점수");
			eng = Integer.parseInt(br.readLine());
		}while(eng < 0 ||eng>100);
		
		do {
			System.out.println("수학점수");
			mat = Integer.parseInt(br.readLine());
		}while(mat < 0 ||mat>100);
		
		sum = kor + eng + mat;
		avg = sum/3.0f;
		
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
		
		
	}

}
