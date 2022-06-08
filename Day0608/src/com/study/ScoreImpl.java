package com.study;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;


public class ScoreImpl implements Score {

	
	private Scanner sc = new Scanner(System.in);
	private Vector<ScoreVO> vector= new Vector<ScoreVO>();
	
	@Override
	public void delete() {

		System.out.println("---�Է�--- ");
		System.out.println("�й��Է�");
		String hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if(vo == null) {
			
			System.out.println("��� ���� ���� �й��Դϴ�.");
			
			return;
		}
		
		vector.remove(vo);
		System.out.println("�ڷ���� �Ϸ�");
		
	}

	@Override
	public void intsert() {

		System.out.println("---�Է�--- ");
		System.out.println("�й��Է�");
		String hak = sc.next();
		
		ScoreVO temp = readScore(hak);
		
		if(temp != null) {
			
			System.out.println("�̹� ��ϵ� �й� �Դϴ�.");
			
			return;
		}
		
		ScoreVO vo = new ScoreVO();
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
			
		vector.add(vo);
		System.out.println("�ڷ��� �Ϸ�");
	
	}
	
	public ScoreVO readScore(String hak) {
		
		ScoreVO vo =null;
		
		for(ScoreVO temp : vector) {
			
			if(temp.getHak().equals(hak)) {
				
				vo = temp;
				break;
				
			}
			
		}
		
		return vo;
		
	}

	@Override
	public void listAll() {
		
		System.out.println("��ü ����Ʈ ���....");
		Iterator<ScoreVO> it = vector.iterator();
		
		while(it.hasNext()) {
			
			ScoreVO vo = it.next();
			
			System.out.println(vo);
			
		}
		
		System.out.println("����� �����ϴ�.");

	}

	@Override
	public void searchHak() {

		System.out.println("�й��˻�");
		String hak;
		System.out.println("�˻��� �й� �Է�: ");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if(vo != null) {
			
			System.out.println(vo);
			
		}else {
			
			System.out.println("�������� �ʴ� �й��Դϴ�.");
	
		}
		
	}

	@Override
	public void searchName() {
		
		System.out.println("�̸��˻� ... ");
		String name;
		System.out.println("�˻��� �̸� �Է�");
		name = sc.next();
		
		for (ScoreVO vo : vector) {
			
			if(vo.getName().startsWith(name)) {
				
				System.out.println(vo);
				return;
				
			}
			
		}
		
		System.out.println("�������� �ʴ� �̸��Դϴ�.");
		
	}

	@Override
	public void update() {

		System.out.println("�ڷ����....");
		System.out.println("������ �й� �Է�: ");
		String hak = sc.next();
		ScoreVO vo = readScore(hak);
		
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
