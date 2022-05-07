package com.cmw.book;

public class ActionExample {
	
	

	public static void main(String[] args) {
//익명 구현 객체(인터페이스로 만드는 객체)
		Action action = new Action(){
			
			public void work() {
				System.out.println("복사를 합니다.");
			}

			
		};
		
		action.work();
				
				
		
	}

}
