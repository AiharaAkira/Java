package com.study;

import java.util.Hashtable;

public class HashTableEx {

	
	private static final String names[]= {
		"�ö���", "��ũ���׽�", "����", "����", "�Ƹ������ڷ���" 	
	};
	
	private static final String tel[]= {
			"01024173795", "1111", "2222", "3333", "4444" 	
		};
	
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		for(int i = 0; i < names.length; i++) {
			ht.put(names[i], tel[i]);
		}
		
		System.out.println(ht);
		
		String str = ht.get("�ö���");

		if(str != null) {
			System.out.println(str);
		}
		
		
		//Ű�� �����ϴ��� �˻�
		
		if(ht.containsKey("����13")) {
			System.out.println("Ű������");
		}else {
			System.out.println("Ű������");
		}
		
		
		
	}
	
}
