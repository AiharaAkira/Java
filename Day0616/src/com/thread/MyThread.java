package com.thread;

public class MyThread implements Runnable{


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	public MyThread() {
		first();
		second();
	
	}
	
	public void first() {
		second();
		System.out.println("first");
	}
	
	public void second() {
		System.out.println("second");
	}
	
	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getName()+" start");
		Runnable r = new MyThread();
		Thread myThread = new Thread(r);
		myThread.start();
		
		
		try {
			
			myThread.join();
		
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " end");
		
	}
	
}
