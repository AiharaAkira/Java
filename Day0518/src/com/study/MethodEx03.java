package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*�������� ���
 * 
 * 1.�ִ��, 2. ������ �հ�,3.����4.����
 * */


public class MethodEx03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			
			System.out.println("1.�ִ��, 2. ������ �հ�,3.����4.����");
			int x = Integer.parseInt(br.readLine()) ; //�޴��� �Է� ���� ����
			
			if(x==1) {
				
				//call by Value
				System.out.println("�ִ�: "+MathRuller.getMax());
			}else if(x==2) {
				
				MathRuller.lineAdd(1, 10);//call by Name
				
				
			}else if(x==3) {
				System.out.println("�����Ǽ�:");
				int i = Integer.parseInt(br.readLine()) ;
				System.out.println("�����Ǽ�:");
				int j = Integer.parseInt(br.readLine()) ;
				System.out.println("�����Ǽ�:");
				int k = Integer.parseInt(br.readLine()) ;
				
				for (int arr : MathRuller.getSequence(i,j,k)) {
					int a = i++;
					System.out.print(a+"��° �ǰ�: "+arr+"\t");
				}
				System.out.println();
				
			}else if(x==4) {
				
				System.out.println("����~~");
				break;
				
			}else {
				
				System.out.println("1~4������ ���� �Է��� �ּ���.");
				continue;
				
			}
			
		}
		
	}
	
}
