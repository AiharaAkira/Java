package com.gui;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.*;

public class TestEx extends Frame {

	
	private TextField tf = new TextField("제목");
	private TextArea ta = new TextArea("메모", 5, 10);
	
	private Button bt = new Button("확인");
	private Label la = new Label("내용");
	
	
	
	public TestEx() {
		super("TextField");

		setLayout(new BorderLayout());
		
		add("North", tf);
		add("South", bt);
		add("Center", ta);
		add("West", la);
		
		// 기본
		WinEvent we = new WinEvent();
		addWindowListener(we);
		// pack();
		setSize(300, 200);
		setVisible(true);

	}
	
	
	public static void main(String[] args) {
		new TestEx();
	}

}
