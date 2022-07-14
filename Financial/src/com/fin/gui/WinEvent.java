package com.fin.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEvent extends WindowAdapter{

	//close
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	
}
