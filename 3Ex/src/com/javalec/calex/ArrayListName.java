package com.javalec.calex;

import java.util.ArrayList;

public class ArrayListName {
	public static int getSurvivingIndex(int n, int k) {
		//ArrayList ����
		ArrayList<Integer> soldiers = new ArrayList<>();
		
		//ArrayList �Ҵ�
		for (int soldierNumber = 1; soldierNumber <= n; soldierNumber++) {
			soldiers.add(soldierNumber);
		}
		
		//�״� ���� �ʱ�ȭ
		int killIndex = 0;
		
		//
		while (soldiers.size() > 1) {
			killIndex = (killIndex + k - 1) % soldiers.size();

			System.out.println(soldiers.remove(killIndex) + "�� ���簡 �׽��ϴ�.");
		}
		//���ϰ����� ������ 0�� ����
		return soldiers.get(0);
	}

	public static void main(String[] args) {
		System.out.println("����� " + getSurvivingIndex(20, 5) + "�� �ڸ��� �������� �˴ϴ�.");
	}
}