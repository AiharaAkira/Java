package com.sync;

public class SynchronizedEx01 {

	/*
	 * ����ȭ : �������� �����ϴ� ���� ���� �ϱ� ���ѹ��
	 * 
	 * �Ӱ迵�� : -��Ƽ�����忡 ���� �����ڿ��� ������ �� �ִ� �ڵ��� ������ �ǹ��Ѵ�. -��Ƽ ������ ���α׷����� �Ӱ迵���� ó���� ���
	 * �ɰ��� ������ �߻��� -�̷��� ��Ȳ�� �ذ��� �� �ִ� ����� ����ȭ��
	 * 
	 * ����ȭ�� ó���ϱ� ���� ��� ��ü�� ���� ���Խ�Ŵ
	 * 
	 * �� -������ü�� ���� �����尡 ���ÿ� �������� ���ϵ��� �ϱ� ���� ���� -��� ��ü�� �� ������ ������ �� �ڵ����� ��������� ��
	 * -����ȭ�� �߸��Ǹ� Dead Lock�� �ɸ�
	 * 
	 * ����ȭ ���� ���
	 * 
	 * 1. public synchronized void synchronizeMethod(){
	 * 
	 * }
	 * 
	 * 2. public void synchronizedMethod(){
	 * 
	 * synchronized(��ü �Ǵ� Ŭ������){}
	 * 
	 * }
	 * 
	 */

	public static void main(String[] args) {

		// ATM atm = new ATM();
		ATMTwo atm = new ATMTwo();

		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");

		mother.start();
		son.start();

	}

}

class ATM implements Runnable {

	// ����ȭ�� ����Ǿ��µ� ���� �߻�

	private long depositeMoney = 10000;

	@Override
	public void run() {

		synchronized (this.getClass()) {

			for (int i = 0; i < 10; i++) {
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				if (getDepositeMoney() <= 0) {
					break;
				}

				withDraw(1000);

			}

		}

	}

	// ���

	public void withDraw(long howMuch) {

		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.print("�ܾ� : " + getDepositeMoney() + " ��\n");

		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.println("�ܾ��� ���� �մϴ�.");
		}

	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

	public void setDepositeMoney(long depositeMoney) {
		this.depositeMoney = depositeMoney;
	}

}

class ATMTwo implements Runnable {

	// ����ȭ�� ����Ǿ��µ� ���� �߻�

	private long depositeMoney = 10000;

	@Override
	public void run() {

		synchronized (this.getClass()) {

			for (int i = 0; i < 10; i++) {

				if (getDepositeMoney() <= 0) {
					break;
				}

				withDraw(1000);

				if (getDepositeMoney() == 2000 || getDepositeMoney() == 4000 || getDepositeMoney() == 6000
						|| getDepositeMoney() == 8000) {

					try {

						this.wait();

					} catch (Exception e) {

						e.printStackTrace();
					}

				} else {

					this.notify();

				}

			}

		}

	}

	// ���

	public void withDraw(long howMuch) {

		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.print("�ܾ� : " + getDepositeMoney() + " ��\n");

		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.println("�ܾ��� ���� �մϴ�.");
		}

	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

	public void setDepositeMoney(long depositeMoney) {
		this.depositeMoney = depositeMoney;
	}

}
