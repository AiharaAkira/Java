package com.study;

public class WhileExam05 {

	public static void main(String[] args) {

		/*-50���� 1������ ���� ����ϴ� ���α׷�
		 * ��, ���ٿ� 5������ ����Ͻð� �� ���� �� �������� ���ÿ�.
		 * */
		
		int i = -50;
		int cnt =1;
		
		
		while(i<2) {
			System.out.print(i+"\t");
			if(cnt == 5) {
				cnt =0;
				System.out.println();
			}
			cnt++;
			i++;
		}
		
	}

}
