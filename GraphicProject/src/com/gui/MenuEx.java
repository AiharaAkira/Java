package com.gui;

import java.awt.*;
import java.awt.Frame;
import java.awt.GridLayout;


public class MenuEx extends Frame {

	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("����");
	private Menu edit = new Menu("����");
	private Menu view = new Menu("����");
	private Menu help = new Menu("����");
	
	private MenuItem fnew = new MenuItem("������");
	private MenuItem fopen = new MenuItem("���� ����");
	private MenuItem fsave = new MenuItem("��������");
	private MenuItem fsaveas = new MenuItem("�ٸ� �̸����� ����");
	private MenuItem exit = new MenuItem("������");
	
	private Menu ecolor = new  Menu("����");
	private Menu size = new  Menu("ũ��");
	
	
	private CheckboxMenuItem ecred = new CheckboxMenuItem("����");
	private CheckboxMenuItem ecgreen = new CheckboxMenuItem("�ʷ�");
	private CheckboxMenuItem ecblue = new CheckboxMenuItem("�Ķ�");

	private CheckboxMenuItem es10 = new CheckboxMenuItem("10");
	private CheckboxMenuItem es20 = new CheckboxMenuItem("20");
	private CheckboxMenuItem es30 = new CheckboxMenuItem("30");
	
	public MenuEx() {
		super("�޴� �׽�Ʈ");

		
		
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
		add("North", new Label("�����ϼ̽��ϴ�.", Label.CENTER));
		add("Center", new TextArea());
		
		Panel p = new Panel(new GridLayout(1,2));
		p.add(new Button("Ȯ��"));
		p.add(new Button("���"));
	
		add("South", p);
		
		
		
		
		// �⺻
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
