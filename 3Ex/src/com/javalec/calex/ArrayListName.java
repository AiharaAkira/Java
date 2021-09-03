package com.javalec.calex;

import java.util.ArrayList;

public class ArrayListName {
	public static int getSurvivingIndex(int n, int k) {
		//ArrayList 생성
		ArrayList<Integer> soldiers = new ArrayList<>();
		
		//ArrayList 할당
		for (int soldierNumber = 1; soldierNumber <= n; soldierNumber++) {
			soldiers.add(soldierNumber);
		}
		
		//죽는 순서 초기화
		int killIndex = 0;
		
		//
		while (soldiers.size() > 1) {
			killIndex = (killIndex + k - 1) % soldiers.size();

			System.out.println(soldiers.remove(killIndex) + "번 군사가 죽습니다.");
		}
		//리턴값으로 솔저의 0번 리턴
		return soldiers.get(0);
	}

	public static void main(String[] args) {
		System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
	}
}