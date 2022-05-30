package com.study;

import java.util.Scanner;

class Rect {
	
	public Rect() {
	}

	// 속성(멤버 변수), 기능(멤버 메소드)
	//전역변수(클래스변수, 인스턴스 변수)

	int width;
	int height;
	//인자값
	//매개변수
	public int recArea() {
		
		return width * height;
		
	}
	
	void input() {
		//인스턴스(객체, 참조변수) 생성
		Scanner sc = new Scanner(System.in);
		
		
		
	}
	
}

//실행 클래스
public class Method_TestEx {

	public static void main(String[] args) {
		
		
		Rect r = new Rect();
		
		r.height = 10;
		r.width = 10;
		
		System.out.println(r.recArea());
		
		//메소드 선언
		//기능이 정의x
		
		//메소드 정의
		//기능이 정의된 상태
		//void 반환형: 반환값이 없음을 의미함(돌려줄 값이 없다.)
		//반환 : 메소드 실행 후 결과 값을 호출한 곳으로 돌려줄 필요가 없음
	
		
	}

}
