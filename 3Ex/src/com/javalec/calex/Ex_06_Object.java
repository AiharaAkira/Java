package com.javalec.calex;

import java.util.Scanner;

public class Ex_06_Object {

	public Ex_06_Object() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("1-9까지의 숫자를 입력해주세요:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		
		Ex_06_Object gugu = new Ex_06_Object();
		gugu.gugudan(input);
		
	


	}

	
	public void gugudan(int i){
		
		for(int j =1; j <= 9; j++){
			System.out.println(i + "x" + j + "="+ (i*j));
		}
	}
	}

