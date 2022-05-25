package com.mouse;

public class RFMouse extends Mouse implements IRF{

	@Override
	void move() {
		System.out.println("마우스 움직임");
	}
	
	@Override
	void scroll() {
		System.out.println("마우스 스크롤 동작");
	}
	
	@Override
	public void wconnect() {
		
		System.out.println("무선방식 : 블루투스");
		System.out.println("마우스 무선 연결됨");
	}
	
	 @Override
	public void wdisconnect() {
		System.out.println("마우스 무선 연결 끊김");
	}
}
