package com.study;

import java.util.ArrayList;
import java.util.Scanner;

public class ListAction implements Action {

	@Override
	public void excute(Scanner sc) {

		ArrayList<MemberVO> members = MemberMain.members;
		
		
		if (members.equals( null)) {
			System.out.println("회원정보가 없습니다.");
		}else if (members.size() >= 1) {

			for (MemberVO m : members) {
				
				System.out.println(m.getName());
				System.out.println(m.getAge());
				System.out.println(m.getEmail());
				System.out.println(m.getNation());
				System.out.println(m.getTel());
				
			}

		} else {
			
			System.out.println("회원정보가 없습니다.");

		}

	}
}