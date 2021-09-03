package com.javalec.calex;

public class ExIfElse {

	public ExIfElse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		int h = 20;
		if (i > j) {
			System.out.println("i는 j보다" + (i-j) +"만큼크다");
		}
		else  {
			System.out.println("j는 i보다" + (j-i) +"만큼크다");
		}
		if ((i+j)==h) {
			System.out.println("ij의합은 h와 같다");
		}
		else {
			System.out.println("ij의 합은 h와 같지 않다");
		}
	}

}
