package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx06 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = {"국어점수", "영어점수", "수학점수"};
		int[] sub = new int[subname.length+1];
		
		double avg = 0;
		
		for(int i = 0; i < sub.length-1; i++) {
		
			do {
				System.out.println(subname[i]+":");
				sub[0] = Integer.parseInt(br.readLine());
			}while(sub[i] < 0 ||sub[i]>100);
			
			//총점
			sub[sub.length-1] += sub[i];
			
		}
		
		//평균
		avg = sub[sub.length-1]/(sub.length-1);
		
		System.out.println("총점:"+sub[sub.length-1]);
		System.out.println("평균:"+avg);
		
		
	}

}
