package com.study;

import java.util.Scanner;

public class Tv {

	// 클래스의 구성요소(속성 + 메소드)
	// 속성(멤버 변수, 필드)
	String color;
	boolean power;
	int channel;

	// 전원켜기+끄기

	public void power() {

		power = !power;

	}

	// 채널바꾸기

	public void channel(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 채널?");
		ch = sc.nextInt();
		channel = ch;
		sc.close();
	}
	
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}

	public Tv() {
	}

}
