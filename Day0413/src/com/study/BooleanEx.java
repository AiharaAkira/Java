package com.study;

/*boolean:유일한 논리 자료형 
 * 1바이트 크기지만 1비트만 사용한다
 * 가지는 값은 true false
 * 
 * short:2byte
 * 값의 범위: 양수 부 : 65535
 * -32768~~~~ + 32767
 * 
 * short s : 자바에서는 초기화를 하지 않으면 에러발생, 
 * 또는 자동으로 초기값을 설정함(쓰레기값) 
 * */

class shortEx{
	public static void main(String[] args) {
		short s =0;
		System.out.println(s);
	}
}

public class BooleanEx {

	public static void main(String[] args) {
		boolean b = true;
		boolean a = !b;
		System.out.println("변수값b:"+b);
		System.out.println("변수값a:"+a);
		
	}

}
