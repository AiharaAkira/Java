package com.study;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	private static final String colors2[] =
		{"빨","주","노","초","파"};
	
	private static final String colors[] =
		{"하양","검정","분홍","보","남"};
	
	public LinkedListEx() {

		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();
	
		
		for (String color : colors) {
			
			list1.add(color);
			
		}
		
		for (String color : colors2) {
			
			list2.add(color);
			
		}
		
		printList(list1);
		System.out.println("------------");
		printList(list2);
		System.out.println("------------");
		printReverseList(list1);
		
	}

	public void printList(List<String> list) {
		
		for (String color : list) {
			System.out.println(color);
		}
		
	}
	
	
	//삭제
	private static void removeItems(List<String> list, int start, int end) {
		
		list.subList(start, end).clear();
		
	}
	
	
	//역순
	private static void printReverseList(List<String> list) {
		
		ListIterator<String> it = list.listIterator(list.size());
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}
	
	
	
	public static void main(String[] args) {

		
		LinkedListEx lle = new LinkedListEx();
		
		
		
		
		
	}

}
