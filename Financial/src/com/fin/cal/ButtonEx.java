package com.fin.cal;

import java.awt. Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JLabel;

import com.fin.gui.WinEvent;

public class ButtonEx extends Frame{

	
	 String[] str = {" "," ","←","CE","C","7","8","9","/","sqrt","4","5","6","*","%","3","2","1","-","1/x","0","+/-",".","+","="};
	 Button[] bt = new Button[str.length];

	
	public ButtonEx() {

		super("버튼");
		setLayout(new GridLayout(5,5,5,5));
		for(int i = 0; i<bt.length; i++) {
			bt[i] = new Button(str[i]);
			bt[i].setFont(new Font("굴림체", Font.BOLD, 30));
			add(bt[i]);
		}
		
		
		
		//기본
		WinEvent we = new WinEvent();
		addWindowListener(we);
		//pack();
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {

		
		new ButtonEx();
		
	}

}
