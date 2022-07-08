package com.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class WindowExame02 extends JFrame implements ActionListener{

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("������ ��� ���α׷�");		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,200));

		Container contentPane = frame.getContentPane();
		
		String colNames[]= {"�̸�", "����", "����"};
		
		Object data[][] = {
				
				{"�̸�1", "����1", "����1"},
				{"�̸�2", "����2", "����2"},
				{"�̸�3", "����3", "����3"}
				
		};
		
		JTable table = new JTable(data, colNames);
		JScrollPane scrollpane = new JScrollPane(table);
		
		contentPane.add(scrollpane, BorderLayout.CENTER);
		JButton button = new JButton("���");
		contentPane.add(button, BorderLayout.SOUTH);
		button.addActionListener(new PrintActionListener(table));
		
		frame.setLocation(500,400);
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
