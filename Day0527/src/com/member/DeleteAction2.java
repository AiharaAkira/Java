package com.member;

import java.util.Scanner;

public class DeleteAction2 implements Action {

	@Override
	public void excute(Scanner sc) {

		System.out.println("������ ȸ�� ����");
		System.out.println("������ ȸ�� ���� �̸�");
		System.out.println("�̸� �Է�:");
		String name = sc.next();

		deleteMember(name);

	}

	public void deleteMember(String name) {

		int deleteIndex = -1;

		MemberVO[] members = MemberMain.members;

		MemberVO[] temp = null;

		for (int i = 0; i < members.length; i++) {

			if (members[i].getName().equals(name)) {

				deleteIndex = i;
				
				/*
				 * ���� �迭 ��ü�� ����Ǿ� �ִ� ȸ�� ���� ��ü�� �Ķ���� ������
				 * ���۵Ǿ� �� name ���� ���� name �Ӽ� ���� ������ �ִ� ��ü�� 
				 * �迭���� �ε��� ��ȣ�� ã�Ƴ�
				 */

			}

		}

		if (deleteIndex == -1) {
			
			/*
			 * 
			 * deleteIndex�� -1�̶�� ���� �Ķ���� ���۵Ǿ� �� name ���� ����
			 * name ���� ������ �ִ� ȸ�� ���� ��ü�� ã�� ���ߴٴ� �ǹ��̸� 
			 * �޽����� ����ϰ� �޼ҵ带 ������
			 * 
			 */
			
			System.out.println("ȸ�������� �������� �ʽ��ϴ�.");
			return;
		}

		if (members.length >= 1) {

			temp = new MemberVO[members.length - 1];

			/*
			 * temp �迭 ��ü�� MemberMain Ŭ������ �����Ǿ� �ִ� members�迭��
			 * ũ�⺸�� �ϳ� ���� ũ��� ������
			 * ���� �迭���� ȸ�� ���� ��ü �ϳ��� ������ ���̹Ƿ� ���� �迭�� ũ�⺸��
			 * �ϳ� ���� ������
			 */
			
			for (int i = 0; i < members.length; i++) {

				if (i == deleteIndex) {

					/*
					 * ���� �ε����� �����Ϸ��� ȸ�� ������ �ε����� ������ continue��
					 * �����Ͽ� �ǳʶ�.
					 * ȸ�������� ��ü�� �������� �ʴ´�.
					 */
					
					continue;

				} else if (i > deleteIndex) {

					/*
					 * ���� �ε��� ��ȣ�� �����Ϸ��� ȸ�� ������ �ε��� ���� �̸�
					 * �����Ϸ��� ��ü�� �ε��� ��ȣ�� �ϳ� ������ ������ �����Ϸ���
					 * �ε������� ū�ε����� �����ϴ� 
					 * ��ü���� ������ �ϳ��� �̵����Ѽ� ������
					 */
					
					temp[i - 1] = members[i];

				}

				temp[i] = members[i];

			}

			
			/*
			 * �迭 ��ü temp�� MemberMain Ŭ������ static���� �����Ǿ� �ִ�
			 * members ������ ������
			 */
			
			MemberMain.members = temp;
			
			System.out.println(name + " ȸ���� ���� �Ǿ����ϴ�.");

		}

	}

}
