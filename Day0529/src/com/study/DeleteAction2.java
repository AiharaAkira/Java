package com.study;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteAction2 implements Action {

	@Override
	public void excute(Scanner sc) {

		System.out.println("������ ȸ�� ����");
		System.out.println("������ ȸ�� ���� �̸�");
		System.out.println("�̸� �Է�");
		String name = sc.next();
		ArrayList<MemberVO> members = MemberMain.members;
		MemberVO member = getDeleteMember(name);

		if (member == null) {

			System.out.println("������ ȸ���� ������ �������� �ʽ��ϴ�.");
			return;

		} else {

			
			// ����
			
			for (int i = 0; i < members.size(); i++) {

				if (members.get(i).getName().equals(name)) {
					
					members.remove(i);
					
				}
				
				
			}
			
		}

	}

	

	// ���ã��
	private MemberVO getDeleteMember(String name) {

		ArrayList<MemberVO> members = MemberMain.members;
		MemberVO member = null;

		for (int i = 0; i < members.size(); i++) {

			if (members.get(i).getName().equals(name)) {

				member = members.get(i);

			}

		}

		return member;

	}

	

}
