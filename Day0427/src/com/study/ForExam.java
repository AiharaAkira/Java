package com.study;

public class ForExam {

	public static void main(String[] args) {

		
		int sum = 0;
		int sumH = 0;
		
		for(int i = 1; i<=10; i++) {
			
			if(i%2 == 0) {
				sum += i;
			}
			
			if(i%2 != 0){
				sumH += i;
				
			}
			
		}
		
		
		
		int sum2 = 0;
		int sumH2 = 0;
		int j = 1;
		
		while(j<=10) {
			
			if(j%2 == 0) {
			
				sum2 += j;
				
			}
			
			if(j%2 != 0){
				sumH2 +=j;
			}
			j++;
			
			
		}
		
		
		
		int k = 1;
		int sumH3 = 0;
		int sum3 = 0;
		do {
			
			if(k%2 == 0) {
			
				sum3 += k;
				
			}
			
			if(k%2 != 0) {
				sumH3 += k;
				
			}
			k++;
			
		
		} while (k<=10);
		
		
		System.out.println(sum);
		System.out.println(sumH);
		System.out.println(sum2);
		System.out.println(sumH2);
		System.out.println(sum3);
		System.out.println(sumH3);
		
	}

}
