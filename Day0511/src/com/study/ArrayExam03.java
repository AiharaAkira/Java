package com.study;

public class ArrayExam03 {

	public static void main(String[] args) {
		// �迭�� Ȱ���Ͽ� �ִ밪�� �ּҰ�

		int[] num = { 79, 88, 91, 33, 100, 55, 95 };
		// �迭�� ù��° ������ �ִ� �ʱ�ȭ
		int max = num[0];
		// �迭�� ù��° ������ �ּڰ� �ʱ�ȭ
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= max) {
				max = num[i];
			} else if (num[i] <= min) {
				min = num[i];
			}
		}

		System.out.println("�ִ�:" + max);
		System.out.println("�ּڰ�:" + min);
	}

}
