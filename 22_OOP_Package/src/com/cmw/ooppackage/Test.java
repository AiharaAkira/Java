package com.cmw.ooppackage;

import com.cmw.accessmf.Human;

public class Test extends Human{
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void info() {
		super.info();
		
		name = " akira ";
		age = " 10 "; //Human�� ��ӹ޴� �ڽ�Ŭ������
//		addr = " ���� "; default ���� ��Ű�� �ȿ�����
//		birth = " 111 "; private �� ���� Ŭ����������
	}		
		
}
