package com.methodex;

public class Overloading01 {

	/*
	 * �޼ҵ� �����ε�
	 * 
	 * -������(�ϳ���)Ŭ�������� ���� �̸��� ���� �޼ҵ尡 ���� �� ���ǵǴ� ���� �ǹ���
	 * -���� �̸��� �޼ҵ忡 ����(�Ű�����)�� �ٸ� ���
	 * -���ڰ� �ٸ��ٴ� ���� ������ ������ �ٸ��ų�, �ڷ����� �ٸ��ų�, ������ ���� �ٸ����� �ǹ���
	 * -���� �������� ����� ������ �����ϴ� �޼ҵ� ���� ��� �̸��� ���� ����� �ϰ����� �����ϱ� ����
		
		���������� ��ȯ�� �޼ҵ��(�ڷ��� ����, �ڷ��� ����){ }
		
		1.���������ڿ� ��ȯ���� ��� ����.
	 	2.�޼ҵ� �̸��� ���ƾ���
	 	3.�ڷ����̳� ������ ������ �ݵ�� �ٸ��� �ؾ���
	 	
	 * */
	
	
	public static void intLength(int a) {
		String s = String.valueOf(a);
		System.out.println(s.length());
	}
	
	public static void intLength() {
		String s = String.valueOf(1111111111);
		System.out.println(s.length());
	}
	
	public static void main(String[] args) {
		
		intLength(10);
		intLength();
		
	}

}
