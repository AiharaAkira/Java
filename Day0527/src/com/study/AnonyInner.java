package com.study;

/*
 * Anonymous(�͸�) �̳� Ŭ����
 * 
 * -�͸��̶�?
 * �̸��� ���� ���� �ǹ���
 * �ڹ��� ���α׷����� �ؼ��� ��� Ŭ������ �̸��� ����.
 * 
 * event�� ������ ����
 * interface ������ �ʿ����
 * �Ϲ� �޼ҵ� ���ο��� ���Ǻθ� ���� �� ����
 * abstract �� ��� ���� �� ����
 * �������̽��� ��ӹ޾� ������ ���� �� ���� ������
 * 
 * */


abstract class AbsExam{
	int data = 10000;
	public abstract void printData();
}


public class AnonyInner {
	
		AbsExam ae = new AbsExam() {
	
		@Override
		public void printData() {

			System.out.println("�߻�Ŭ�����θ����");
			
		}
		
	};
	
	public static void main(String[] args) {

		AnonyInner ai = new AnonyInner();
		ai.ae.printData();
		
		
		
	}

}
