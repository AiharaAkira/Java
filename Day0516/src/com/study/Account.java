package com.study;

public class Account {
	
	private int money;
	
	public Account() {
	}
	
	public Account(int money) {
		super();
		this.money = money;
	}



	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money, String pass) {
		
		if(pass.equals("1234") ) {
			
			this.money = money;
			
		}else {
			System.out.println("잘못된 접근입니다.");
		}
		
	}
	
	
	
}
