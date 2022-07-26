package com.fin.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OutPutUi extends JFrame implements ActionListener{
	
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	
	
	
	public OutPutUi() {
		frame.setBounds(100, 100, 500, 400); // 프레임의 크기 지정
		frame.dispose();
		frame.setVisible(true); // 프레임이 보이도록 설정
	
	}
	
	public static void main(String[] args) {
		new OutPutUi();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
