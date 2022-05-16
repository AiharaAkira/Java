package com.study;

public class AccountEx {

	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setMoney(10000, "124");
		
		int myPay = a.getMoney();
		
		System.out.println(myPay);
		
	}

}
