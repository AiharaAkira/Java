package com.study;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int []arr;
		System.out.println("�迭�� ũ���?");
		arr = new int[sc.nextInt()];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("������ ��?");
			arr[i] = sc.nextInt();
			
		}
		
		int max = 0;
		for (int i : arr) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println("����ū����: "+max);
		
	}

}
