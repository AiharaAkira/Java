package com.study;

import java.util.Random;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//1교시 - string tokenizer설명(이론) + 문제
		//랜덤 정수 10개를 생성한다.
		//생성된 수를 스택에 넣는다.
		// 스택에 들어있는 수를 다시 출력
		
		Random r = new Random();
		
		Stack<Integer> numbers = new Stack<Integer>();
		int random = 0;
		//10개의 생성된 수를 스택에 저장
		System.out.println("입력 : ");
		for(int i = 0; i<10; i++) {
			
			r.setSeed(r.nextLong());
			random = (r.nextInt()%100); // 0~99까지의 숫자(), 이건 그냥 공식!
			//그냥 r.nextInt()하면 -674797640, 1622681981이렇게 나오는데
			//여기에 %100하면 -99~99까지로 나오게됨
			
			numbers.push(random);
			
			
			System.out.print(random+"  ");
			
		}
		
		//스택에 저장된 수를 출력
		System.out.println();
		System.out.println("출력 :");
		for(int i = 0; i<10; i++) {
			
			System.out.print(numbers.pop()+"  ");
		}
		
		//구글에서 찾아보니 LIFO(Last In First Out) 이거 방식 설명하려고
		//pop으로 써서 출력함
		//pop은 그냥 안에있는 값 제거할 때 쓴다고 생각하는게 더 편함
		//그냥 System.out.print(numbers);해도 출력은 문제는 없음
		
		
		
		
	}

}
