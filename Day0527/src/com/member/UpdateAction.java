package com.member;

import java.util.Scanner;

public class UpdateAction implements Action {

	@Override
	public void excute(Scanner sc) {
		
		System.out.println("수정할 회원 정보");
		System.out.println("수정할 회원 정보 이름");
		System.out.println("이름 입력");
		String name = sc.next();
		MemberVO member = getUpdateMember(name);
		
		if(member == null) {
			
			System.out.println("수정할 회원의 정보가 존재하지 않습니다.");
			return;
	
		}else {
			
			System.out.println("전화번호:");
			String tel = sc.next();
			
			System.out.println("국적:");
			String nation = sc.next();
			
			System.out.println("나이:");
			int age = sc.nextInt();
			
			System.out.println("이메일:");
			String email = sc.next();
		
			member = new MemberVO(name, tel ,email,age, nation);
			
			for(int i = 0; i<MemberMain.members.length;i++) {
				
				if(MemberMain.members[i].getName().equals(name)) {
					MemberMain.members[i] = member;
				}
				
			}
			
		}
		
	}
	
	private MemberVO getUpdateMember(String name) {
		
		MemberVO[] members = MemberMain.members;
		MemberVO member = null;
		
		for(int i = 0; i<members.length; i++) {
			
			if(members[i].getName().equals(name)) {
				member = members[i];
			}
			
		}
		
		return member;
		
	}
	
}
