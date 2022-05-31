package com.inherex;

class  OverridingParent2{
	int money = 20;
	
	public void parentMethod() {
		System.out.println("parent Method...");
	}
}

class  OverridingChild2 extends OverridingParent2{
	String money  = "20¿ø";
	
	@Override
	public void parentMethod() {
		System.out.println("child Method...");
	}
}

public class OverridingTest2 {

	public static void main(String[] args) {

		OverridingChild2 oc2 = new OverridingChild2();
		
		
	}

}
