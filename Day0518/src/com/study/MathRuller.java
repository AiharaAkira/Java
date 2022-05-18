package com.study;

import java.util.Scanner;

public class MathRuller {

	
	public MathRuller() {
	}
	
	public static int getMax() {
		Scanner sc = new Scanner(System.in);
		System.out.println("임의수 : ");
		int num1 = sc.nextInt();
		System.out.println("임의수 : ");
		int num2 = sc.nextInt();
		int max = 0;
		if(num1 > num2) {
			
			 max = num1;
			
		}else if(num1 < num2) {
			max = num2;
			
		}
		
		return max;
	}
	
	
	public static void lineAdd(int num1, int num2) {
		int sum = 0;
		
		if(num1>num2) {
			num1 = num1^num2;
			num2 = num1^num2;
			num1 = num1^num2;
		}
		
		
		for(int i = num1; i<=num2; i++) {
			sum += i;
		}
		
		System.out.println(num1+"부터"+num2+"까지의 합: "+sum);
		
	}

	public static int[] getSequence(int i, int j, int k) {
		
		if(i<j) {
			i = i^j;
			j = i^j;
			i = i^j;
		}
		
		if(i<k) {
			i = i^k;
			k = i^k;
			i = i^k;
		}
		
		if(j<k) {
			j = j^k;
			k = j^k;
			j = j^k;
		}
		
		int[] arr = new int[3];
		arr[0] = i;
		arr[1] = j;
		arr[2] = k;
		
		return arr;
	}
	
}
