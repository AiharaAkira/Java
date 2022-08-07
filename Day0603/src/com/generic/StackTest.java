package com.generic;

import java.util.Stack;

public class StackTest {

	private static final String COLORS[] = 
		{"검정", "노랑", "청색", "빨강", "연두생"};
	
	public StackTest() {

		Stack<String> stacks = new Stack<String>();
		
		for (String s : stacks) {
			
			stacks.push(s);
			
		}
		
		
	}
	
	public static void  popStack(Stack<String> stacks){
		
		System.out.println("pop: ");
		
		while(!stacks.empty()) {
			
			System.out.println(stacks.pop());
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new StackTest();
		
	}
	
}
