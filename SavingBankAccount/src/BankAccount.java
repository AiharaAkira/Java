
public class BankAccount {
	// �ڱ�
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// ����
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return false;
		}
		return true;
	}

	// �Ա�
	public boolean deposit(int amount) {
		balance += amount;
		return true;
	}
}
