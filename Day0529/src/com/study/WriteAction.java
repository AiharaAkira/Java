package com.study;

import java.util.ArrayList;
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
		
		MemberMain.members.add(member);
		
		
		
	}
	
}
