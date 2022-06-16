package com.thread;

public class ThreadEx02 extends Thread {

	private int[] temp;

	public ThreadEx02(String threadname) {

		super(threadname);
		for (int start : temp) {
			temp[start] = start;
		}

	}

	@Override
	public void run() {

		for (int start : temp) {
			try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();;
				
			}
		}
	}

	public static void main(String[] args) {
		ThreadEx02 t = new ThreadEx02("ȫ�浿");
		//Thread t = new Thread(te2,"ȫ�浿");
		t.start();
	}

}
