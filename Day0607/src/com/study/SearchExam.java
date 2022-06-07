package com.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SearchExam {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("�츮����");
		list.add("���");
		list.add("�츮����");
		list.add("���ѹα�");
		list.add("��������");
		list.add("�뱸");
		list.add("������Ʈ");
		list.add("�ڹ�");
		list.add("�ڿ�");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�Է¹��� ���ڿ��� �����ϴ� ���ڿ� �˻�
		try {
			
			System.out.println("�˻��� �ܾ�");
			String str = br.readLine();
			ListIterator<String> it = list.listIterator(); 
			
			while(it.hasNext()) {
				
				String temp = it.next();
				
				if(temp.startsWith(str)) {
					System.out.println(temp);
				}
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
