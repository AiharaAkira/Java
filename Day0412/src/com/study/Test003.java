package com.study;

public class Test003 {
	//이름, 고향, 전공, 취미,특기,성별, 전화번호,주소, 좌우명
	public static void main(String[] args) throws InterruptedException {
		
		String name = "최민우";
		String local = "의정부";
		String major = "일본어";
		String hobby = "음악감상";
		String specialty = "요리";
		String gender = "남자";
		String phoneNum = "010-2417-3795";
		String address = "경기도 의정부시 민락동";
		String motto = "자유롭게";
		
		System.out.printf("이름		:	%s",name +"\n");
		System.out.printf("고향		:	%s",local+"\n");
		System.out.printf("전공		:	%s",major+"\n");
		System.out.printf("취미		:	%s",hobby+"\n");
		System.out.printf("특기		:	%s",specialty+"\n");
		System.out.printf("성별		:	%s",gender+"\n");
		System.out.printf("전화번호	:	%s",phoneNum+"\n");
		System.out.printf("주소		:	%s",address+"\n");
		System.out.printf("좌우명	:	%s",motto+"\n");
		
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		System.out.print("\n");
		Thread.sleep(1000);
		System.out.println("😀 😃 😄");
		
		
		

	}

}
