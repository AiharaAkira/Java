package com.vector;

import java.util.Vector;

public class VectorEx {

	private static final String colors[]= {
		"����", "���","���", "û��","����", "���λ�"	
	};
	
	public static void main(String[] args) {
		
		int i;
		Vector<String> v = new Vector<String>();
		for(i = 0; i< colors.length; i++) {
			
			v.add(colors[i]);
			
		}
		
		for (String str: v) {
			System.out.println(str);
		}
		
	}
	
}
