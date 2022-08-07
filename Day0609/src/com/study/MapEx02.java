package com.study;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
	
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("홍길동", 90);
		map.put("홍길동1", 190);
		map.put("홍길동2", 290);
		map.put("홍길동3", 390);
		map.put("홍길동4", 490);
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
	
		/*entry
		 * 키와 값을 set형태로 저장(HashMap을 이용해서 key와 value을 묶어주기 위해서 entry을 이용할
		 * 
		 * 맵.엔트리(키와 값을 한쌍(페어)이다)
		 * Map.Entry에는 entrySet()메소드가 있는데
		 * entrySet()메소드는 현재 클래스에 속하는 요소를 가지는 맵의 컬렉션뷰를 돌려줌
		 * 맵의 엔트리의 참조를 취득하는 유일한 방법은 반복자(Iterator)를 이용해서 취득함
		 * )
		 * */
	
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		
		while(it1.hasNext()) {
			
			Map.Entry<String, Integer> e = it1.next();
			e.getKey();
			e.getValue();
			
			System.out.println(e.getKey() + " " + e.getValue());
			
		}
		
		Set set2 = map.keySet();
		System.out.println(set2);

		
		Collection<Integer> v = map.values();
		System.out.println(v);
		Iterator<Integer> it2 = v.iterator();
		int sum = 0;
		while (it2.hasNext()) {

			int i = it2.next();
			sum += i;
			
			
		}
		System.out.println(sum);
		System.out.println(sum/set2.size());
		System.out.println(Collections.max(v));
		System.out.println(Collections.min(v));
		
		
		
		
	}
	
}
