package com.score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



 class MyComparator<T> implements Comparator<T>{
	@Override
	public  int compare(T o1, T o2) {

		ScoreVO s1 = (ScoreVO)o1;
		ScoreVO s2 = (ScoreVO)o2;
		
		int n = s1.getTot() - s2.getTot();
		
		if(n>1) {
			
			return 1;
			//-1�� ���ؼ� �⺻ ���Ĺ���� ������ ������
			
		}else if(n<1) {
			
			return -1;
		}else {
			return 0;
		}
		
	}

	
	
}

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> map;

	public ScoreImpl() {

		map = new HashMap<String, ScoreVO>();

	}

	@Override
	public int delete() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hak;
		System.out.println("�й� �Է�");
		hak = br.readLine();

		if (!map.containsKey(hak)) {

			System.out.println("�̹� �����ϴ� �й��Դϴ�.");
			return 0;
		}
		
		map.remove(hak);
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		
		return 1;
	}

	@Override
	public int insert() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hak;
		System.out.println("�й� �Է�");
		hak = br.readLine();

		if (map.containsKey(hak)) {

			System.out.println("�̹� �����ϴ� �й��Դϴ�.");
			return 0;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

		System.out.println("�̸��Է�:");
		vo.setName(br.readLine());

		System.out.println("��������Է�:");
		vo.setBirth(br.readLine());

		System.out.println("��������:");
		vo.setKor(Integer.parseInt(br.readLine()));

		System.out.println("��������:");
		vo.setEng(Integer.parseInt(br.readLine()));

		System.out.println("��������:");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);
		System.out.println("��ϼ��� ");
		return 1;
	}

	@Override
	public int seatch() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		System.out.println("�˻��� �̸� �Է�: ");

		name = br.readLine();

		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {

			String key = it.next();
			ScoreVO data = map.get(key);
			if (data.getName().equals(name)) {

				System.out.println(data.getName());
				System.out.println(data.getMat());
				System.out.println(data.getKor());
				System.out.println(data.getEng());
				System.out.println(data.getBirth());
				System.out.println(data.getHak());
				System.out.println("-----------------");

			}

			System.out.println();

			System.out.println("�˻��� �й� �Է�: ");
			String hak = br.readLine();

			if (map.containsKey(hak)) {

				System.out.println(data.getName());
				System.out.println(data.getMat());
				System.out.println(data.getKor());
				System.out.println(data.getEng());
				System.out.println(data.getBirth());
				System.out.println(data.getHak());
				System.out.println("-------------");
			} else {
				System.out.println("�������� �ʴ� �й��Դϴ�.");
				return 0;
			}
			return 1;

		}

		return 0;
	}

	@Override
	public int update() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�й� �Է�");
		String hak = br.readLine();

		if (!map.containsKey(hak)) {
			System.out.println("�������� �ʴ� �й��Դϴ�.");
			return 0;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

		System.out.println("�̸��Է�:");
		vo.setName(br.readLine());

		System.out.println("��������Է�:");
		vo.setBirth(br.readLine());

		System.out.println("��������:");
		vo.setKor(Integer.parseInt(br.readLine()));

		System.out.println("��������:");
		vo.setEng(Integer.parseInt(br.readLine()));

		System.out.println("��������:");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);

		return 0;
	}

	@Override
	public void writeAll() throws IOException {

		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		if (it.equals(null)) {
			System.out.println("����� �����ϴ�.");
		}

		while (it.hasNext()) {

			String key = it.next();
			ScoreVO data = map.get(key);
			System.out.println(data.getName());
			System.out.println(data.getMat());
			System.out.println(data.getKor());
			System.out.println(data.getEng());
			System.out.println(data.getBirth());
			System.out.println(data.getHak());
			System.out.println("-----------------");
		}

	}

	@Override
	public void writeSort() throws IOException {
		
		List<ScoreVO> lists = new ArrayList<>();
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		if (it.equals(null)) {
			System.out.println("����� �����ϴ�.");
		}
		
		while (it.hasNext()) {
			
			String key = it.next();
			lists.add(map.get(key));
			ScoreVO data = map.get(key);
			
		}
		
		//�������� ����
		Collections.sort(lists, new MyComparator<ScoreVO>());
		
		//�������� ����
//		Collections.sort(lists, Collections.reverseOrder());
		
		System.out.println("--������ ����--");
		Iterator<ScoreVO> it2 = lists.iterator();
		
		while(it2.hasNext()) {
			
			ScoreVO data = it2.next();
			System.out.println(data.getName());
			
		}
		
		
	}
	
}	
