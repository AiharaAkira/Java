package com.fin.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelpUi extends JFrame implements ActionListener,MouseListener{

	private JFrame frame = new JFrame(" Help Your Problems ");
	
	private JPanel panel = new JPanel();
	private JPanel panelSouth = new JPanel();
	
	private JLabel helpLabel = new JLabel("Financial Account Book for all people.");
	private JLabel helpLabel1 = new JLabel("Version: Financial Account Book Service Release 1.1");
	private JLabel helpLabel2 = new JLabel("(c) Copyright yhk, and others, 2013.05.");
	private JLabel helpLabel3 = new JLabel("All rights reserved");
	
	private JButton btn = new JButton("OK");
	
	public HelpUi() {
		helpLabel.setHorizontalAlignment(JLabel.CENTER);
		helpLabel1.setHorizontalAlignment(JLabel.CENTER);
		helpLabel2.setHorizontalAlignment(JLabel.CENTER);
		helpLabel3.setHorizontalAlignment(JLabel.CENTER);
	
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(helpLabel);
		panel.add(helpLabel1);
		panel.add(helpLabel2);
		panel.add(helpLabel3);
		btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               frame.dispose();
            }
        });
		panelSouth.add(btn, BorderLayout.CENTER);


		frame.add(panel,BorderLayout.CENTER);
		frame.add(panelSouth, BorderLayout.SOUTH);
		frame.pack();
		frame.setBounds(2, 2, 300, 150);
		dispose();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new HelpUi();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			dispose();
			setVisible(false);
		}


	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
