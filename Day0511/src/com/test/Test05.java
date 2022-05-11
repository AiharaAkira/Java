package com.test;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String[] str = {"가위","바위","보"};
		while (true) {
			int randomNum = r.nextInt(3)+1;
			
			int user;
			
			do {
				System.out.println("1.가위 2.바위 3.보 4.(종료)");
				user=sc.nextInt();
			}while(user <1||user>3);
			
			System.out.println("사용자: "+str[user-1]);
			System.out.println("컴퓨터: "+str[randomNum-1]);
			//처리결과출력
			String result;
			result = "무승부";
			if((user==1&&randomNum==3)||(user==2&&randomNum==1)||(user==3&&randomNum==2)) {
				result ="승리";
			}else if((user==1&&randomNum==2)||(user==2&&randomNum==3)||(user==3&&randomNum==1)) {
				result ="패배";
			}
			System.out.println(result);
			
		}
		
		
		
	}
}
