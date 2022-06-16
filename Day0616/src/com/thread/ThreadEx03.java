package com.thread;

public class ThreadEx03 {

	public static void main(String[] args) {

		for(int i = 1; i<60; i++){
			
			System.out.println(".");


			try{
			Thread.sleep(150);
		}catch(Exception e){
			e.printStackTrace();
				}

			
			}
		
		
	}

}
