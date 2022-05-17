package com.study;

public class TvTest02 {
	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1채널:"+t1.channel);
		System.out.println("t2채널:"+t2.channel);
		
		System.out.println("---------------------------------");
		t2 = t1;
		//t1이 저장하고 있는 주소값을 t2에 저장
		
		t1.channel = 7;
		System.out.println("t1채널:"+t1.channel);
		System.out.println("t2채널:"+t2.channel);
		//t1이 저장하고 있는 주소값을 t2에 저장
		
	}
}
