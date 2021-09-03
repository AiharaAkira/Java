package com.javlec.bank;

public class Person {
	private String name;
	private int age;
	private int cashAmount;
	private BankAccount account;
	
	public Person(String name, int age, int cashAmount) {
		if(age<0) {
			age = 12;
		}else {
		this.name = name;
		this.age = age;
		cashAmount = 0;
		}
	}
	
	public Person(String name, int age) {
		if(age<0) {
			age = 12;
		}else {
			this.name = name;
			this.age = age;
			cashAmount = 0;
		}
	}
	
	public void setAge(int age) {
		if(age >= 0) {
		this.age = age;
		}
		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		
		this.name = name;
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setCashAmount(int cashAmount) {
		if(cashAmount >= 0) {
		this.cashAmount = cashAmount;
		}
		
	}
	
	public int getCashAmount() {
		return cashAmount;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	public BankAccount getAccount(){
		return account;
	}
	
    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

	    // ù ��° �Ķ����: �޴� ����� ���� (BankAccount)
	    // �� ��° �Ķ����: ��ü�� �ݾ� (����)
	    // ���� : �������� (�Ҹ�)
    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }
	    
	    
	

}
