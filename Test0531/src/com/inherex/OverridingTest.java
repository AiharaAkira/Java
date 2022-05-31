package com.inherex;

class OverridingParent {
	void parentMethod() {
		System.out.println("parent Method!");
	}
}

class OverridingChild extends OverridingParent {

	@Override
	void parentMethod() {
		System.out.println("child Method!");
	}

}

/*
 * 
 * 오버라이딩이 성립할 수 있는 규칙
 * 1.부모클래스와 자식 클래스 사이에서만 성립한다.
 * 2.static메소드는 클래스에 속하는 메소드이기 때문에 상속 자체가 안된다.
 * 따라서, 오버라이딩 될 수 없다.
 * 3.접근 제한자가 private로 정의된 메소드는 상속자체가 되지 않음
 * 4.인터페이스를 구현해서 메소드를 오버라이딩 할때는 반드시 접근 제한자를 public으로
 * 정의 해야한다.
 * 5.메소드 인자의 개수와 타입이 완전 일치해야하고 리턴타입까지 일치해야한다.
 * 6.부모클래스의 메소드의 접근 제한자보다 더 좁아질 수 없다.
 * 7.부모의 클래스보다 더 많은 예외를 던질 수 없다.
 * 8.final예약어가 지정된 메소드는 오버라이딩 할 수 없다.
 * 
 * 
 * */

public class OverridingTest {

	public static void main(String[] args) {

		OverridingChild oc = new OverridingChild();
		
		oc.parentMethod();
		
	}

}
