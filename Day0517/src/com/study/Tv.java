package com.study;

import java.util.Scanner;

public class Tv {

	// Ŭ������ �������(�Ӽ� + �޼ҵ�)
	// �Ӽ�(��� ����, �ʵ�)
	String color;
	boolean power;
	int channel;

	// �����ѱ�+����

	public void power() {

		power = !power;

	}

	// ä�ιٲٱ�

	public void channel(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ä��?");
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
