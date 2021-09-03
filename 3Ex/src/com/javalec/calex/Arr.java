/**
 * 
 */
package com.javalec.calex;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Arr {

	/**
	 * 
	 */
	public Arr() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] name = {"영희", "철수", "길동", "영수", "말자"};
		int[] cm = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxHindex = 0;
		int minH = 0;
		int minHindex = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<cm.length; i++) {
			System.out.println(name[i] + "키를 입력하세요:");
			cm[i] = sc.nextInt();
			totalHeight = totalHeight + cm[i];
		}
		
		System.out.println("학생들의 평균신장은" + (totalHeight/cm.length)+"입니다.");
		
		for(int i =0; i<cm.length; i++) {
			if(cm[i] > maxH) {
				maxH = cm[i];
				maxHindex = i;
			}
		}
		
		System.out.println("가장큰 학생은" +name[maxHindex]  + "입니다.");
		
		
		for(int i =0; i<cm.length; i++) {
			if(cm[i] < minH) {
				minH = cm[i];
				minHindex = i;
			}
		}
		
		System.out.println("가장작은 학생은" +name[minHindex]  + "입니다.");
		// TODO Auto-generated method stub

	}

}
