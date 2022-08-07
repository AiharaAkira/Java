package com.study;

import java.util.Scanner;

public class RectEx {

	public static void main(String[] args) {
		
		Rect r = new Rect();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로:");
		int w = sc.nextInt();
		System.out.println("세로:");
		int h = sc.nextInt();
		
		System.out.println("넓이: "+r.area(w,h));
		
		
		
		
	}

}
