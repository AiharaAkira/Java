package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx05 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat;
		System.out.println("국어점수: ");
		kor = Integer.parseInt(br.readLine());
		System.out.println("영어점수: ");
		eng = Integer.parseInt(br.readLine());
		System.out.println("수학점수: ");
		mat = Integer.parseInt(br.readLine());
		
		System.out.println("국어점수:");
		System.out.println(kor);
		System.out.println("영어점수:");
		System.out.println(eng);
		System.out.println("수학점수:");
		System.out.println(mat);
		
		 
	}

}
