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
			//-1�� ���ؼ� �⺻ ���Ĺ���� ������ ������
			
		}
		
		return -1;
	}
	
}
public class ComparatorEx {

	public static void main(String[] args) {
		
		String[] strArr = {"cat", "dog", "Lion", "tiger"};
		
		Arrays.sort(strArr);
		
		System.out.println(Arrays.toString(strArr));
		
		//��ҹ��� ���� ����
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr));
		
		Descending d = new Descending();
		
		//��������
		Arrays.sort(strArr, d);
		System.out.println(Arrays.toString(strArr));
		
		//��������
		Arrays.sort(strArr, new Descending());
		System.out.println(Arrays.toString(strArr));
	}

}
