package com.member;

import java.util.Scanner;

public class WriteAction implements Action {
	
	@Override
	public void excute(Scanner sc) {
		System.out.println("ȸ�� �̸�?");
		String name = sc.next();
		
		System.out.println("����?");
		int age = sc.nextInt();
		
		System.out.println("�̸���?");
		String email = sc.next();
		
		System.out.println("����?");
		String nation = sc.next();
		
		System.out.println("��ȭ��ȣ?");
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
