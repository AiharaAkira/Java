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
		
		map.put("ȫ�浿", 90);
		map.put("ȫ�浿1", 190);
		map.put("ȫ�浿2", 290);
		map.put("ȫ�浿3", 390);
		map.put("ȫ�浿4", 490);
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
	
		/*entry
		 * Ű�� ���� set���·� ����(HashMap�� �̿��ؼ� key�� value�� �����ֱ� ���ؼ� entry�� �̿���
		 * 
		 * ��.��Ʈ��(Ű�� ���� �ѽ�(���)�̴�)
		 * Map.Entry���� entrySet()�޼ҵ尡 �ִµ�
		 * entrySet()�޼ҵ�� ���� Ŭ������ ���ϴ� ��Ҹ� ������ ���� �÷��Ǻ並 ������
		 * ���� ��Ʈ���� ������ ����ϴ� ������ ����� �ݺ���(Iterator)�� �̿��ؼ� �����
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
