package com.javlec.bank;

public class BankAccount {

	private int balance;
	private Person owner;
	
	public BankAccount(int balance) {
		if(balance<0) {
			balance = 0;
		}else {
			this.balance = balance;
		}
	    // �ڵ带 �Է��ϼ���
	}
	
	public BankAccount(Person owner) {
	    // �ڵ带 �Է��ϼ���
		this.owner = owner;
		balance = 0;
	}
	
	public BankAccount(int balance, Person owner) {
	    // �ڵ带 �Է��ϼ���
		if(balance<0) {
			
			this.owner = owner;
			balance = 0;
		}else {
			this.owner = owner;
			this.balance = balance;
		}
	}
	
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	public Person getOwner(){
		return owner;
	}
	
	
	
	//�Ķ���� : �Ա��� �׼�(����)
	// ���� : ��������(�Ҹ�)
	public void setBalance(int balance) {
		if(balance >= 0) {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
boolean deposit(int amount) {
		
		if(amount<0 || owner.getCashAmount() < amount){
            System.out.println("�Ա� �����Դϴ�. �ܰ�: "+ balance +"��, ����: "+ owner.getCashAmount() +"��");
            System.out.println("false");
            return false;
            
        }else{
        	owner.setCashAmount(owner.getCashAmount()-amount);
        	balance = balance + amount;
            System.out.println(amount+"�� �Ա��Ͽ����ϴ�. �ܰ�: "+balance +"��, ����: "+owner.getCashAmount()+"��");
            System.out.println("true");
            return true;
            
        }
			
	}
	
	public boolean deposit(double amount, double exchangeRate) {
		
		return deposit((int)(amount*exchangeRate));
	}
	
	
	//�Ķ���� : ��� �׼�(����
	// ���� : ���� ����(�Ҹ�)
	
	boolean withdraw(int amount) {
		if(amount<0 || balance  < amount){
            System.out.println("��� �����Դϴ�. �ܰ�: "+ balance  +"��, ����: "+ owner.getCashAmount() +"��");
            System.out.println("false");
            return false;
        }else{
        	owner.setCashAmount(owner.getCashAmount()+amount);
        	balance = balance - amount;
            System.out.println(amount+"�� ����Ͽ����ϴ�. �ܰ�: "+balance +"��, ����: "+owner.getCashAmount()+"��");
            System.out.println("true");
            return true;
        }
		
	}
	
	//ù��° �Ķ���� : �޴� ���(person)
	//�ι�° �Ķ���� : ��ü�� �ݾ�(����)
	//���� : �������� (�Ҹ�)
	
	public boolean transfer(BankAccount to, int amount) {
        boolean success;

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.balance += amount;
            success = true;
        }

        System.out.println(success + " - from: " + owner.getName()
                + ", to: " + to.owner.getName()
                + ", amount: " + amount
                + ", balance: " + balance);

        return success;
    }
    

    // ù ��° �Ķ����: �޴� ����� ���� (BankAccount)
    // �� ��° �Ķ����: ��ü�� �ݾ� (����)
    // ���� : �������� (�Ҹ�)
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }


}
