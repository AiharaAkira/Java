package com.study;

public class TvTest02 {
	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1ä��:"+t1.channel);
		System.out.println("t2ä��:"+t2.channel);
		
		System.out.println("---------------------------------");
		t2 = t1;
		//t1�� �����ϰ� �ִ� �ּҰ��� t2�� ����
		
		t1.channel = 7;
		System.out.println("t1ä��:"+t1.channel);
		System.out.println("t2ä��:"+t2.channel);
		//t1�� �����ϰ� �ִ� �ּҰ��� t2�� ����
		
	}
}
