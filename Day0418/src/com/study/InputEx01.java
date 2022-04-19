package com.study;

import java.io.IOException;

public class InputEx01 {

	public static void main(String[] args) throws IOException{
		
		/*아스키코드값 입력 받기
		 * 0~9:48~57
		 * A~Z:65~90
		 * a~z:97~122
		 * */
		
		
			System.out.println("문자입력:");
			
			int i;
			
			i = System.in.read();
			
			System.out.println("ASCII code값: "+i);
			
			
		
	}

}
