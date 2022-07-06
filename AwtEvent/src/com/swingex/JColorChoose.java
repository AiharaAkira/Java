package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class JColorChoose extends JFrame implements ActionListener {

	
	JMenuBar mb = new JMenuBar();
	JMenu mnuselect = new JMenu("선택");
	JMenuItem mnucolor = new JMenuItem("색상");
	JLabel l= new JLabel("출력창");
	JTextArea ta = new JTextArea();
	

	public JColorChoose() {

		
	super("JColorChoose");	
	mnuselect.add(mnucolor);
	mb.add(mnuselect);
	setJMenuBar(mb);
	
	add("North", l);
	add("Center", ta);
	
		
		
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setBounds(300,200,300,400);
	setVisible(true);
	mnucolor.addActionListener(this);
	
	
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == mnucolor) {
			JColorChooser chooser = new JColorChooser();
			Color col = chooser.showDialog(this,"색상을 고르세요", Color.blue);
			l.setText("선택한 색상은" + col);
			ta.setBackground(col);
		}
		
	}
	

	public static void main(String[] args) {
		new JColorChoose();
	}

}
