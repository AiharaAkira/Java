package com.gui;

import java.awt.Frame;
import java.awt.TextField;


import java.awt.*;

public class ChoiEx extends Frame{

	private Label la = new Label("생일");
	private Button bt = new Button("확인");
	private Choice co = new Choice();
	
	public ChoiEx() {

		super("Choi");
		
		setLayout(new GridLayout(3,1));

		
		add(la);
		
		
		for(int i = 1; i<=12; i++) {
			co.add(String.valueOf(i)+"월");
		}
		
		add(co);
		add(bt);
		
		// 기본
		WinEvent we = new WinEvent();
		addWindowListener(we);
		// pack();
		setSize(300, 200);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {

		new ChoiEx();
		
	}

}
