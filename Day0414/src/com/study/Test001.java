package com.study;

public class Test001 {

	public static void main(String[] args) {

		/* 
		 * ����ȯ
		 * ������ ����ȯ(�ڵ�����ȯ)
		 * -��ū �ڷ������� ��ȯ(�ڵ�)
		 * -���� �ս� ����
		 * 
		 * ex)short a,b;
		 * a=b=10;
		 * int c = a+b;
		 * 
		 * 
		 * ���������ȯ(��������ȯ)
		 * -�������ڷ������κ�ȯ(���)
		 * -������ �ս� ���ɼ��� ����
		 * 
		 * ex)int c = 0;
		 * short s = 10;
		 * s = (short)(c+s);
		 * boolean ���� �� ��ȯ �Ұ�
		 * byte : char�� casting��
		 * 16byte 
		 * long : float�� �ڵ����� �Ǽ���ó����(�Ǽ����� ���������� Ŀ��)
		 * 
		 * 
		 *  */
		
		//����ȯ�̶�:���� �Ǵ� ��� Ÿ���� �ٸ� Ÿ������ ��ȯ�ϰ��� �Ҷ�
		//��ȯ ���: (�ڷ���)(������)
		double d = 97.64;
		int score = (int)d;
		System.out.println(score);
		
		int i = 10;
		byte b = (byte) i;
		
		i=500;
		b = (byte) i;
		
		
		
		
	}

}
