package com.thread;

public class ThreadEx01 extends Thread {
	private int[] temp;

	public ThreadEx01(String threadname) {

		super(threadname);
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}

	}

	@Override
	public void run() {

		for (int start : temp) {
			try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("쓰레드 이름: " + currentThread().getName());
			System.out.println("쓰레드 value: " + start);

		}
	

	}
	
	
	public static void main(String[] args) {
		ThreadEx01 t = new ThreadEx01(",");
		t.run();
	
	}

}
