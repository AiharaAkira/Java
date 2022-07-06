package com.combobox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ComboBoxEx extends JFrame{

	public ComboBoxEx() {
		
		super("ComboBox");

		setLayout(new FlowLayout());
		
		String[] citems = {"One", "Two", "Three", "Four", "Five"};
		
		JComboBox<String> combo = new  JComboBox<>(citems);
		add(combo);
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,200,300,100);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new ComboBoxEx();
	}

}
