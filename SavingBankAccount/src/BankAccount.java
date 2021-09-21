
public class BankAccount {
	// 자금
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 인출
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return false;
		}
		return true;
	}

	// 입금
	public boolean deposit(int amount) {
		balance += amount;
		return true;
	}
}
