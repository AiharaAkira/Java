package com.mouse;

public class RFMouse extends Mouse implements IRF{

	@Override
	void move() {
		System.out.println("���콺 ������");
	}
	
	@Override
	void scroll() {
		System.out.println("���콺 ��ũ�� ����");
	}
	
	@Override
	public void wconnect() {
		
		System.out.println("������� : �������");
		System.out.println("���콺 ���� �����");
	}
	
	 @Override
	public void wdisconnect() {
		System.out.println("���콺 ���� ���� ����");
	}
}
