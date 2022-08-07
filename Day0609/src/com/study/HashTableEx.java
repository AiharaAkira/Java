package com.study;

import java.util.Hashtable;

public class HashTableEx {

	
	private static final String names[]= {
		"플라톤", "소크라테스", "공자", "맹자", "아리스토텔레스" 	
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
		
		String str = ht.get("플라톤");

		if(str != null) {
			System.out.println(str);
		}
		
		
		//키가 존재하는지 검색
		
		if(ht.containsKey("맹자13")) {
			System.out.println("키값있음");
		}else {
			System.out.println("키값없음");
		}
		
		
		
	}
	
}
