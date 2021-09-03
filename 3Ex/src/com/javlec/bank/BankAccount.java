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
	    // 코드를 입력하세요
	}
	
	public BankAccount(Person owner) {
	    // 코드를 입력하세요
		this.owner = owner;
		balance = 0;
	}
	
	public BankAccount(int balance, Person owner) {
	    // 코드를 입력하세요
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
	
	
	
	//파라미터 : 입금할 액수(정수)
	// 리턴 : 성공여부(불린)
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
            System.out.println("입금 실패입니다. 잔고: "+ balance +"원, 현금: "+ owner.getCashAmount() +"원");
            System.out.println("false");
            return false;
            
        }else{
        	owner.setCashAmount(owner.getCashAmount()-amount);
        	balance = balance + amount;
            System.out.println(amount+"원 입금하였습니다. 잔고: "+balance +"원, 현금: "+owner.getCashAmount()+"원");
            System.out.println("true");
            return true;
            
        }
			
	}
	
	public boolean deposit(double amount, double exchangeRate) {
		
		return deposit((int)(amount*exchangeRate));
	}
	
	
	//파라미터 : 출금 액수(정수
	// 리턴 : 성공 여부(불린)
	
	boolean withdraw(int amount) {
		if(amount<0 || balance  < amount){
            System.out.println("출금 실패입니다. 잔고: "+ balance  +"원, 현금: "+ owner.getCashAmount() +"원");
            System.out.println("false");
            return false;
        }else{
        	owner.setCashAmount(owner.getCashAmount()+amount);
        	balance = balance - amount;
            System.out.println(amount+"원 출금하였습니다. 잔고: "+balance +"원, 현금: "+owner.getCashAmount()+"원");
            System.out.println("true");
            return true;
        }
		
	}
	
	//첫번째 파라미터 : 받는 사람(person)
	//두번째 파라미터 : 이체할 금액(정수)
	//리턴 : 성공여부 (불린)
	
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
    

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }


}
