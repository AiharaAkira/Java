package com.study;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	private static final String colors2[] =
		{"��","��","��","��","��"};
	
	private static final String colors[] =
		{"�Ͼ�","����","��ȫ","��","��"};
	
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
	
	
	//����
	private static void removeItems(List<String> list, int start, int end) {
		
		list.subList(start, end).clear();
		
	}
	
	
	//����
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
