package com.test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		/*
		 * int oman=0; int man=0; int ochon=0; int chon=0; int obak=0; int bak=0; int
		 * osip=0; int sip=0; int five=0; int il=0;
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("돈의 액수는?");
		/* int money = sc.nextInt(); */
		int money2 = sc.nextInt();
		//int[] unit = new int[10];
		int[] unit2 = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		for (int i : unit2) {
			int page = money2/i;
			money2 = money2%i;
			System.out.println(i+"권: "+page+"장");
		}
		
		
		/*
		 * for(int i = 0; i<unit.length; i++) {
		 * 
		 * if(i==0) { unit[i] =money/50000; money = money % 50000;
		 * 
		 * }else if(i==1) { unit[i] =money/10000; money = money % 10000; }else if(i==2)
		 * { unit[i] =money/5000; money = money % 5000; }else if(i==3) { unit[i]
		 * =money/1000; money = money % 1000; }else if(i==4) { unit[i] =money/500; money
		 * = money % 500; }else if(i==5) { unit[i] =money/100; money = money % 100;
		 * }else if(i==6) { unit[i] =money/50; money = money % 50; }else if(i==7) {
		 * unit[i] =money/10; money = money % 10; }else if(i==8) { unit[i] =money/5;
		 * money = money % 5; }else if(i==9) { unit[i] =money/1; money = money % 1; } }
		 * 
		 * for(int i = 0; i<unit.length; i++) {
		 * 
		 * if(i==0) { System.out.println("오만원권: "+unit[i]+"장"); }else if(i==1) {
		 * System.out.println("만원권: "+unit[i]+"장"); }else if(i==2) {
		 * System.out.println("오천원권: "+unit[i]+"장"); }else if(i==3) {
		 * System.out.println("천원권: "+unit[i]+"장"); }else if(i==4) {
		 * System.out.println("오백원권: "+unit[i]+"장"); }else if(i==5) {
		 * System.out.println("백원권: "+unit[i]+"장"); }else if(i==6) {
		 * System.out.println("오십원권: "+unit[i]+"장"); }else if(i==7) {
		 * System.out.println("십원권: "+unit[i]+"장"); }else if(i==8) {
		 * System.out.println("오원권: "+unit[i]+"장"); }else if(i==9) {
		 * System.out.println("일원권: "+unit[i]+"장"); } }
		 */
		
		
		
		
	}

}
