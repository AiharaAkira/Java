package com.study;

public class WhileExam05 {

	public static void main(String[] args) {

		/*-50에서 1까지의 수를 출력하는 프로그램
		 * 단, 한줄에 5개씩만 출력하시고 이 수들 탭 간격으로 띄우시오.
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
