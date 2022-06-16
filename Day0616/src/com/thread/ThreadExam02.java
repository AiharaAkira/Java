package com.thread;

public class ThreadExam02 extends Thread {

	private String firstname;
	private String lastname;

	public ThreadExam02(String a, String b, int x) {

		firstname = a;
		lastname = b;
		setPriority(x);
		setDaemon(true);

	}

	@Override
	public void run() {

		System.out.println("Active: "+Thread.activeCount());

		int xx = Thread.activeCount();

		Thread[] th = new Thread[xx];

		Thread.enumerate(th);
		
		for (int i = 0; i < th.length; i++) {

			
			
			System.out.println(" Name: "+th[i].getName() + " Priority: " + th[i].getPriority());
			System.out.println("Isdemon:"+th[i].isDaemon() + " IsAlive:" + th[i].isAlive());

		}

		while (true) {

			System.out.println("ÀÌ¸§: " + firstname);
			
			try {
				
				Thread.sleep(100);
			
			} catch (Exception e) {

				e.printStackTrace();

			}

			System.out.println("ÀÌ¸§2: " + lastname);

		}

	}

	public static void main(String[] args) {

		ThreadExam02 t1 = new ThreadExam02("±æµ¿", "È«", 1);

		t1.start();

		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		ThreadExam02 t2 = new ThreadExam02("À¯½Å", "±è", 2);

		t2.start();

	}

}
