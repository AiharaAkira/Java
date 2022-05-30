package com.study;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteAction2 implements Action {

	@Override
	public void excute(Scanner sc) {

		System.out.println("삭제할 회원 정보");
		System.out.println("삭제할 회원 정보 이름");
		System.out.println("이름 입력");
		String name = sc.next();
		ArrayList<MemberVO> members = MemberMain.members;
		MemberVO member = getDeleteMember(name);

		if (member == null) {

			System.out.println("삭제할 회원의 정보가 존재하지 않습니다.");
			return;

		} else {

			
			// 삭제
			
			for (int i = 0; i < members.size(); i++) {

				if (members.get(i).getName().equals(name)) {
					
					members.remove(i);
					
				}
				
				
			}
			
		}

	}

	

	// 멤버찾기
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
