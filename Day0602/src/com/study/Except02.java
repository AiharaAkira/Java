package com.study;

public class Except02 {

	public static void main(String[] args) {
		
		//throw new Exception
		
		//throw : ���ܸ� ������ �߻���Ŵ
		//throw new �߻���ų ���ܰ�ü�� ������
		
		
		System.out.println("1");
		System.out.println("2");
		
		try {
			
			System.out.println("3");
			System.out.println(0 / 0);
			System.out.println("4");
			
		} catch (Exception e) {
			
			System.out.println("5");
			
		}
		
		System.out.println("6");
		
	}

}
