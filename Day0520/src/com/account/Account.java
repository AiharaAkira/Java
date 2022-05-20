package com.account;

public class Account {

	private String name;
	private int money;

	public Account() {
	}

	public Account(String name) {
		this.name = name;
	}

	public Account(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금
	public void deposit(long amount) {

		money += amount;
		
	}

	// 출금
	public void withdrawal(long amount) {
		
		if(money < amount) {
			System.out.println("잔액이 부족합니다.");
		}else {
			
			money -= amount;
		}
		
		
	}

}
