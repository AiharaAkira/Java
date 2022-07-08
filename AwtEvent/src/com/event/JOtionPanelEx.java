package com.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class JOtionPanelEx extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == b1) {
		JOptionPane.showMessageDialog(this, "메시지 다이얼로그 박스", "메시지", JOptionPane.INFORMATION_MESSAGE);
	}else if(e.getSource() == b2) {
		JOptionPane.showConfirmDialog(this, "확인 다이얼로그 박스", "확인", JOptionPane.YES_NO_CANCEL_OPTION);
		
	}else if(e.getSource() == b3) {
		JOptionPane.showInputDialog(this, "입력 다이얼로그 박스", "입력",  JOptionPane.YES_NO_OPTION);
		
	}else if(e.getSource() == b4) {
		JOptionPane.showOptionDialog(this,"옵션 다이얼로그 박스" ,"옵션", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE,null,str,0);
		
	}
		
	}
	
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	String[] str = {"로그인", "회원가입"};
	
	public JOtionPanelEx() {
		
		
		super("option");
		setLayout(new FlowLayout());
		
		b1 = new JButton("MessageDialog");
		b2 = new JButton("ConfirmDialog");
		b3 = new JButton("InputDialog");
		b4 = new JButton("OptionDialog");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(300,300);
		pack();
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new JOtionPanelEx();
	}
	
	

	
	
}
