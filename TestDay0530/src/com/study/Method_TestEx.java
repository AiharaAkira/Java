package com.study;

import java.util.Scanner;

class Rect {
	
	public Rect() {
	}

	// �Ӽ�(��� ����), ���(��� �޼ҵ�)
	//��������(Ŭ��������, �ν��Ͻ� ����)

	int width;
	int height;
	//���ڰ�
	//�Ű�����
	public int recArea() {
		
		return width * height;
		
	}
	
	void input() {
		//�ν��Ͻ�(��ü, ��������) ����
		Scanner sc = new Scanner(System.in);
		
		
		
	}
	
}

//���� Ŭ����
public class Method_TestEx {

	public static void main(String[] args) {
		
		
		Rect r = new Rect();
		
		r.height = 10;
		r.width = 10;
		
		System.out.println(r.recArea());
		
		//�޼ҵ� ����
		//����� ����x
		
		//�޼ҵ� ����
		//����� ���ǵ� ����
		//void ��ȯ��: ��ȯ���� ������ �ǹ���(������ ���� ����.)
		//��ȯ : �޼ҵ� ���� �� ��� ���� ȣ���� ������ ������ �ʿ䰡 ����
	
		
	}

}
