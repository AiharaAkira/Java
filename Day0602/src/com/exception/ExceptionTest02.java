package com.exception;

public class ExceptionTest02 {

	public static void main(String[] args) throws MyException {

		int x = 100;
		int y = 0;
		int tot = 0;
		
		try {

			tot = x/y;
			
		} catch (ArithmeticException e) {
		
			MyException me = new MyException("³ª´°¼À", e);
			throw me;
			//me.printStackTrace();
			
		}
		
		System.out.println("tot: "+ tot);
		
	}

}
