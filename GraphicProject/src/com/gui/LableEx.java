package com.gui;

import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Color;

public class LableEx extends Frame {

	Label la1;
	Label la2;
	Label la3;
	Label la4;

	Font f1;
	Font f2;

	public LableEx() {
		super("label");

		la1 = new Label("hi1");
		la2 = new Label("hi2", Label.CENTER);
		la3 = new Label("hi3", Label.RIGHT);
		la4 = new Label("hi4");

		f1 = new Font("굴림체", Font.BOLD, 20);
		f2 = new Font("바탕체", Font.ITALIC, 25);

		// 레이아웃 설정
		setLayout(new GridLayout(4, 1));
		add(la1);
		add(la2);
		add(la3);
		add(la4);

		la1.setBackground(Color.red);
		la2.setBackground(Color.red);
		la3.setBackground(Color.red);
		la4.setBackground(Color.red);

		// 폰트지정
		la1.setFont(f1);
		la2.setFont(f2);
		la3.setFont(f2);
		la4.setFont(f2);

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new LableEx();

	}

}
