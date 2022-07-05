package com.gui;

import java.awt.*;


public class CheckBoxEx extends Frame {

	private Label lb = new Label("좋아하는 과일??");
	private Button bt = new Button("확인");
	private Checkbox[] cb = {
			new Checkbox("바나나"),
			new Checkbox("사과"),
			new Checkbox("딸기",true),
			new Checkbox("파인애플")
	};
	
	
	public CheckBoxEx() {

		super("체크박스");

		setLayout(new GridLayout(6, 1));
		
		add(lb);
		add(bt);

		for(int i = 0; i < 4; i++) {
			add(cb[i]);
		}
		

		// 기본
		WinEvent we = new WinEvent();
		addWindowListener(we);
		// pack();
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new CheckBoxEx();
	}

}
