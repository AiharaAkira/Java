package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String[] subname = { "����", "����", "����" };
		// 3,5
		int arr[][][] = new int[2][3][subname.length + 2];
		double[] avg = new double[3];

		for (int h = 0; h < arr.length; h++) {
			for (int i = 0; i < arr[h].length; i++) {
				for (int j = 0; j < arr[h][i].length - 3; j++) {

					do {
						System.out.println(i + 1 + "��°���" + subname[j] + "������?");
						arr[h][i][j] = Integer.parseInt(br.readLine());

					} while (arr[h][i][j] < 0 || arr[h][i][j] > 100);

					// ����
					arr[h][i][arr[h][i].length - 3] += arr[h][i][j];

				}
				// ����
				arr[h][i][arr[i].length - 2] = 1;

				// ����
				avg[i] = arr[h][i][arr[i].length - 3] / (arr[i].length - 3);
				//���
				//arr[i][arr[i].length - 2] = (int) avg[i];
			}
		}

		// �ݼ���
		for(int h=0; h<arr.length;h++) {
			
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[h][i][arr[i].length - 3] < arr[h][j][arr[j].length - 3]) {
					arr[h][i][arr[i].length - 2]++;
				}

			}
		}
		
		}
		
		
		//��������
		
		System.out.println("����\t����\t����\t����\t����");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
