
public class MinimumBalanceAccount extends BankAccount{
	private int minimum;

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	// ����
		@Override
		public boolean withdraw(int amount) {
			if (getBalance() - amount >= minimum) {
				System.out.println("���" + minimum + "���� ���ܾ� �մϴ�.");
				return false;
			}
			setBalance(getBalance()- amount); 
			return true;
		}

	
}
