package com.study;

 class OuterEx01 {

	public static class InnerEx01 {
		
		static int x = 10;

	}
	
	
	public static void main(String[] args) {

		//public 없어서 터지는 거?
		
		OuterEx01.InnerEx01 oi = new OuterEx01.InnerEx01();
		System.out.println(oi.x);
	}
	

}
