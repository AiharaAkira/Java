package com.javalec.calex;

public class While {

	public While() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		while (i<=100) {
			if (i%3 == 0) {
				sum += i;
				
			}
			i+=1;
		}System.out.println("sum="+sum);
	}

}
