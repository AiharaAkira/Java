package com.study;

import java.util.Arrays;

public class ArrayExam02 {

	public static void main(String[] args) {

		int[] iArr = new int[10];
		int[] iArr2 = new int[6];
		int[] iArr3 = new int[] { 100, 95, 80, 70 };
		int[] iArr4 = { 100, 95, 80, 70 };
		char[] chArr = { 'A', 'b', 'c', 'd' };

		// iArr1 의 배열에 1~10까지 순서대로 저장함

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
			System.out.println(iArr[i]);
		}
		
		System.out.println("------------------------------------------");
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 45) + 1;
			System.out.print(iArr2[i]+"	");
		}
		
		
		System.out.println();
		System.out.println("----------------------------------------");
	
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(chArr);
		
	}

}
