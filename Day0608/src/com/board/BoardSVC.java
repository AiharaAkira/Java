package com.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
	}

	// ���� ����Ʈ�� �߰�

	public void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// �۾���

	public void writeArticle(Scanner sc) {

		System.out.println("�Խ��� ���� �ۼ� �ϼ���.");

		System.out.println("�ۼ���");
		String register = sc.next();
		System.out.println("�̸���");
		String email = sc.next();
		System.out.println("��й�ȣ");
		String passwd = sc.next();
		System.out.println("����");
		String title = sc.next();
		System.out.println("�۳���");
		String content = sc.next();

		BoardVO boardVO = new BoardVO(register, title, email, content, passwd);
		boardList.add(boardVO);
		System.out.println("��ϼ���");
		
	}

	// ��Ϻ���

	public void getAllArticle() {

		if(boardList.size() > 0) {
			System.out.print("����\t");
			System.out.print("�̸���\t");
			System.out.print("��й�ȣ\t");
			System.out.print("����\t");
			System.out.print("����\t");
			System.out.println();
			
			for (BoardVO boardVO : boardList) {

				System.out.print(boardVO.getSubject() + "\t");
				System.out.print(boardVO.getEmail() + "\t");
				System.out.print(boardVO.getPasswd() + "\t");
				System.out.print(boardVO.getRegister() + "\t");
				System.out.print(boardVO.getContent() + "\t");
				System.out.println();

			}

			
		}else {
			System.out.println("���� �������� �ʽ��ϴ�.");
		}
		
		
	}

	// �ۻ���

	public void deleteArticle() {

		System.out.println("-----�Խñ� ����----");
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵�:");
		String register = sc.next();
		System.out.println("���:");
		String passwd = sc.next();
		
		BoardVO boardVO = getArticle(register, passwd);
		
		if(boardVO == null) {
			System.out.println("���̵� Ȥ�� ��й�ȣ�� Ȯ�����ּ���.");
		}else {
			boardList.remove(boardVO);
			System.out.println("��������!");
		}
		
		
		
	}
	
	
	public void removeArticle() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ۼ��ڴ�?");
		String register = sc.next();
		System.out.println("��й�ȣ��?");
		String passwd = sc.next();
		
		if(boardList.size()>0) {
			
			int index = -1;
			
			for(int i = 0; i< boardList.size(); i++) {
				
				if(boardList.get(i).getRegister().equals(register)) {
					
					if(boardList.get(i).getPasswd().equals(passwd)) {
						
						boardList.remove(i);
						
						index = i;
						
					}
					
					
					
				}
				
			}
			

			if(index == -1) {
				//�ε����� ���� ���
				System.out.println("�ش� �ۼ��ڰ� ���ų� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			
				return;
			}
			
		}
		
	}
	
	
	//�� ���
	
	public BoardVO getArticle(String register, String passwd) {
		
		BoardVO article = null;
		
		for (BoardVO boardVO : boardList) {
			
			
			
			if(boardVO.getSubject().equals(register)&&boardVO.getSubject().equals(register)) {
				
				article = boardVO;
				
			}
			
		}
		
		return article;
		
	}

}
