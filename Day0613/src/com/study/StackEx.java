package com.study;

import java.util.Random;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//1���� - string tokenizer����(�̷�) + ����
		//���� ���� 10���� �����Ѵ�.
		//������ ���� ���ÿ� �ִ´�.
		// ���ÿ� ����ִ� ���� �ٽ� ���
		
		Random r = new Random();
		
		Stack<Integer> numbers = new Stack<Integer>();
		int random = 0;
		//10���� ������ ���� ���ÿ� ����
		System.out.println("�Է� : ");
		for(int i = 0; i<10; i++) {
			
			r.setSeed(r.nextLong());
			random = (r.nextInt()%100); // 0~99������ ����(), �̰� �׳� ����!
			//�׳� r.nextInt()�ϸ� -674797640, 1622681981�̷��� �����µ�
			//���⿡ %100�ϸ� -99~99������ �����Ե�
			
			numbers.push(random);
			
			
			System.out.print(random+"  ");
			
		}
		
		//���ÿ� ����� ���� ���
		System.out.println();
		System.out.println("��� :");
		for(int i = 0; i<10; i++) {
			
			System.out.print(numbers.pop()+"  ");
		}
		
		//���ۿ��� ã�ƺ��� LIFO(Last In First Out) �̰� ��� �����Ϸ���
		//pop���� �Ἥ �����
		//pop�� �׳� �ȿ��ִ� �� ������ �� ���ٰ� �����ϴ°� �� ����
		//�׳� System.out.print(numbers);�ص� ����� ������ ����
		
		
		
		
	}

}
