package com.study;

public class TvTest03 {

	public static void main(String[] args) {

		Tv[] tv; //��ü �迭 ����
		int[] arr;
		
		tv = new Tv[5];
		
		for(int i = 0; i < tv.length; i++) {
			
			tv[i] = new Tv();
			tv[i].channel = i+10; //tv[i]�� ä�ο� i + 10�� ����
//			System.out.print("��: "+tv[i].channel+"\t\n");
		}
		
		
	for(int i = 0; i < tv.length; i++) {

			tv[i].channelUp();
			System.out.print("tv["+i+"]"+"��: "+tv[i].channel+"\t\n");
		
		}
		
		
		
	}

}
