package com.user;

import java.util.Scanner;

public class LoginMain {

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		
		LoginSVC loginSVC = new LoginSVC();
		
		do {
			
			System.out.println("--로그인--");
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.println("아이디:");
			String id = sc.next();
			System.out.println("비밀번호:");
			String passwd = sc.next();
			
			UserVO user = loginSVC.login(id, passwd);
			
			if(user == null) {
				
				System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
				
			}else {
				
				System.out.println("로그인한 사용자 정보입니다.");
				System.out.println(user);
				isStop = true;
			}
			
		}while(!isStop);
		
		
	}

}
