package com.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.TableModel;

public class PrintActionListener extends JFrame implements ActionListener{

	JTable table;

	public PrintActionListener(JTable table) {
		this.table = table;
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		TableModel m = table.getModel();
		
		int rowNum = m.getRowCount();
		int colNum = m.getColumnCount();
		
		
		for(int col = 0; col < colNum; col++) {
			
			String colName = m.getColumnName(col);
			System.out.print(colName+"\t");
			
		}
		System.out.println();
		for(int row = 0; row < rowNum; row++) {
			for(int col = 0; col < colNum; col++) {
				
				Object obj = m.getValueAt(row, col);
				System.out.print(obj+"\t");
				
			}
			System.out.println();
		}
		
		
	}
	
	

	
	
}
