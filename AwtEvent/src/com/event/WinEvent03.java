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
		
		JFrame frame = new JFrame("������ ��� ���α׷�");		

		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(300,200));

		Container contentPane =  frame.getContentPane();
		
		String colNames[]= {"�̸�", "����", "����"};
		
		Object data[][] = {
				
				{"�̸�1", "����1", "����1"},
				{"�̸�2", "����2", "����2"},
				{"�̸�3", "����3", "����3"}
				
		};
		
		
		JTable  table = new JTable(m);
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);
		
		JButton button1 = new JButton("�߰�");
		JButton button2 = new JButton("����");
		
		panel.add(new JLabel("�̸�"));
		panel.add(text1);
		panel.add(new JLabel("����"));
		panel.add(text2);
		panel.add(new JLabel("����"));
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
