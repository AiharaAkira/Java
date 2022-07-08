package com.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class WinEvent03 extends JFrame implements ActionListener{
	JTable table;
	TableModel m = table.getModel();
	
	int rowNum = m.getRowCount();
	int colNum = m.getColumnCount();
	
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("참가자 명단 프로그래");		

		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(300,200));

		Container contentPane =  frame.getContentPane();
		
		String colNames[]= {"이름", "나이", "성별"};
		
		Object data[][] = {
				
				{"이름1", "나이1", "성별1"},
				{"이름2", "나이2", "성별2"},
				{"이름3", "나이3", "성별3"}
				
		};
		
		
		JTable  table = new JTable(m);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);
		
		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("삭제");
		
		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("나이"));
		panel.add(text2);
		panel.add(new JLabel("성별"));
		panel.add(text3);
		
		panel.add(button1);
		panel.add(button2);

		contentPane.add(panel, BorderLayout.SOUTH);
		
		button1.addActionListener( new AddActionListener(table, text1, text2, text3)    );
		button2.addActionListener( new RemoveActionListener(table)    );
		
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO
		
	}

}
