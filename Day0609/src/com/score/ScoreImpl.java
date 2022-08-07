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
			//-1을 곱해서 기본 정렬방식을 역으로 변경함
			
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
		System.out.println("학번 입력");
		hak = br.readLine();

		if (!map.containsKey(hak)) {

			System.out.println("이미 존재하는 학번입니다.");
			return 0;
		}
		
		map.remove(hak);
		System.out.println("삭제가 완료되었습니다.");
		
		return 1;
	}

	@Override
	public int insert() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String hak;
		System.out.println("학번 입력");
		hak = br.readLine();

		if (map.containsKey(hak)) {

			System.out.println("이미 존재하는 학번입니다.");
			return 0;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

		System.out.println("이름입력:");
		vo.setName(br.readLine());

		System.out.println("생년월일입력:");
		vo.setBirth(br.readLine());

		System.out.println("국어점수:");
		vo.setKor(Integer.parseInt(br.readLine()));

		System.out.println("영어점수:");
		vo.setEng(Integer.parseInt(br.readLine()));

		System.out.println("수학점수:");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);
		System.out.println("등록성공 ");
		return 1;
	}

	@Override
	public int seatch() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		System.out.println("검색할 이름 입력: ");

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

			System.out.println("검색할 학번 입력: ");
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
				System.out.println("존재하지 않는 학번입니다.");
				return 0;
			}
			return 1;

		}

		return 0;
	}

	@Override
	public int update() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("학번 입력");
		String hak = br.readLine();

		if (!map.containsKey(hak)) {
			System.out.println("존재하지 않는 학번입니다.");
			return 0;
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);

		System.out.println("이름입력:");
		vo.setName(br.readLine());

		System.out.println("생년월일입력:");
		vo.setBirth(br.readLine());

		System.out.println("국어점수:");
		vo.setKor(Integer.parseInt(br.readLine()));

		System.out.println("영어점수:");
		vo.setEng(Integer.parseInt(br.readLine()));

		System.out.println("수학점수:");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);

		return 0;
	}

	@Override
	public void writeAll() throws IOException {

		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		if (it.equals(null)) {
			System.out.println("목록이 없습니다.");
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
			System.out.println("목록이 없습니다.");
		}
		
		while (it.hasNext()) {
			
			String key = it.next();
			lists.add(map.get(key));
			ScoreVO data = map.get(key);
			
		}
		
		//오름차순 정렬
		Collections.sort(lists, new MyComparator<ScoreVO>());
		
		//내림차순 정렬
//		Collections.sort(lists, Collections.reverseOrder());
		
		System.out.println("--총점순 정렬--");
		Iterator<ScoreVO> it2 = lists.iterator();
		
		while(it2.hasNext()) {
			
			ScoreVO data = it2.next();
			System.out.println(data.getName());
			
		}
		
		
	}
	
}	
