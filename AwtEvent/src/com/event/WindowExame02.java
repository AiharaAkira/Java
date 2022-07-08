package com.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class WindowExame02 extends JFrame implements ActionListener{

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("참가자 명단 프로그래");		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,200));

		Container contentPane = frame.getContentPane();
		
		String colNames[]= {"이름", "나이", "성별"};
		
		Object data[][] = {
				
				{"이름1", "나이1", "성별1"},
				{"이름2", "나이2", "성별2"},
				{"이름3", "나이3", "성별3"}
				
		};
		
		JTable table = new JTable(data, colNames);
		JScrollPane scrollpane = new JScrollPane(table);
		
		contentPane.add(scrollpane, BorderLayout.CENTER);
		JButton button = new JButton("출력");
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
