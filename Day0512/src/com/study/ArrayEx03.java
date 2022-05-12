package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String[] subname = { "����", "����", "����" };
		// 3,5
		int arr[][] = new int[3][subname.length + 2];
		double[] avg = new double[3];
		
		int row = arr.length;	
		int subjectColNum = arr.length-2;	
		int ratingColNum = arr.length -1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 2; j++) {
				do {

					System.out.println(i + 1 + "��°���" + subname[j] + "������?");
					arr[i][j] = Integer.parseInt(br.readLine());

				} while (arr[i][j] < 0 || arr[i][j] > 100);

				// ����
				arr[i][arr[i].length - 2] += arr[i][j];

			}

			// ����
			arr[i][arr[i].length - 1] = 1;

			// ����
			avg[i] = arr[i][arr[i].length - 2] / (arr[i].length - 2);

			// ���
			// arr[i][arr[i].length - 2] = (int) avg[i];
		}
		
		// ����
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i][arr[i].length - 2] < arr[j][arr[j].length - 2]) {
					arr[i][arr[i].length - 1]++;
				}

			}
		}

		System.out.println("����\t����\t����\t����\t����");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
