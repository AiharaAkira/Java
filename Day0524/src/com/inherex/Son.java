package com.inherex;

public class Son extends ParentEx {

	/*
	 * ������
	 * �� Ÿ���� ���������� ���� Ÿ���� ��ü�� ���� �� �� �ֵ��� �ϴ� ���� �ǹ���
	 * �θ�Ŭ������ Ÿ���� ���������� �ڽ� Ŭ������ �ν��Ͻ��� ������ �� �ֵ��� ��.
	 * �θ� Ŭ���� = �ڽ�
	 * 
	 * ������ ����� ����
	 * Super super = new Super();
	 * */
	
	int foo = 1;
	
	@Override 
	public int getNumber(int a) {
		
		return a +2;
		
	}
	
	
	public static void main(String[] args) {
		
		ParentEx pe = new Son();
		
		System.out.println(pe.setNumber(0));
		System.out.println(pe.foo);
		
	}
	
}
