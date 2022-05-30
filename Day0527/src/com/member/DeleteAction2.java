package com.member;

import java.util.Scanner;

public class DeleteAction2 implements Action {

	@Override
	public void excute(Scanner sc) {

		System.out.println("삭제할 회원 정보");
		System.out.println("삭제할 회원 정보 이름");
		System.out.println("이름 입력:");
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

			}

		}

		if (deleteIndex == -1) {
			System.out.println("회원정보가 존재하지 않습니다.");
			return;
		}

		if (members.length >= 1) {

			temp = new MemberVO[members.length - 1];

			for (int i = 0; i < members.length; i++) {

				if (i == deleteIndex) {

					continue;

				} else if (i > deleteIndex) {
					temp[i - 1] = members[i];
				}

				temp[i] = members[i];

			}

			MemberMain.members = temp;

			System.out.println(name+" 회원이 삭제 되었습니다.");
				
		}

	}

	

}
