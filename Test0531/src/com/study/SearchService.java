package com.study;

public class SearchService {

	Member[] members = new Member[5];
	
	public SearchService() {
	
		members[0] = new Member("ȫ�浿0", 196, 120, "������");
		members[1] = new Member("ȫ�浿1", 196, 120, "������");
		members[2] = new Member("ȫ�浿2", 196, 120, "������");
		members[3] = new Member("ȫ�浿3", 196, 120, "������");
		members[4] = new Member("ȫ�浿4", 196, 120, "������");
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
		
		System.out.println(member.getName()+"���� ã�� �����" );
	
		System.out.println(member.getName());
		System.out.println(member.getHeight());
		System.out.println(member.getNation());
		System.out.println(member.getWeight());
		
	}
	
	
}
