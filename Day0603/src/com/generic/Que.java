package com.generic;

import java.util.LinkedList;
import java.util.Queue;

public class Que {

	private static final String COLORS[] = 
		{"검정", "노랑", "청색", "빨강", "연두생"};
	
	public static void main(String[] args) {

		
		Queue<String> qu = new LinkedList<String>();
		
		
		for (String color : COLORS) {
			
			qu.offer(color);
			
		}
		
		
		while(qu.peek() != null) {
			System.out.println(qu.poll());
		}
		
		
	}

}
