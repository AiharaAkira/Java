package com.member;

import java.util.Scanner;

public class MemberMain {

	public static MemberVO[] members;
	static MemberService memberService = new MemberService();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		members = new MemberVO[0];

		// ArrayList<MemberVO> members = new ArrayList<MemberVO>();

		boolean isStop = false;

		do {

			System.out.println("다음 메뉴 중 하나를 선택하세요.");
			System.out.println("1. 회원가입 ");
			System.out.println("2. 회원목록보기 ");
			System.out.println("3. 회원삭제 ");
			System.out.println("4. 회원수정 ");
			System.out.println("5. 종료 ");
			
			String command = sc.next();

			if (command.equals("1")) {
				WriteAction writeAction = new WriteAction();
				memberService.process(writeAction, sc);
			} else if (command.equals("2")) {

				ListAction listAction = new ListAction();
				memberService.process(listAction, sc);

			} else if (command.equals("3")) {

			} else if (command.equals("4")) {
				UpdateAction updateAction = new UpdateAction();
				memberService.process(updateAction, sc);

			} else if (command.equals("5")) {
				System.out.println("종료");
				isStop = true;
			}

		} while (!isStop);

	}

}
