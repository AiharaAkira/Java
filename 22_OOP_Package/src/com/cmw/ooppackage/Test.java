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
		age = " 10 "; //Human을 상속받는 자식클래스라서
//		addr = " 서울 "; default 같은 패키지 안에서만
//		birth = " 111 "; private 은 같은 클래스에서만
	}		
		
}
