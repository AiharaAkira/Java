package com.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UpdateAction implements Action {

	@Override
	public void excute(Scanner sc) {
		ArrayList<MemberVO> members = MemberMain.members;
		System.out.println("������ ȸ�� ����");
		System.out.println("������ ȸ�� ���� �̸�");
		System.out.println("�̸� �Է�");
		String name = sc.next();
		MemberVO member = getUpdateMember(name);
		
		if(member.equals(null) ) {
			
			System.out.println("������ ȸ���� ������ �������� �ʽ��ϴ�.");
			return;
	
		}else {
			
			System.out.println("��ȭ��ȣ:");
			String tel = sc.next();
			
			System.out.println("����:");
			String nation = sc.next();
			
			System.out.println("����:");
			int age = sc.nextInt();
			
			System.out.println("�̸���:");
			String email = sc.next();
		
			member = new MemberVO(name, tel ,email,age, nation);
			
			
			for(int i = 0; i<members.size(); i++) {
				if(members.get(i).getName().equals(name)) {
					members.set(i, member);
				}	
			}
			
			
		}
		
	}
	
	private MemberVO getUpdateMember(String name) {
		
		ArrayList<MemberVO> members = MemberMain.members;
		
		MemberVO member = null;
		
			for(int i = 0; i<members.size(); i++) {
				if(members.get(i).getName().equals(name)) {
					member = members.get(i);
				}	
			}
			
		
		return member;
		
	}
	
}
