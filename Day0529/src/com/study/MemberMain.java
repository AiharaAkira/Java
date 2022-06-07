package com.study;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

	static MemberService memberService = new MemberService();
	public static ArrayList<MemberVO> members = new ArrayList<MemberVO>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		boolean isStop = false;

		do {

			System.out.println("���� �޴� �� �ϳ��� �����ϼ���.");
			System.out.println("1. ȸ������ ");
			System.out.println("2. ȸ����Ϻ��� ");
			System.out.println("3. ȸ������ ");
			System.out.println("4. ȸ������ ");
			System.out.println("5. ���� ");

			String command = sc.next();

			if (command.equals("1")) {
				WriteAction writeAction = new WriteAction();
				memberService.process(writeAction, sc);
			} else if (command.equals("2")) {

				ListAction listAction = new ListAction();
				memberService.process(listAction, sc);

			} else if (command.equals("3")) {
				DeleteAction DeleteAction = new DeleteAction();
				memberService.process(DeleteAction, sc);

			} else if (command.equals("4")) {
				UpdateAction updateAction = new UpdateAction();
				memberService.process(updateAction, sc);

			} else if (command.equals("5")) {
				System.out.println("����");
				isStop = true;
			}

		} while (!isStop);

	}

}