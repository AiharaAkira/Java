package com.member;

import java.util.Scanner;

public class DeleteAction implements Action {

	@Override
	public void excute(Scanner sc) {

		System.out.println("������ ȸ�� ����");
		System.out.println("������ ȸ�� ���� �̸�");
		System.out.println("�̸� �Է�:");
		String name = sc.next();
		MemberVO member = getDeleteMember(name);

		if (member == null) {

			System.out.println("������ ȸ���� ������ �������� �ʽ��ϴ�.");
			return;

		} else {

			String tel = null;
			String email = null;
			int age = 0;
			String nation = null;

			member = new MemberVO(name, tel, email, age, nation);

			MemberVO[] membersTemp = MemberMain.members;
			
			// ����
			
			//������ ����
			int count = membersTemp.length;
			
			for (int i = 0; i < count; i++) {

				if (membersTemp[i].getName().equals(name)) {
					
					for(int j = i; j<count-1; j++) {
						
						membersTemp[j] = membersTemp[j+1];
						
					}
					count--;
					break;
					
				}
				
				
			}
			
			
			//�����迭�� ����
			MemberMain.members = new MemberVO[MemberMain.members.length-1];
			MemberVO[] membersReal = MemberMain.members;
			
			for(int i = 0; i<MemberMain.members.length; i++) {
				
				
				membersReal[i] = membersTemp[i];
			}
			
			
		}

	}

	

	// ���ã��
	private MemberVO getDeleteMember(String name) {

		MemberVO[] members = MemberMain.members;
		MemberVO member = null;

		for (int i = 0; i < members.length; i++) {

			if (members[i].getName().equals(name)) {
					
				member = members[i];
				
			}

		}

		return member;

	}

	

}
