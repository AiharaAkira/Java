package com.fin.gui;

import java.awt.Button;
import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class MainUi extends JFrame {

	private Label income = new Label("수입");
	private Label income2 = new Label("수입");
	private Label  amount = new Label("금액");
	private Label  amount2 = new Label("금액");
	private Label  Memo = new Label("메모");
	private Label  Memo2 = new Label("메모");
	private Choice co = new Choice();
	private Choice co2 = new Choice();

	public MainUi() {

		// 타이틀
		setTitle("가게부");

		// 메뉴바
		JMenuBar mb = new JMenuBar();
		JMenu FuncMenu = new JMenu("기능");
		JMenu CalcMenu = new JMenu("계산기");
		JMenu HelpMenu = new JMenu("도움말");

		mb.add(FuncMenu);

		FuncMenu.add(new JMenuItem("저장하기(S)"));
		FuncMenu.add(new JMenuItem("불러오기(L)"));

		mb.add(CalcMenu);

		CalcMenu.add(new JMenuItem("실행하기(O)"));

		mb.add(HelpMenu);

		HelpMenu.add(new JMenuItem("정보(I)"));

		this.setJMenuBar(mb);

		// --------------------------
		// 이미지
		// 라벨 생성
		JLabel imgLabel = new JLabel();

		// 아이콘 생성
		ImageIcon icon = new ImageIcon(MainUi.class.getResource("img/1.jpg"));

		Image img = icon.getImage();
		Image updateImg = img.getScaledInstance(500, 300, Image.SCALE_SMOOTH);
		ImageIcon updateIcon = new ImageIcon(updateImg);

		// 라벨에 아이콘(이미지) 설정
		imgLabel.setIcon(updateIcon);

		// 라벨 설정(크기, 정렬...)
		imgLabel.setBounds(210, 30, 165, 150);
		imgLabel.setHorizontalAlignment(JLabel.LEFT);

		// 프레임에 컴포넌트 추가
		getContentPane().add(imgLabel);

		// --------------------------
		//수입 지출 메모
		
		//1줄
		setLayout(new GridLayout(18, 1));

		add(income);

		co.add("월급");
		co.add("용돈");

		add(co);

		add(amount);
		
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		
		add(text1);
		
		//2줄

		add(Memo);
		add(text2);
		
		//3줄

				add(income2);

				co2.add("교통비");
				co2.add("문화생활");
				co2.add("식비");

				add(co2);

				add(amount2);
				
				JTextField text3 = new JTextField();
				
				add(text3);
				
				//4줄
				JTextField text4 = new JTextField();
				add(Memo2);
				add(text4);
				
				
				//-------------------------------
				//버튼
				Button bt1 = new Button("INCOME"); 
				Button bt2 = new Button("INCOME"); 
				
				add(bt1);
				add(bt2);
				
				JTextField BigText1 = new JTextField();
				JTextField BigText2 = new JTextField();
				add(BigText1);
				add(BigText2);
				
				
				int balanceInt = 0;
				JLabel balance = new JLabel("현재잔액: "+balanceInt + "원");
				add(balance);
				
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(1000, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainUi();
	}

}
