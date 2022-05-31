package com.inherex;

class OverridingParent {
	void parentMethod() {
		System.out.println("parent Method!");
	}
}

class OverridingChild extends OverridingParent {

	@Override
	void parentMethod() {
		System.out.println("child Method!");
	}

}

/*
 * 
 * �������̵��� ������ �� �ִ� ��Ģ
 * 1.�θ�Ŭ������ �ڽ� Ŭ���� ���̿����� �����Ѵ�.
 * 2.static�޼ҵ�� Ŭ������ ���ϴ� �޼ҵ��̱� ������ ��� ��ü�� �ȵȴ�.
 * ����, �������̵� �� �� ����.
 * 3.���� �����ڰ� private�� ���ǵ� �޼ҵ�� �����ü�� ���� ����
 * 4.�������̽��� �����ؼ� �޼ҵ带 �������̵� �Ҷ��� �ݵ�� ���� �����ڸ� public����
 * ���� �ؾ��Ѵ�.
 * 5.�޼ҵ� ������ ������ Ÿ���� ���� ��ġ�ؾ��ϰ� ����Ÿ�Ա��� ��ġ�ؾ��Ѵ�.
 * 6.�θ�Ŭ������ �޼ҵ��� ���� �����ں��� �� ������ �� ����.
 * 7.�θ��� Ŭ�������� �� ���� ���ܸ� ���� �� ����.
 * 8.final���� ������ �޼ҵ�� �������̵� �� �� ����.
 * 
 * 
 * */

public class OverridingTest {

	public static void main(String[] args) {

		OverridingChild oc = new OverridingChild();
		
		oc.parentMethod();
		
	}

}
