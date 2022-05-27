package com.study;

/*
 * LocalInner class
 * 
 * -Ŭ���� ���ο� Ư�� �޼ҵ�ȿ� ���ǵǴ� Ŭ������.
 * -���������� ���� ���̴�.
 * �޼ҵ尡 ȣ��ɶ� ������ �� ������ �޼ҵ��� ������� 
 * �������� ������ ���������� ���� �ڵ����� �Ҹ�ȴ�.
 *  
 * ##�� ��������� �ʴ´�.
 * -�޼ҵ� ���ο� class�� ����, �޼ҵ� ����ÿ��� �����.
 * 
 * class Outer{
 * 
 * 		public void aa(){//Ŭ������ ��� �޼ҵ�
 * 		
 * 			class Inner{//�޼ҵ�ȿ� ���������� ���� ���� ��ġ
 * 				
 * 			}
 * 
 * 		}
 * }
 *  
 * */

public class LocalInner {

	int a = 100;// �ܺ�Ŭ������ ��� ����

	public void innerExam01(int k) {
		// ��� �޼ҵ�

		int b = 200;// ��������(�޼ҵ� �������� ���ܳ�)
		final int C = k;// ���

		class Inner {
			// ���� �̳� Ŭ������ �ܺ� Ŭ������ ��� ������ ���� ��ġ
			// �� �����ϸ�, ��� ������ ����鸸 ������ �����ϴ�.

			public void getData() {
				
				System.out.println("int a:"+a);
				System.out.println("int b:"+b);
				System.out.println("final int C:"+C);
				
			}

		}// end inner class

		
		//�޼ҵ� ������ ���� �̳� Ŭ������ ��ü ������ �����ϴ�.
		Inner i = new Inner();
		//������ ��ü�� ���ؼ� �޼ҵ带 ȣ���Ѵ�.
		i.getData();
		
	}//end method

	public static void main(String[] args) {

		
		LocalInner li = new LocalInner();
		li.innerExam01(1000);
		
	}

}
