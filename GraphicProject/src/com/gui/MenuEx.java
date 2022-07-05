package com.gui;

import java.awt.*;
import java.awt.Frame;
import java.awt.GridLayout;


public class MenuEx extends Frame {

	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("파일");
	private Menu edit = new Menu("도구");
	private Menu view = new Menu("보기");
	private Menu help = new Menu("도움말");
	
	private MenuItem fnew = new MenuItem("새파일");
	private MenuItem fopen = new MenuItem("파일 열기");
	private MenuItem fsave = new MenuItem("파일저장");
	private MenuItem fsaveas = new MenuItem("다른 이름으로 저장");
	private MenuItem exit = new MenuItem("나가기");
	
	private Menu ecolor = new  Menu("색상");
	private Menu size = new  Menu("크기");
	
	
	private CheckboxMenuItem ecred = new CheckboxMenuItem("빨강");
	private CheckboxMenuItem ecgreen = new CheckboxMenuItem("초록");
	private CheckboxMenuItem ecblue = new CheckboxMenuItem("파랑");

	private CheckboxMenuItem es10 = new CheckboxMenuItem("10");
	private CheckboxMenuItem es20 = new CheckboxMenuItem("20");
	private CheckboxMenuItem es30 = new CheckboxMenuItem("30");
	
	public MenuEx() {
		super("메뉴 테스트");

		
		
		setMenuBar(mb);
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(help);
		
		ecolor.add(ecred);
		ecolor.add(ecgreen);
		ecolor.add(ecblue);
		
		size.add(es10);
		size.add(es20);
		size.add(es30);

		edit.add(ecolor);
		edit.add(size);
		edit.addSeparator();
		
		
		file.add(fnew);
		file.addSeparator();
		file.add(fopen);
		file.add(fsave);
		file.add(fsaveas);
		file.add(exit);
		
		setLayout(new GridLayout(4, 1));
		add("North", new Label("수고하셨습니다.", Label.CENTER));
		add("Center", new TextArea());
		
		Panel p = new Panel(new GridLayout(1,2));
		p.add(new Button("확인"));
		p.add(new Button("취소"));
	
		add("South", p);
		
		
		
		
		// 기본
		WinEvent we = new WinEvent();
		addWindowListener(we);
		// pack();
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new MenuEx();

	}

}
