package com.member;

import java.util.Arrays;
import java.util.Scanner;

public class ListAction implements Action {

	@Override
	public void excute(Scanner sc) {

		MemberVO[] members = MemberMain.members;

		if (members.equals( null)) {
			System.out.println("회원정보가 없습니다.");
		}else if (members.length >= 1) {

			for (int i = 0; i < members.length; i++) {

				System.out.println(members[i].getName());
				System.out.println(members[i].getAge());
				System.out.println(members[i].getEmail());
				System.out.println(members[i].getNation());
				System.out.println(members[i].getTel());

			}

		} else {
			
			System.out.println("회원정보가 없습니다.");

		}

	}
}