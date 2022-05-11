package com.test;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		/* 컴퓨터와 사용자 사이의 가위바위보 게임을 만듬
		 * 사용자가 먼저 3가지중 하나를 입력하고 실행함
		 * 컴퓨터는 랜덤으로 하나를 선택하여 비교함
		 * 누가이겼는지를 판단하고 사용자가 그만을 입력하면 게임을 종료함 */
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String[] str = {"가위","바위","보"};
		while (true) {
			int randomNum = r.nextInt(3);
			
			String com = str[randomNum];
			System.out.println("컴퓨터:"+com);
			System.out.println("사용자가 입력(가위,바위,보)(종료)");
			String player = sc.next();
			
			if(player.equals("종료")) {
				System.out.println("종료합니다!");
				break;
			}
			
			if(player.equals(com)) {
				System.out.println("무승부!");
			}else if((player.equals(str[0])&&com.equals(str[1]))||(player.equals(str[1])&&com.equals(str[0]))||(player.equals(str[2])&&com.equals(str[1]))) {
				System.out.println("패배!");
			}else if((player.equals(str[0])&&com.equals(str[2]))||(player.equals(str[1])&&com.equals(str[2]))||(player.equals(str[2])&&com.equals(str[0]))) {
				System.out.println("승리!");
			}else {
				System.out.println("다시입력하세요");
				continue;
			}
			
		}
		
		
		
	}
}
