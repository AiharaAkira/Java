package com.study;

import java.util.Scanner;

public class Except03 {

	public static void main(String[] args) {
		
		//throw new Exception
		
		//throw : ���ܸ� ������ �߻���Ŵ
		//throw new �߻���ų ���ܰ�ü�� ������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1");
		System.out.println("2");
		
		try {
			
			System.out.println("3");
			//System.out.println(0 / 0);
			String s = sc.next();
			System.out.println("4");
			
		} catch (ArithmeticException ae) {
			
			if(ae instanceof ArithmeticException) {
				
				System.out.println("true");
				
			}else {

				System.out.println("ArithmeticException");
				
			}
			
			
			
		}catch (NullPointerException ne) {
			
			if(ne instanceof NullPointerException) {
				
				System.out.println("true");
				
			}else {

				System.out.println("NullPointerException");
				
			}
			
			
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			System.out.println("5");
			System.out.println("6");
		}
		
		
	}

}
