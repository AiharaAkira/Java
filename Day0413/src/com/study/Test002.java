package com.study;

/*
 * 1.�ĺ���(����)
 * -�繰 �� ��� �Ϳ� ���� ������ ������ �� �ִ� �̸�
 * -�ڹ� ���α׷��ֿ����� ���Ǵ� �������(�Ӽ�, �޼ҵ�)�� �����ϴ� �̸�
 * -�ĺ��ڴ� Ŭ������, �޼ҵ��, ������� ���� ���� ������ �Ǿ����
 * 
 * 2.�ĺ��ڸ� �����ϴ� ��Ģ
 * -ù ���ڴ� _$�ҹ���(�ѱ۵� ���������� �޸𸮹��������� ���x)
 * -����� �빮��
 * -���鹮�� �� Ư�����ڴ� ���Ұ�
 * -������ ���ڷ� ���� ����
 * -������ ���Ұ�
 * -���� ���� ������ ������ �ĺ��� �����ϰ� �ۼ�
 * �����:abstract, assert, boolean, break, byte, case, catch
 * 
 * 3.Ŭ���� ���� �����ϴ� ��Ģ
 * -ù ���ڴ� �׻� �빮�ڷ� �ۼ�
 * -�ϳ� �̻��� �ܾ �𿩼� Ŭ���������� �����ɶ� �ܾ��� ù ���ڵ鸸 �빮�ڷ�
 * -Ŭ������ �̸��� �����Ҷ� �ݵ��(***) ���ϸ�� �̸��� ���ƾ���
 * -���ڷ� �����ϸ� �ȵ�, ������ �����ص� �ȵ�, ���� ����ص� �ȵ�
 * -ù���ڸ� _$�̿��� Ư�����ڷ� �����ϸ� �ȵ�
 * 
 * �ּ��� 
 * -�ҽ��ڵ��� ����̳� ������ �����ϱ����� ����ϴ� ��
 * -�ҽ��ڵ忡�� ������ ��ġ�� ����
 * -���α׷��� �ڽ��̳� �ٸ� �����ڵ��� �ҽ��ڵ带 �м��ϱ� ���� �ϱ� ����
 * 
 *	//:���� �ּ� ó��
 *	/**:���� �ּ� ó��
 */
/**javadoc ����ȭ(api������ ����Ҷ� ���)*/

/* ����� ������ ����
 * ���:������ �������� ������ �׻� ������ �ǹ̸� ������ ��ü��
 * ����:����� �����ϰų� �����ϴ� �����̴�
 * ������:������ ���� �̸�
 * �ڷ���:������ ũ�⸦ �̸� ����� ���� ���̴�.
 * 
 * �⺻�ڷ���(8����)
 * -�ڹ� �����Ϸ������ؼ� �ؼ��Ǵ� �ڷ���
 * �����ڷ���(�⺻�ڷ��� �̿�)
 * -�ڹ��� API���� �����ǰų� ���α׷��ӿ� ���ؼ� ������� Ŭ������ �ڷ������� �����ϴ� ���
 * 
 *  */
class Student{
	String name;
	int haknum;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int haknum) {
		super();
		this.name = name;
		this.haknum = haknum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHaknum() {
		return haknum;
	}

	public void setHaknum(int haknum) {
		this.haknum = haknum;
	}
	
	
	
}


public class Test002 {
	static Student st[] = new Student[2];
	public static void main(String[] args) {
		
		System.out.println(Test001.u);
		
		st[0].haknum = 1;
		st[0].name ="��1";
		
		st[1] = new Student("��",1);
		for (Student student : st) {
			System.out.println(student.name);
			System.out.println(student.haknum);
		}
		
		int x;//x�ǰ��� �ʱ�ȭ�������� ���·� ����ϰ��ִ�.
		//��Ÿ�� ���ÿ����� �޸𸮰� �Ҵ� �Ǿ��� ������ ������ ����Ϸ��� 
		//�ʱ�ȭ�� �ؾ� ����� �� �ִ�.
		//Garbage out
//		System.out.println(x);
		
	}
}
