package com.methodex;

/*
 * ���� ���� ȣ��(call by value)
 * �޼ҵ� ȣ��� �⺻ �ڷ����� ���� ����(�Ű�����)�� �����ϴ� ���
 *   
 */

public class ValueParameter {

	public int increase(int n) {
		return n++;
	}
	
	public static void main(String[] args) {

		int value = 100;
		
		ValueParameter v = new ValueParameter();
		
		System.out.println(v.increase(value));
		
		
		
	}

}
