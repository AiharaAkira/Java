package com.mouse;

public class RFMain {

	public static void main(String[] args) {
		
		RFMouse rfm = new RFMouse();
		
		rfm.wconnect();
		rfm.move();
		rfm.scroll();
		rfm.wdisconnect();
		
		
	}

}
