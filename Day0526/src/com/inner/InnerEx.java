package com.inner;

public class InnerEx {

	public static void main(String[] args) {
		
		//���� Ŭ������ ��� ������ �����Ϸ��� ���� �ܺ�Ŭ������ ��ü�� ����
		OuterEx oe = new OuterEx();
		
		//�ܺ� Ŭ������ ���ؼ� ����Ŭ������ ��ü�� ����
		OuterEx.InnerEx oi = oe.new InnerEx();
		
		System.out.println("oi.s: "+oi.s);
		
		
		
		
	}	
}
