package com.study;

public class ArrayEx01 {
	public static void main(String[] args) {

		//�迭
		//�迭�̶� ũ��� ������ ���� �Ϸ��� ���ҵ��� �� ������ ����
		//������ ���� �ڷ��� ����ü�� �ǹ��ϴ� ������ �������� ����
		//�� ���� �ڷ�鿡 ���� ���������� �ڷ����� �ο����� �ʰ� �ϳ��� �̸�
		//������ ó���� �������� �����
		
		/*1.�迭����
		 * 2.�迭�� �޸� �Ҵ�
		 * 3.�迭 ����� �̿�
		 * 
		 * 
		 * 1���� �迭 ���� �� ����
		 * �迭����
		 * �ڷ���[] ������(�迭��)
		 * ������ = new �ڷ���[����� ũ��]
		 * ������[�ε���]=��
		 * */
		
		
		//�迭����
		int[] arr;
		
		//�޸��Ҵ�
		arr = new int[10];
		//int arr[] = new int[10];
		//1. int arr[] = {1,2,3,4,5};
		//int []arr = {1,2,3,4,5};
		
		//2.int[] arr2 = new int[] {1,2,3,4,5};
		
		//�迭�� ����� ���ÿ� �ʱ�ȭ�� �����ϴ�.
		//�޸𸮸� �Ҵ��� ���� �ʱ�ȭ�� �����ϴ�.
	
		//�迭 ��� ���
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		//���� �Ҵ����� ���� ������ �迭 ������ �ڵ����� �ʱ�ȭ��
		
		System.out.println("arr[0]= "+arr[0]);
		System.out.println("arr[1]= "+arr[1]);
		System.out.println("arr[2]= "+arr[2]);
		System.out.println("arr[3]= "+arr[3]);
		System.out.println("arr[4]= "+arr[4]);
		
		//�ݺ����� �̿��ؼ� �迭�� ����� �����͵��� ����Ѵ�.
		
		for(int i = 0; i < 10; i++) {
			System.out.println("arr["+i+"]= "+arr[i]);
		}
		

		System.out.println();
		
		for (int temp : arr) {
			System.out.println(temp);
		}
		
		
	}
}
