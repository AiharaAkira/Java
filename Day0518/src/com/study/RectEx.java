package com.study;

import java.util.Scanner;

public class RectEx {

	public static void main(String[] args) {
		
		Rect r = new Rect();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����:");
		int w = sc.nextInt();
		System.out.println("����:");
		int h = sc.nextInt();
		
		System.out.println("����: "+r.area(w,h));
		
		
		
		
	}

}
