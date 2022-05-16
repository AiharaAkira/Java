package com.study;


/*
 * �迭�� ����
 * -�迭�� �ѹ� ������ �� �迭�� ũ�⸦ ������ �� ����
 * -ũ�⸦ �� �ø��� ���� ��� ���� �ڷ��� �迭�� ���ϴ� ũ��� �غ��ϰ�
 * ������ �迭�� �����ϸ� �۾��� �Ϸ� �� �� ����.
 * 
 * System.arraycopy()�޼ҵ� �̿�
 * 
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * {....}
 * 
 * src:�ҽ��迭
 * srcPos:�ҽ��迭�� ���� ������ġ
 * dest:���� �迭
 * destPos:���������ġ
 * length:����Ǵ� �迭�� ��� ��
 *
 * */

public class ArrayCopyEx01 {

	public static void main(String[] args) {

		String[] src = {"JAVA", "DataBase", "JSP", "Spring"};
		String[] dest = new String[6];
		dest[0] ="OS";
		dest[1] = "Network";
		
		System.arraycopy(src, 0, dest, 2, 4);
		
		for (String s : dest) {
			System.out.println("s�� ��: "+s);
		}
	}

}
