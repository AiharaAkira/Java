package com.methodex;

public class VariableEx {

	/*
	 * �޼ҵ� ���ǽ� ���ϵ� ������ �ڷ����� '...'��� ����ϹǷ� �̸� ���� �޼ҵ带
	 * �����ϴµ� �ʿ��� ������ ���� ����(���������� �迭ȭ �۾��� �ڵ����� ����)�ϰ�
	 * ���� �� �� �ִ�.
	 * */
	
	public static void argsTest(String ...n) {
		
		for(int i = 0; i<n.length;i++) {
			System.out.println("n["+i+"]: "+n[i]);
		}
		
	}
	
	public static void main(String[] args) {

		argsTest("a", "b", "c");
		System.out.println();
		argsTest("b", "100", "1000");
		
		
	}

}
