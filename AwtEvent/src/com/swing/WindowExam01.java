package com.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowExam01 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing Programming");
		//크기
		frame.setPreferredSize(new Dimension(300, 170));
		//위치
		frame.setLocation(600,500);
		Container contentPane = frame.getContentPane();
		JTextField text = new JTextField();
		JLabel label = new JLabel("Hello ");
		JButton button = new JButton("확인");
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
		
		ActionListener listener = new ConfirmButtonActionListener(text, label);
		
		button.addActionListener(listener);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
	
}
