package com.comparator;

import java.util.Arrays;
import java.util.Comparator;

class Descending implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			
			return c1.compareTo(c2) * -1;
			//-1을 곱해서 기본 정렬방식을 역으로 변경함
			
		}
		
		return -1;
	}
	
}
public class ComparatorEx {

	public static void main(String[] args) {
		
		String[] strArr = {"cat", "dog", "Lion", "tiger"};
		
		Arrays.sort(strArr);
		
		System.out.println(Arrays.toString(strArr));
		
		//대소문자 구분 없이
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr));
		
		Descending d = new Descending();
		
		//내림차순
		Arrays.sort(strArr, d);
		System.out.println(Arrays.toString(strArr));
		
		//내림차순
		Arrays.sort(strArr, new Descending());
		System.out.println(Arrays.toString(strArr));
	}

}
