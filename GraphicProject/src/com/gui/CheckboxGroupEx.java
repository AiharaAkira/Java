package com.gui;

import java.awt.*;


public class CheckboxGroupEx extends Frame{

	
	private Label la = new Label("����� ������?");
	CheckboxGroup cg = new CheckboxGroup();
	
	Checkbox man = new Checkbox("����", cg, true);
	Checkbox woman = new Checkbox("����", cg, false);
	Button bt = new Button("Ȯ��");
	
	public CheckboxGroupEx() {

		super("üũ�ڽ��׷�");

		
		setLayout(new GridLayout(4, 1));

		add(la);
		add(man);
		add(woman);
		add(bt);
		
		
		// �⺻
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
