package com.study;

import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowEvent extends JFrame{

	/*
	 * MemberMain : ����Ŭ����
	 * MemberVO: ȸ�������� �����ϴ� Ŭ����
	 * Action:�޼ҵ带 ������ �������̽�
	 * ���, ȸ�����, ����, ����
	 * WriteAction:���
	 * ListAction:���
	 * DeleteAction:����
	 * UpdateAction:����
	 * 
	 * 
	 * 
	 * */
	
	public WindowEvent() {
		super("�̺�Ʈ");
		
		JButton j1 = new JButton("Ȯ��");
		JButton j2 = new JButton("Ȯ��");
	}

	class WinFventFx extends WindowAdapter{
		
	}
	
	
}
