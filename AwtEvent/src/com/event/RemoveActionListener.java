package com.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;


public class RemoveActionListener extends JFrame implements ActionListener{

	JTable  table;
	
	public RemoveActionListener(JTable  table) {

	this.table = table;
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		int row = table.getSelectedRow();
		
		if(row == -1) {
			return;
		}
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.removeRow(row);
		
		
	}

}
