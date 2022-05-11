package com.study;

public class Array05Ex {

	public static void main(String[] args) {

		//정수 45개 값을 저장 배열 생성
		int[] lot = new int[45];
		for(int i = 0; i<lot.length; i++) {
			lot[i] = i+1;
		}
		
		int temp = 0;
		int j = 0;
		
		for(int i = 0; i<6;i++) {
			j = (int)(Math.random()*45)+1;
		
			temp = lot[i];
			lot[i] = lot[j];
			lot[j] = temp;
			System.out.println("lot["+i+"]는 "+lot[i]);
		}
		
	}

}
