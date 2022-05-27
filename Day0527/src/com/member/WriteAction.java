package com.member;

import java.util.Scanner;

public class WriteAction implements Action {
	
	@Override
	public void excute(Scanner sc) {
		System.out.println("회원 이름?");
		String name = sc.next();
		
		System.out.println("나이?");
		int age = sc.nextInt();
		
		System.out.println("이메일?");
		String email = sc.next();
		
		System.out.println("국적?");
		String nation = sc.next();
		
		System.out.println("전화번호?");
		String tel = sc.next();
		
		MemberVO member = new MemberVO(name, tel ,email,age, nation);
		addMember(member);
	}
	
	private void addMember(MemberVO member) {
		
		MemberVO[] temp = new MemberVO[MemberMain.members.length+1];
		
		for(int i = 0; i<MemberMain.members.length; i++) {
			
			temp[i] = MemberMain.members[i];
			
		}
		
		temp[temp.length-1] = member;
		
		MemberMain.members = temp;
		
	}
	
}
