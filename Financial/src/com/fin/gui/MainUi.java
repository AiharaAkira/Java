package com.fin.gui;

import java.awt.Button;
import java.awt.Choice;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class MainUi extends JFrame {

	private Label income = new Label("����");
	private Label income2 = new Label("����");
	private Label  amount = new Label("�ݾ�");
	private Label  amount2 = new Label("�ݾ�");
	private Label  Memo = new Label("�޸�");
	private Label  Memo2 = new Label("�޸�");
	private Choice co = new Choice();
	private Choice co2 = new Choice();

	public MainUi() {

		// Ÿ��Ʋ
		setTitle("���Ժ�");

		// �޴���
		JMenuBar mb = new JMenuBar();
		JMenu FuncMenu = new JMenu("���");
		JMenu CalcMenu = new JMenu("����");
		JMenu HelpMenu = new JMenu("����");

		mb.add(FuncMenu);

		FuncMenu.add(new JMenuItem("�����ϱ�(S)"));
		FuncMenu.add(new JMenuItem("�ҷ�����(L)"));

		mb.add(CalcMenu);

		CalcMenu.add(new JMenuItem("�����ϱ�(O)"));

		mb.add(HelpMenu);

		HelpMenu.add(new JMenuItem("����(I)"));

		this.setJMenuBar(mb);

		// --------------------------
		// �̹���
		// �� ����
		JLabel imgLabel = new JLabel();

		// ������ ����
		ImageIcon icon = new ImageIcon(MainUi.class.getResource("img/1.jpg"));

		Image img = icon.getImage();
		Image updateImg = img.getScaledInstance(500, 300, Image.SCALE_SMOOTH);
		ImageIcon updateIcon = new ImageIcon(updateImg);

		// �󺧿� ������(�̹���) ����
		imgLabel.setIcon(updateIcon);

		// �� ����(ũ��, ����...)
		imgLabel.setBounds(210, 30, 165, 150);
		imgLabel.setHorizontalAlignment(JLabel.LEFT);

		// �����ӿ� ������Ʈ �߰�
		getContentPane().add(imgLabel);

		// --------------------------
		//���� ���� �޸�
		
		//1��
		setLayout(new GridLayout(18, 1));

		add(income);

		co.add("����");
		co.add("�뵷");

		add(co);

		add(amount);
		
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		
		add(text1);
		
		//2��

		add(Memo);
		add(text2);
		
		//3��

				add(income2);

				co2.add("�����");
				co2.add("��ȭ��Ȱ");
				co2.add("�ĺ�");

				add(co2);

				add(amount2);
				
				JTextField text3 = new JTextField();
				
				add(text3);
				
				//4��
				JTextField text4 = new JTextField();
				add(Memo2);
				add(text4);
				
				
				//-------------------------------
				//��ư
				Button bt1 = new Button("INCOME"); 
				Button bt2 = new Button("INCOME"); 
				
				add(bt1);
				add(bt2);
				
				JTextField BigText1 = new JTextField();
				JTextField BigText2 = new JTextField();
				add(BigText1);
				add(BigText2);
				
				
				int balanceInt = 0;
				JLabel balance = new JLabel("�����ܾ�: "+balanceInt + "��");
				add(balance);
				
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(1000, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainUi();
	}

}
