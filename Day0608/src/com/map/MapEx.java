package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		
		map.put("만화", "마녀배달부 키키");
		map.put("호러", "스크립");
		map.put("영화", "황혼에서 새벽까지");
		
		System.out.println(map);
		
		String key;
		
		Set set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			
			key = it.next();
			
			System.out.println(map.get(key));
			
			
		}
		
		
		
	}

}
