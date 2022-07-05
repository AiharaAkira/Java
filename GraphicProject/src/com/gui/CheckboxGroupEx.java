package com.gui;

import java.awt.*;


public class CheckboxGroupEx extends Frame{

	
	private Label la = new Label("당신의 성별은?");
	CheckboxGroup cg = new CheckboxGroup();
	
	Checkbox man = new Checkbox("남성", cg, true);
	Checkbox woman = new Checkbox("여성", cg, false);
	Button bt = new Button("확인");
	
	public CheckboxGroupEx() {

		super("체크박스그룹");

		
		setLayout(new GridLayout(4, 1));

		add(la);
		add(man);
		add(woman);
		add(bt);
		
		
		// 기본
				WinEvent we = new WinEvent();
				addWindowListener(we);
				// pack();
				setSize(300, 200);
				setVisible(true);
		
	
	}
	
	public static void main(String[] args) {

		new CheckboxGroupEx();
		
	}

}
