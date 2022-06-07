package com.arrayex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImp implements Score {

	private Scanner sc = new Scanner(System.in);
	private List<StudentVO> list = new ArrayList<>();
	
	@Override
	public void delete() {

		System.out.println("---입력--- ");
		System.out.println("학번입력");
		String hak = sc.next();
		
		StudentVO vo = readScore(hak);
		
		if(vo == null) {
			
			System.out.println("등록 되지 않은 학번입니다.");
			
			return;
		}
		
		list.remove(vo);
		System.out.println("자료삭제 완료");
		
	}

	@Override
	public void intsert() {

		System.out.println("---입력--- ");
		System.out.println("학번입력");
		String hak = sc.next();
		
		StudentVO temp = readScore(hak);
		
		if(temp != null) {
			
			System.out.println("이미 등록된 학번 입니다.");
			
			return;
		}
		
		StudentVO vo = new StudentVO();
		vo.setHak(hak);
		System.out.println("이름?");
		vo.setName(sc.next());
		System.out.println("출생년도?");
		vo.setBirth(sc.next());
		System.out.println("영어점수?");
		vo.setEng(sc.nextInt());
		System.out.println("수학점수?");
		vo.setMat(sc.nextInt());
		System.out.println("국어점수?");
		vo.setKor(sc.nextInt());
			
		list.add(vo);
		System.out.println("자료등록 완료");
	
	}
	
	public StudentVO readScore(String hak) {
		
		StudentVO vo =null;
		
		for(StudentVO temp : list) {
			
			if(temp.getHak().equals(hak)) {
				
				vo = temp;
				break;
				
			}
			
		}
		
		return vo;
		
	}

	@Override
	public void listAll() {
		
		System.out.println("전체 리스트 출력....");
		Iterator<StudentVO> it = list.iterator();
		
		while(it.hasNext()) {
			
			StudentVO vo = it.next();
			
			System.out.println(vo);
			
		}
		
		System.out.println("목록이 없습니다.");

	}

	@Override
	public void searchHak() {

		System.out.println("학번검색");
		String hak;
		System.out.println("검색할 학번 입력: ");
		hak = sc.next();
		
		StudentVO vo = readScore(hak);
		
		if(vo != null) {
			
			System.out.println(vo);
			
		}else {
			
			System.out.println("존재하지 않는 학번입니다.");
	
		}
		
	}

	@Override
	public void searchName() {
		
		System.out.println("이름검색 ... ");
		String name;
		System.out.println("검색할 이름 입력");
		name = sc.next();
		
		for (StudentVO vo : list) {
			
			if(vo.getName().startsWith(name)) {
				
				System.out.println(vo);
				return;
				
			}
			
		}
		
		System.out.println("존재하지 않는 이름입니다.");
		
	}

	@Override
	public void update() {

		System.out.println("자료수정....");
		System.out.println("수정할 학번 입력: ");
		String hak = sc.next();
		StudentVO vo = readScore(hak);
		
		if(vo == null) {
			
			System.out.println("등록된 자료가 없습니다.");
			
			return;
			
		}
		
		System.out.println("이름?");
		vo.setName(sc.next());
		System.out.println("출생년도?");
		vo.setBirth(sc.next());
		System.out.println("영어점수?");
		vo.setEng(sc.nextInt());
		System.out.println("수학점수?");
		vo.setMat(sc.nextInt());
		System.out.println("국어점수?");
		vo.setKor(sc.nextInt());
		
		System.out.println("자료수정 완료");
		
	}
	
	

}
