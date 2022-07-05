package com.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;

public class ListEx extends Frame {

	private Label lb = new Label("인원 목록");
	private List li = new List(4, true);
	private Button bt = new Button("확인");
	private String[] name;

	public ListEx(String a[]) {

		super("List Test");

		 name = a;
		setLayout(new BorderLayout());

		for (int i = 0; i < name.length; i++) {
			li.add(name[i]);
		}

		add("North", lb);
		add("Center", li);
		add("South", bt);

		li.setFont(new Font("굴림체", Font.BOLD, 20));

		// 기본
		WinEvent we = new WinEvent();
		addWindowListener(we);
		 pack();
		//setSize(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ListEx(args);
	}

}
