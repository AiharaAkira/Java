package com.gui;

import java.awt.*;

public class FrameEx01 {

	public static void main(String[] args) {

		//������ ��ü ����
		Frame frame = new Frame();
		WinEvent we = new WinEvent();
		
		frame.addWindowListener(we);
		frame.setSize(300,200);
		frame.setVisible(true);
		
		
	}

}
