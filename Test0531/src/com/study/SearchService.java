package com.study;

public class SearchService {

	Member[] members = new Member[5];
	
	public SearchService() {
	
		members[0] = new Member("홍길동0", 196, 120, "오나라");
		members[1] = new Member("홍길동1", 196, 120, "오나라");
		members[2] = new Member("홍길동2", 196, 120, "오나라");
		members[3] = new Member("홍길동3", 196, 120, "오나라");
		members[4] = new Member("홍길동4", 196, 120, "오나라");
	}
	
	boolean searchResult = false;
	
	public boolean searchMember(String name) {
		for(int i = 0; i<members.length; i++) {
			
			if(members[i].getName().equals(name)) {
				
				prtInfo(members[i]);
				searchResult = true;
			
			}
			
		}
		
		return searchResult;
	}
	
	private void prtInfo(Member member){
		
		System.out.println(member.getName()+"으로 찾은 결과값" );
	
		System.out.println(member.getName());
		System.out.println(member.getHeight());
		System.out.println(member.getNation());
		System.out.println(member.getWeight());
		
	}
	
	
}
