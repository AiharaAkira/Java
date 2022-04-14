package com.study;

/*
 * 1.식별자(변수)
 * -사물 등 모든 것에 대해 각각을 구별할 수 있는 이름
 * -자바 프로그래밍에서도 사용되는 구성요소(속성, 메소드)를 구별하는 이름
 * -식별자는 클래스명, 메소드명, 변수명과 같이 서로 구분이 되어야함
 * 
 * 2.식별자를 정의하는 규칙
 * -첫 글자는 _$소문자(한글도 가능하지만 메모리문제때문에 사용x)
 * -상수는 대문자
 * -공백문자 및 특수문자는 사용불가
 * -시작을 숫자로 하지 않음
 * -예약어는 사용불가
 * -글자 수는 제한이 없으나 식별이 가능하게 작성
 * 예약어:abstract, assert, boolean, break, byte, case, catch
 * 
 * 3.클래스 명을 정의하는 규칙
 * -첫 문자는 항상 대문자로 작성
 * -하나 이상의 단어가 모여서 클래스명으로 지정될때 단어의 첫 문자들만 대문자로
 * -클래스의 이름을 정의할때 반드시(***) 파일명과 이름이 같아야함
 * -숫자로 시작하면 안됨, 공백을 포함해도 안됨, 예약어를 사용해도 안됨
 * -첫문자를 _$이외의 특수문자로 시작하면 안됨
 * 
 * 주석문 
 * -소스코드의 기능이나 동작을 설명하기위해 사용하는 것
 * -소스코드에는 영향을 미치지 않음
 * -프로그래머 자신이나 다른 개발자들이 소스코드를 분석하기 쉽게 하기 위함
 * 
 *	//:단행 주석 처리
 *	/**:다중 주석 처리
 */
/**javadoc 문서화(api설명을 기술할때 사용)*/

/* 상수와 변수의 개념
 * 상수:고유한 데이터의 값으로 항상 동일한 의미를 가지는 개체다
 * 변수:상수를 저장하거나 보관하는 공간이다
 * 변수명:변수에 대한 이름
 * 자료형:변수의 크기를 미리 만들어 넣은 것이다.
 * 
 * 기본자료형(8가지)
 * -자바 컴파일러에의해서 해석되는 자료형
 * 참조자료형(기본자료형 이외)
 * -자바의 API에서 제공되거나 프로그래머에 의해서 만들어진 클래스를 자료형으로 선언하는 경우
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
		st[0].name ="가1";
		
		st[1] = new Student("가",1);
		for (Student student : st) {
			System.out.println(student.name);
			System.out.println(student.haknum);
		}
		
		int x;//x의값을 초기화하지않은 상태로 사용하고있다.
		//런타임 스택영역에 메모리가 할당 되었기 때문에 변수를 사용하려면 
		//초기화를 해야 사용할 수 있다.
		//Garbage out
//		System.out.println(x);
		
	}
}
