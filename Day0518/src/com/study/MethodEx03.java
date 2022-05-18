package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*여러가지 기능
 * 
 * 1.최대수, 2. 사이의 합계,3.수열4.종료
 * */


public class MethodEx03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			
			System.out.println("1.최대수, 2. 사이의 합계,3.수열4.종료");
			int x = Integer.parseInt(br.readLine()) ; //메뉴를 입력 받을 변수
			
			if(x==1) {
				
				//call by Value
				System.out.println("최댓값: "+MathRuller.getMax());
			}else if(x==2) {
				
				MathRuller.lineAdd(1, 10);//call by Name
				
				
			}else if(x==3) {
				System.out.println("임의의수:");
				int i = Integer.parseInt(br.readLine()) ;
				System.out.println("임의의수:");
				int j = Integer.parseInt(br.readLine()) ;
				System.out.println("임의의수:");
				int k = Integer.parseInt(br.readLine()) ;
				
				for (int arr : MathRuller.getSequence(i,j,k)) {
					int a = i++;
					System.out.print(a+"번째 의값: "+arr+"\t");
				}
				System.out.println();
				
			}else if(x==4) {
				
				System.out.println("종료~~");
				break;
				
			}else {
				
				System.out.println("1~4까지의 수를 입력해 주세요.");
				continue;
				
			}
			
		}
		
	}
	
}
