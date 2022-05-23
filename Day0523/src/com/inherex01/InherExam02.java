package com.inherex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AClass {
	protected int x,y;
	protected char c;
	
	public void write(double result) {
		System.out.printf("%d %c %d = %.2f\n",x,c,y,result);
	}
}

class BClass extends AClass {
	
	boolean input() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("임의의 두 정수 입력(공백 구분):");
		String temp = br.readLine();
		String[] str = temp.split("\\s");
		
		if(str.length !=2) {
			return false;
		}
		
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);
		
		
		System.out.println("연산자 입력[+-*/]:");
		c = (char) System.in.read();
		
		if(c == '+'||c == '-'||c == '*'||c == '/') {
			return true;
		}
		
		return false;
	}
	
	
	public double calc() {
		
		double result = 0;
		
		if(c == '+' ) {
			
			result = x + y;
			
		}else if(c == '-') {
			
			result = x - y;
		}else if(c == '*') {
			result = x * y;
			
		}else if(c == '/') {
			result = x / y;
			
		}
		
		return result;
	}

}


public class InherExam02  {
	
	public static void main(String[] args) throws IOException {
		
		BClass bc = new BClass();
		
		if(!bc.input()) {
			System.out.println("error");
			return ;
		}

		double result = bc.calc();
		bc.write(result);
		
		
	}
	
	
}
