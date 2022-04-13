package com.study;

import java.math.BigDecimal;

/*
 클래스명의 첫글자는 대문자로
 자바 프로그램을 시작할때 class, main()을 기본적으로 입력.
 
 main()메소드 안에 소스코드를 작성하여 클래스 이름과 동일한 파일명으로
 저장함
 확장자는 ~.java
 */

public class Test001 {
	//메인메소드
	public static void main(String[] args) {
		
//		코딩영역
		System.out.println("프로그램 실행 테스트");//출력
		
		int a = 10, b = 20;
		
		System.out.printf("%d원, %d원\n", a, b);
		System.out.println(a+", "+b);
		System.out.println(b);
		
		/* 
		 * println()메소드와 print()메소드의 차이는
		 * 라인 스킵(줄 바꿈) 유무에 있다.
		 * [\n]을 문자열에 포함하면 라인 스킵이 된다.
		 */
		
	}
}
