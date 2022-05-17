package com.study;

public class TvTest03 {

	public static void main(String[] args) {

		Tv[] tv; //객체 배열 선언
		int[] arr;
		
		tv = new Tv[5];
		
		for(int i = 0; i < tv.length; i++) {
			
			tv[i] = new Tv();
			tv[i].channel = i+10; //tv[i]의 채널에 i + 10을 저장
//			System.out.print("값: "+tv[i].channel+"\t\n");
		}
		
		
	for(int i = 0; i < tv.length; i++) {

			tv[i].channelUp();
			System.out.print("tv["+i+"]"+"값: "+tv[i].channel+"\t\n");
		
		}
		
		
		
	}

}
