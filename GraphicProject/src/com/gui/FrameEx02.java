package com.gui;

import java.awt.Frame;

public class FrameEx02 extends Frame{

	
	public FrameEx02() {

	super("«¡∑π¿”2");
	WinEvent we = new WinEvent();
	addWindowListener(we);
	setSize(300,200);
	setVisible(true);
	}
	

	public static void main(String[] args) {
		
		
		new FrameEx02();
		
		
	}
	
}
