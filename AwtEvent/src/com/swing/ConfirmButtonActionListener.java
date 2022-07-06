package com.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConfirmButtonActionListener implements ActionListener {

	JTextField text;
	JLabel label;

	public ConfirmButtonActionListener(JTextField text, 	JLabel label) {
	
		this.text = text;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String name = text.getText();
		label.setText("hello"+name);
		
	}

}
