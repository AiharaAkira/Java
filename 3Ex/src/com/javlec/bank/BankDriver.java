package com.javlec.bank;

public class BankDriver {

	public static void main(String[] args) {
		
		Person p1 = new Person("김신의", 28, 30000);
		//사람 선언
		/*Person p1 = new Person();
		p1.setName("김신의");
		p1.setAge(28);
		p1.setCashAmount(30000);*/
		
        Person p2 = new Person("문종모", 5, 100000);
        /*p2.setName("문종모");
        p2.setAge(28);
        p2.setCashAmount(100000); */
		
		//은행 계좌 생성
		BankAccount a1 = new BankAccount(100000);
		//a1.setBalance(100000);
        BankAccount a2 = new BankAccount(500000);
       // a2.setBalance(500000);
		
		p1.setAccount(a1);
		a1.setOwner(p1);
		

		
		

		
        p2.setAccount(a2);
        a2.setOwner(p2);
        
       /* a2.deposit(30000);
        a2.withdraw(170000);
        a2.deposit(620000);
        a2.withdraw(890000);*/
        
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
	}

}
