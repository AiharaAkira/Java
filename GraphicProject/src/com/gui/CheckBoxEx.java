package com.gui;

import java.awt.*;


public class CheckBoxEx extends Frame {

	private Label lb = new Label("�����ϴ� ����??");
	private Button bt = new Button("Ȯ��");
	private Checkbox[] cb = {
			new Checkbox("�ٳ���"),
			new Checkbox("���"),
			new Checkbox("����",true),
			new Checkbox("���ξ���")
	};
	
	
	public CheckBoxEx() {

		super("üũ�ڽ�");

		setLayout(new GridLayout(6, 1));
		
		add(lb);
		add(bt);

		for(int i = 0; i < 4; i++) {
			add(cb[i]);
		}
		

		// �⺻
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
