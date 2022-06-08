package com.achievement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class AchievementSVC {

	private Scanner sc = new Scanner(System.in);
	private List<AchievementVO> list = new ArrayList<>();
	
	public void delete() {

		System.out.println("---�Է�--- ");
		System.out.println("�й��Է�");
		String hak = sc.next();
		
		AchievementVO vo = readScore(hak);
		
		if(vo == null) {
			
			System.out.println("��� ���� ���� �й��Դϴ�.");
			
			return;
		}
		
		list.remove(vo);
		System.out.println("�ڷ���� �Ϸ�");
		
	}

	public void intsert() {

		System.out.println("---�Է�--- ");
		System.out.println("�й��Է�");
		String hak = sc.next();
		
		AchievementVO temp = readScore(hak);
		
		if(temp != null) {
			
			System.out.println("�̹� ��ϵ� �й� �Դϴ�.");
			
			return;
		}
		
		AchievementVO vo = new AchievementVO();
		vo.setHak(hak);
		System.out.println("�̸�?");
		vo.setName(sc.next());
		System.out.println("����⵵?");
		vo.setBirth(sc.next());
		System.out.println("��������?");
		vo.setEng(sc.nextInt());
		System.out.println("��������?");
		vo.setMat(sc.nextInt());
		System.out.println("��������?");
		vo.setKor(sc.nextInt());
			
		list.add(vo);
		System.out.println("�ڷ��� �Ϸ�");
	
	}
	
	public AchievementVO readScore(String hak) {
		
		AchievementVO vo =null;
		
		for(AchievementVO temp : list) {
			
			if(temp.getHak().equals(hak)) {
				
				vo = temp;
				break;
				
			}
			
		}
		
		return vo;
		
	}

	public void listAll() {
		
		System.out.println("��ü ����Ʈ ���....");
		Iterator<AchievementVO> it = list.iterator();
		
		while(it.hasNext()) {
			
			AchievementVO vo = it.next();
			
			System.out.println(vo);
			
		}
		
		System.out.println("����� �����ϴ�.");

	}

	public void searchHak() {

		System.out.println("�й��˻�");
		String hak;
		System.out.println("�˻��� �й� �Է�: ");
		hak = sc.next();
		
		AchievementVO vo = readScore(hak);
		
		if(vo != null) {
			
			System.out.println(vo);
			
		}else {
			
			System.out.println("�������� �ʴ� �й��Դϴ�.");
	
		}
		
	}

	public void searchName() {
		
		System.out.println("�̸��˻� ... ");
		String name;
		System.out.println("�˻��� �̸� �Է�");
		name = sc.next();
		
		for (AchievementVO vo : list) {
			
			if(vo.getName().startsWith(name)) {
				
				System.out.println(vo);
				return;
				
			}
			
		}
		
		System.out.println("�������� �ʴ� �̸��Դϴ�.");
		
	}

	public void update() {

		System.out.println("�ڷ����....");
		System.out.println("������ �й� �Է�: ");
		String hak = sc.next();
		AchievementVO vo = readScore(hak);
		
		if(vo == null) {
			
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.");
			
			return;
			
		}
		
		System.out.println("�̸�?");
		vo.setName(sc.next());
		System.out.println("����⵵?");
		vo.setBirth(sc.next());
		System.out.println("��������?");
		vo.setEng(sc.nextInt());
		System.out.println("��������?");
		vo.setMat(sc.nextInt());
		System.out.println("��������?");
		vo.setKor(sc.nextInt());
		
		System.out.println("�ڷ���� �Ϸ�");
		
	}

}
