package com.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
	}

	// 글을 리스트에 추가

	public void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// 글쓰기

	public void writeArticle(Scanner sc) {

		System.out.println("게시판 글을 작성 하세요.");

		System.out.println("작성자");
		String register = sc.next();
		System.out.println("이메일");
		String email = sc.next();
		System.out.println("비밀번호");
		String passwd = sc.next();
		System.out.println("제목");
		String title = sc.next();
		System.out.println("글내용");
		String content = sc.next();

		BoardVO boardVO = new BoardVO(register, title, email, content, passwd);
		boardList.add(boardVO);
		System.out.println("등록성공");
		
	}

	// 목록보기

	public void getAllArticle() {

		if(boardList.size() > 0) {
			System.out.print("제목\t");
			System.out.print("이메일\t");
			System.out.print("비밀번호\t");
			System.out.print("유저\t");
			System.out.print("내용\t");
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
			System.out.println("글이 존재하지 않습니다.");
		}
		
		
	}

	// 글삭제

	public void deleteArticle() {

		System.out.println("-----게시글 삭제----");
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디:");
		String register = sc.next();
		System.out.println("비번:");
		String passwd = sc.next();
		
		BoardVO boardVO = getArticle(register, passwd);
		
		if(boardVO == null) {
			System.out.println("아이디 혹은 비밀번호를 확인해주세요.");
		}else {
			boardList.remove(boardVO);
			System.out.println("삭제성공!");
		}
		
		
		
	}
	
	
	public void removeArticle() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("작성자는?");
		String register = sc.next();
		System.out.println("비밀번호는?");
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
				//인덱스가 없는 경우
				System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
			
				return;
			}
			
		}
		
	}
	
	
	//글 얻기
	
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
