package com.study;

import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowEvent extends JFrame{

	/*
	 * MemberMain : 실행클래스
	 * MemberVO: 회원정보를 저장하는 클래스
	 * Action:메소드를 정의한 인터페이스
	 * 목록, 회원등록, 삭제, 수정
	 * WriteAction:등록
	 * ListAction:목록
	 * DeleteAction:삭제
	 * UpdateAction:수정
	 * 
	 * 
	 * 
	 * */
	
	public WindowEvent() {
		super("이벤트");
		
		JButton j1 = new JButton("확인");
		JButton j2 = new JButton("확인");
	}

	class WinFventFx extends WindowAdapter{
		
	}
	
	
}
